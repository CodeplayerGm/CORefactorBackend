package com.nju.rjxy.refactorbackend.common;

import java.io.File;

import static com.nju.rjxy.refactorbackend.nsga.PostProcessShowData.*;

public class FileDirManage {

    /**
     * RefactorBackend/src/main/dataFiles
     */
    public static String rootPath = System.getProperty("user.dir") + "\\src\\main\\dataFiles";

    /**
     * 1、代码文件语义预处理路径参数
     */
    public static String wordsDir = rootPath + "\\words.dat";
    public static String filenameDir = rootPath + "\\files.flist";

    /**
     * 2、LDA主题建模路径参数
     */
    public static String perplexityDir = rootPath + "\\perplexity.txt";

    /**
     * 3、功能性主题筛选路径参数
     */
    public static String concernDir = rootPath + "\\concern.txt";

    /**
     * 4、依赖抽取路径参数
     */
    public static String dependencyDir = rootPath + "\\dependency.json";
    public static String relationDir = rootPath + "\\relation.json";
    public static String overloadServiceFilenameDir = rootPath + "\\overloadServiceFileList.flist";
    public static String overloadServiceCallMatrixDir = rootPath + "\\overloadServiceCallGraph.json";

    /**
     * 5、功能原子聚类路径参数
     */
    public static String clusterDir = rootPath + "\\cluster.json";

    /**
     * 6、重构搜索算法参数
     */
    public static String NSGASearchType = "NSGA-II";
    public static String randomSearchType = "随机搜索";
    public static String fileGranularity = "代码文件";
    public static String faGranularity = "功能原子";
    public static String jsonPostfix = "1.json";
    public static String txtPostfix = "1.txt";


    public static boolean checkNLPProcess() {
        File wordFile = new File(wordsDir);
        File filenameFile = new File(filenameDir);
        return wordFile.exists() && filenameFile.exists();
    }

    public static boolean checkModelPerplexity() {
        File perplexityFile = new File(perplexityDir);
        return perplexityFile.exists();
    }

    public static boolean checkRelationDependency() {
        File relationFile = new File(relationDir);
        return relationFile.exists();
    }

    public static boolean checkCallMatrix() {
        File overloadServiceFilenameFile = new File(overloadServiceFilenameDir);
        File overloadServiceCallMatrixFile = new File(overloadServiceCallMatrixDir);
        return overloadServiceFilenameFile.exists() && overloadServiceCallMatrixFile.exists();
    }

    public static boolean checkDependencyJSON() {
        File dependencyFile = new File(dependencyDir);
        return dependencyFile.exists();
    }

    public static boolean checkConcernFile() {
        File concernFile = new File(concernDir);
        return concernFile.exists();
    }

    public static boolean checkClusterFile() {
        File clusterFile = new File(clusterDir);
        return clusterFile.exists();
    }

    public static boolean checkPrograms() {

        return (new File(outputFAProgramJson + jsonPostfix).exists() &&
                new File(outputFAObjectiveTxt + txtPostfix).exists() &&
                new File(outputFAFrontTxt + txtPostfix).exists() &&
                new File(outputFACostTxt + txtPostfix).exists()) ||
                (new File(outputFARandomProgramJson + jsonPostfix).exists() &&
                new File(outputFARandomObjectiveTxt + txtPostfix).exists() &&
                new File(outputFARandomFrontTxt + txtPostfix).exists() &&
                new File(outputFARandomCostTxt + txtPostfix).exists()) ||
                (new File(outputFileProgramJson + jsonPostfix).exists() &&
                new File(outputFileObjectiveTxt + txtPostfix).exists() &&
                new File(outputFileFrontTxt + txtPostfix).exists() &&
                new File(outputFileCostTxt + txtPostfix).exists()) ||
                (new File(outputFileRandomProgramJson + jsonPostfix).exists() &&
                        new File(outputFileRandomObjectiveTxt + txtPostfix).exists() &&
                        new File(outputFileRandomFrontTxt + txtPostfix).exists() &&
                        new File(outputFileRandomCostTxt + txtPostfix).exists());
    }
}
