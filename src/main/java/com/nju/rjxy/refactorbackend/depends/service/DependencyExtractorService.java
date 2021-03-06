package com.nju.rjxy.refactorbackend.depends.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nju.rjxy.refactorbackend.common.FileUtils;
import com.nju.rjxy.refactorbackend.depends.DependsCommand;
import com.nju.rjxy.refactorbackend.depends.LangRegister;
import com.nju.rjxy.refactorbackend.depends.ParameterException;
import com.nju.rjxy.refactorbackend.depends.addons.DV8MappingFileBuilder;
import com.nju.rjxy.refactorbackend.depends.extractor.AbstractLangProcessor;
import com.nju.rjxy.refactorbackend.depends.extractor.LangProcessorRegistration;
import com.nju.rjxy.refactorbackend.depends.extractor.UnsolvedBindings;
import com.nju.rjxy.refactorbackend.depends.format.DependencyDumper;
import com.nju.rjxy.refactorbackend.depends.format.detail.UnsolvedSymbolDumper;
import com.nju.rjxy.refactorbackend.depends.format.path.*;
import com.nju.rjxy.refactorbackend.depends.generator.DependencyGenerator;
import com.nju.rjxy.refactorbackend.depends.generator.FileDependencyGenerator;
import com.nju.rjxy.refactorbackend.depends.generator.FunctionDependencyGenerator;
import com.nju.rjxy.refactorbackend.depends.matrix.core.DependencyMatrix;
import com.nju.rjxy.refactorbackend.depends.matrix.transform.MatrixLevelReducer;
import com.nju.rjxy.refactorbackend.depends.matrix.transform.strip.LeadingNameStripper;
import com.nju.rjxy.refactorbackend.depends.util.FileUtil;
import com.nju.rjxy.refactorbackend.depends.util.FolderCollector;
import com.nju.rjxy.refactorbackend.depends.util.TemporaryFile;
import edu.emory.mathcs.backport.java.util.Arrays;
import net.sf.ehcache.CacheManager;
import org.codehaus.plexus.util.StringUtils;
import org.springframework.stereotype.Service;
import picocli.CommandLine;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.*;

import static com.nju.rjxy.refactorbackend.common.FileUtils.readFile;
import static com.nju.rjxy.refactorbackend.common.FileUtils.readFileList;
import static com.nju.rjxy.refactorbackend.common.FileUtils.scan;
import static com.nju.rjxy.refactorbackend.common.FileUtils.writeByLine;
import static com.nju.rjxy.refactorbackend.common.FileUtils.writeObjString;
import static com.nju.rjxy.refactorbackend.common.Utils.javaAndDirectoryFilter;

@Service
public class DependencyExtractorService {

	public static void main(String[] args) throws IOException {
        // ???????????????????????? ---------------------------------------------------------------------------------------------
	    // step1??????????????????????????????dependency.json????????????
//		String lang = "java";
////        String source = "D:\\Development\\idea_projects\\mall-swarm-merge1";
//		// ??????????????????????????????json??????
//		String outputName = "dependency";
//		String outputDir = "D:\\Desktop";
//		String resDir = mineParser(lang, source, outputName, outputDir);
//        System.out.println(resDir);

        // step2?????????relation.json
//        String dependsPath = "D:\\Desktop\\dependency.json";
//        String outputPath = "D:\\Desktop\\relation.json";
//        String filePath = "D:\\Development\\idea_projects\\codeTopics\\src\\test\\example\\files.flist";
//        getRelationJson(dependsPath, outputPath, filePath);

        // step4???SMQ?????????????????? ----------------------------------------------------------------------------------------------
//        String servicePath = "D:\\Development\\idea_projects\\mall-swarm-merge1\\merge1";
//        String dependsPath = "D:\\School\\nju\\????????????\\??????\\????????????\\mall-swarm\\merge1\\dependency.json";
//        String outputFilesPath = "D:\\School\\nju\\????????????\\??????\\????????????\\mall-swarm\\merge1\\overloadServiceFileList.flist";
//        String outputGraphPath = "D:\\School\\nju\\????????????\\??????\\????????????\\mall-swarm\\merge1\\overloadServiceCallGraph.json";
//        getServiceCallGraph(servicePath, dependsPath, outputFilesPath, outputGraphPath);

    }

    /**
     * ??????dependency.json
     */
	public void mineParser(String lang, String source, String outputName, String outputDir) {
        try {
            LangRegister langRegister = new LangRegister();
            langRegister.register();
            DependsCommand app = new DependsCommand();
            // ????????????????????????
            app.setLang(lang);
            // ?????????????????????????????????
            app.setSrc(source);
            // ?????????????????????????????????
            app.setOutput(outputName);
            mineExecutor(app, outputDir);//??????DependsCommand??????????????????????????????setDir??????????????????????????????????????????????????????????????????executeCommand?????????
        } catch (Exception e){
            if (e instanceof CommandLine.PicocliException) {
                CommandLine.usage(new DependsCommand(), System.out);
            } else if (e instanceof ParameterException){
                System.err.println(e.getMessage());
            } else {
                System.err.println("Exception encountered. If it is a design error, please report issue to us." );
                e.printStackTrace();
            }
        }
    }

    /**
     * ??????executeCommand???????????????????????????
     * @param app
     * @param outputDir
     * @throws ParameterException
     */
    private static void mineExecutor(DependsCommand app, String outputDir) throws ParameterException {
        String lang = app.getLang();
        String inputDir = app.getSrc();
        String[] includeDir = app.getIncludes();
        String outputName = app.getOutputName();

        // ???????????????????????????????????????
        outputDir = (outputDir == null) ? "D:\\" : outputDir;
        String[] outputFormat = app.getFormat();

        inputDir = FileUtil.uniqFilePath(inputDir);
        boolean supportImplLink = false;
        if (app.getLang().equals("cpp") || app.getLang().equals("python")) supportImplLink = true;

        if (app.isAutoInclude()) {
            FolderCollector includePathCollector = new FolderCollector();
            List<String> additionalIncludePaths = includePathCollector.getFolders(inputDir);
            additionalIncludePaths.addAll(Arrays.asList(includeDir));
            includeDir = additionalIncludePaths.toArray(new String[] {});
        }

        AbstractLangProcessor langProcessor = LangProcessorRegistration.getRegistry().getProcessorOf(lang);
        if (langProcessor == null) {
            System.err.println("Not support this language: " + lang);
            return;
        }

        if (app.isDv8map()) {
            DV8MappingFileBuilder dv8MapfileBuilder = new DV8MappingFileBuilder(langProcessor.supportedRelations());
            dv8MapfileBuilder.create(outputDir+File.separator+"depends-dv8map.mapping");
        }

        long startTime = System.currentTimeMillis();

        FilenameWritter filenameWritter = new EmptyFilenameWritter();
        if (!StringUtils.isEmpty(app.getNamePathPattern())) {
            if (app.getNamePathPattern().equals("dot")||
                    app.getNamePathPattern().equals(".")) {
                filenameWritter = new DotPathFilenameWritter();
            } else if (app.getNamePathPattern().equals("unix")||
                    app.getNamePathPattern().equals("/")) {
                filenameWritter = new UnixPathFilenameWritter();
            } else if (app.getNamePathPattern().equals("windows")||
                    app.getNamePathPattern().equals("\\")) {
                filenameWritter = new WindowsPathFilenameWritter();
            } else{
                throw new ParameterException("Unknown name pattern paremater:" + app.getNamePathPattern());
            }
        }

        /* by default use file dependency generator */
        DependencyGenerator dependencyGenerator = new FileDependencyGenerator();
        if (!StringUtils.isEmpty(app.getGranularity())) {
            /* method parameter means use method generator */
            if (app.getGranularity().equals("method"))
                dependencyGenerator = new FunctionDependencyGenerator();
            else if (app.getGranularity().equals("file"))
                /*no action*/;
            else if (app.getGranularity().startsWith("L"))
                /*no action*/;
            else
                throw new ParameterException("Unknown granularity parameter:" + app.getGranularity());
        }

        if (app.isStripLeadingPath() || app.getStrippedPaths().length > 0) {
            dependencyGenerator.setLeadingStripper(new LeadingNameStripper(app.isStripLeadingPath(),inputDir,app.getStrippedPaths()));
        }

        if (app.isDetail()) {
            dependencyGenerator.setGenerateDetail(true);
        }

        dependencyGenerator.setFilenameRewritter(filenameWritter);
        langProcessor.setDependencyGenerator(dependencyGenerator);

        langProcessor.buildDependencies(inputDir, includeDir, app.getTypeFilter(), supportImplLink, app.isOutputExternalDependencies());
        DependencyMatrix matrix = langProcessor.getDependencies();

        if (app.getGranularity().startsWith("L")) {
            matrix = new MatrixLevelReducer(matrix,app.getGranularity().substring(1)).shrinkToLevel();
        }
        DependencyDumper output = new DependencyDumper(matrix);
        output.outputResult(outputName,outputDir,outputFormat);
        if (app.isOutputExternalDependencies()) {
            Set<UnsolvedBindings> unsolved = langProcessor.getExternalDependencies();
            UnsolvedSymbolDumper unsolvedSymbolDumper = new UnsolvedSymbolDumper(unsolved,app.getOutputName(),app.getOutputDir(),
                    new LeadingNameStripper(app.isStripLeadingPath(),inputDir,app.getStrippedPaths()));
            unsolvedSymbolDumper.output();
        }
        long endTime = System.currentTimeMillis();
        TemporaryFile.getInstance().delete();
        CacheManager.create().shutdown();
        System.out.println("Consumed time: " + (float) ((endTime - startTime) / 1000.00) + " s,  or "
                + (float) ((endTime - startTime) / 60000.00) + " min.");
    }

    /**
     * ??????dependency.json?????????relation.json
     * @param dependsPath
     * @param outputPath
     */
    public void getRelationJson(String dependsPath, String outputPath, String filePath) throws IOException {
        String jsonString = readFile(dependsPath);
        System.out.println("?????????dependency ??????");
        JSONObject jsonObject = JSONObject.parseObject(jsonString);
        JSONArray fileArray = jsonObject.getJSONArray("variables");
        // ????????????????????????
        List<String> fullFiles = new ArrayList<>();
        for (Object aFileArray : fileArray) {
            fullFiles.add(aFileArray.toString());
        }

        // ????????????????????????
        List<String> targetFiles = readFileList(filePath);

        // ???????????????
        int len = targetFiles.size();
        int[][] dependGraph = new int[len][len];

        // ???????????????????????????????????????????????????????????????????????????1
        // ???????????????????????????????????????????????????
        JSONArray cellArray = jsonObject.getJSONArray("cells");
        for (int i = 0; i < cellArray.size(); i++){
            JSONObject subObj = cellArray.getJSONObject(i);
            int srcId = subObj.getIntValue("src");
            int destId = subObj.getIntValue("dest");
            String srcFile = fullFiles.get(srcId), destFile = fullFiles.get(destId);
            int targetSrc = targetFiles.indexOf(srcFile);
            int targetDest = targetFiles.indexOf(destFile);
            if (targetSrc >= 0 && targetDest >= 0) {
                dependGraph[targetSrc][targetDest] = 1;
            }
        }

        // ??????relation.json
        FileUtils.FileDependence object = new FileUtils.FileDependence(targetFiles, dependGraph);
        String relationString = JSONObject.toJSONString(object, true);
        writeObjString(relationString, outputPath);
    }

    /**
     * ???????????????????????? callGraph.json
     * @throws IOException
     */
    public void getServiceCallGraph(String servicePath, String dependsPath, String outputFilesPath,  String outputGraphPath) throws IOException {
        // ??????????????????????????????
        List<String> srvFileList = scan(new File(servicePath), javaAndDirectoryFilter);
        int len = srvFileList.size();

        // ????????????????????????
        String jsonString = readFile(dependsPath);
        System.out.println("?????????" + dependsPath + " ??????");
        JSONObject jsonObject = JSONObject.parseObject(jsonString);
        JSONArray fileArray = jsonObject.getJSONArray("variables");
        List<String> fileSequence = new ArrayList<>();
        for (Object aFileArray : fileArray) {
            fileSequence.add(aFileArray.toString());
        }

        // ?????????call???????????????
        int[][] callGraph = new int[len][len];
        JSONArray cellArray = jsonObject.getJSONArray("cells");
        // step1?????????????????????
        for (int i = 0; i < cellArray.size(); i++){
            JSONObject subObj = cellArray.getJSONObject(i);
            int srcId = subObj.getIntValue("src");
            int destId = subObj.getIntValue("dest");
            String srcFile = fileSequence.get(srcId), destFile = fileSequence.get(destId);
            if (srvFileList.contains(srcFile) && srvFileList.contains(destFile)) {
                int srcIndex = srvFileList.indexOf(srcFile), destIndex = srvFileList.indexOf(destFile);
                JSONObject dependencyArr = subObj.getJSONObject("values");
                // ??????call???????????????calldouble??????0
                double callDouble = dependencyArr.getDoubleValue("Call");
                int weight = (int) callDouble;
                if (weight > 0) {
                    callGraph[srcIndex][destIndex] = weight;
                }
            }
        }

        // step2??????????????????
        writeByLine(srvFileList, outputFilesPath);
        String callJsonStr = JSONObject.toJSONString(callGraph);
        writeObjString(callJsonStr, outputGraphPath);
    }

}
