package com.nju.rjxy.refactorbackend.nsga;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.nju.rjxy.refactorbackend.codeTopics.lda.Model;
import com.nju.rjxy.refactorbackend.nsga.datastructure.Chromosome;
import com.nju.rjxy.refactorbackend.nsga.datastructure.FunctionalAtom;
import com.nju.rjxy.refactorbackend.nsga.datastructure.RelationFile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

import static com.nju.rjxy.refactorbackend.common.FileDirManage.*;
import static com.nju.rjxy.refactorbackend.common.FileUtils.readFile;
import static com.nju.rjxy.refactorbackend.common.FileUtils.readFileList;
import static com.nju.rjxy.refactorbackend.common.Utils.readModel;
import static com.nju.rjxy.refactorbackend.nsga.Common.readFileAsString;
import static com.nju.rjxy.refactorbackend.nsga.PostProcessShowData.*;

public class PreProcessLoadData {

    /**
     * lda训练模型
     */
    public static Model model;
    /**
     * 关注点 - TC值
     */
    public static Map<Integer, Double> concernTCMap;
    /**
     * 已识别的关注点列表
     */
    public static Set<Integer> concerns;
    /**
     * 原系统所有服务的代码文件列表、每个代码文件的词袋
     */
    public static List<String> allServiceFileList;
    public static List<HashMap<String, Integer>> allServiceFileWords;

    /**
     * 计算SMQ的文件列表，调用矩阵，每个代码文件之间的tf-idf矩阵
     */
    public static List<String> overloadServiceFileList;
    public static int[][] overloadServiceCallGraph;
    public static double[][] overloadServiceFileTFIDFList;
    public static double[][] overloadServiceFileSimMatrix;
    public static int maxFileCallNums = 0;

    /**
     * 计算TC值的0-1依赖矩阵
     */
    public static int[][] relationGraph;

    /**
     * 初始化种群
     */
    public static List<FunctionalAtom> clusters;
    public static int faNums;
    /**
     * 已产生的基因型记录
     */
    public static HashMap<Chromosome, Boolean> historyRecord;

    static {
        try {
            // 读取LDA模型数据
            model = readModel();
            concernTCMap = readConcernTCMap();
            concerns = concernTCMap.keySet();

            // 读取所有业务服务的代码文件列表、词汇列表
            readGlobalSrvFilesAndWords();
            // 读取过载服务文件列表、call依赖矩阵、语义相似度矩阵
            readOverloadSrvFilesAndCallMatrixAndTFIDFMatrix();

            // 读取功能原子聚类结果
            readCluster();
            // 读取relation 0-1矩阵，用于计算主题TC值，判断服务是否过载
            readRelationMatrix();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取关注点 - tc值信息
     */
    public static Map<Integer, Double> readConcernTCMap() throws IOException {
        Map<Integer, Double> concernTCMap = new HashMap<>();

        FileInputStream is = new FileInputStream(concernDir);
        InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null) {
            String[] datas = line.split(" ");
            concernTCMap.put(Integer.parseInt(datas[0]), Double.parseDouble(datas[1]));
        }
        is.close();
        isr.close();
        br.close();
        System.out.println("concern - tc加载成功。 关注点数量：" + concernTCMap.size());
        return concernTCMap;
    }

    /**
     * 读取files.flist、words.dat
     * @return
     */
    public static void readGlobalSrvFilesAndWords() throws IOException {
        allServiceFileList = readFileList(filenameDir);
        System.out.println("refactoring all service file list 加载成功。" + allServiceFileList.size());
        List<String> wordsList = readFileList(wordsDir);
        int allFileIndex = 0;
        allServiceFileWords = new ArrayList<>();
        for (int i = 1; i < wordsList.size(); i+=2) {
            String[] words = wordsList.get(allFileIndex ++).split(" ");
            HashMap<String, Integer> wordsFrequency = new HashMap<>();
            for (String w : words) {
                wordsFrequency.put(w, wordsFrequency.getOrDefault(w, 0) + 1);
            }
            allServiceFileWords.add(wordsFrequency);
        }
        System.out.println("refactoring all service words 加载成功。" + allServiceFileWords.size());
    }

    /**
     * 将代码文件列表写入文件
     */
    private static void writeFileList(List<String> fileList, String outputPath) throws IOException {
        FileWriter writer = new FileWriter(outputPath, false);
        StringBuilder sb = new StringBuilder();
        fileList.forEach(f -> sb.append(f).append("\n"));
        writer.write(sb.toString());
        writer.close();
    }

    /**
     * 读取过载服务文件列表、依赖矩阵、语义相似度矩阵
     * @throws IOException
     */
    public static void readOverloadSrvFilesAndCallMatrixAndTFIDFMatrix() throws IOException {
        // 读取过载服务下的代码文件列表
        overloadServiceFileList = readFileList(overloadServiceFilenameDir);
        int len = overloadServiceFileList.size();
        // 读取依赖关系
        overloadServiceCallGraph = new int[len][len];
        JSONArray jsonArray = JSONArray.parseArray(readFile(overloadServiceCallMatrixDir));
        for (int i = 0; i < jsonArray.size(); i ++) {
            String objStr = jsonArray.get(i).toString();
            objStr = objStr.substring(1, objStr.length() - 1);
            int[] arr = Arrays.stream(objStr.split(",")).mapToInt(Integer::parseInt).toArray();
            overloadServiceCallGraph[i] = arr;
            maxFileCallNums = Math.max(maxFileCallNums, Arrays.stream(arr).max().getAsInt());
        }
        System.out.println("读取过载服务文件列表、依赖关系成功。" + len);
        System.out.println("代码文件之间的最大call次数：" + maxFileCallNums);
        // 计算过载服务下所有代码文件的文本语义相似度矩阵
        // step1、合并生成参考词集合
        HashSet<String> wordSet = new HashSet<>();
        for (String s : overloadServiceFileList) {
            int allFileId = allServiceFileList.indexOf(s);
            HashMap<String, Integer> wordFrequency = allServiceFileWords.get(allFileId);
            wordSet.addAll(wordFrequency.keySet());
        }
        List<String> wordSetList = new ArrayList<>(wordSet);
        int wordSetLen = wordSetList.size();
        // 计算每个word在文档的出现数量
        HashMap<String, Integer> wordOccurrenceMap = new HashMap<>();
        for (String word : wordSetList) {
            wordOccurrenceMap.put(word, getCurWordOccurrences(word));
        }

        overloadServiceFileTFIDFList = new double[len][wordSetLen];
        for (int i = 0; i < len; i++) {
            int allFileId = allServiceFileList.indexOf(overloadServiceFileList.get(i));
            HashMap<String, Integer> wordFrequency = allServiceFileWords.get(allFileId);
            int curDocWordsNum = wordFrequency.values().stream().reduce(Integer::sum).get();
            for (int j = 0; j < wordSetLen; j++) {
                String curWord = wordSetList.get(j);
                if (wordFrequency.containsKey(curWord)) {
                    // step2、计算每个文件的词频-tf向量
                    overloadServiceFileTFIDFList[i][j] = wordFrequency.get(curWord) * 1.0 / curDocWordsNum;
                    // step3、计算每个文件的idf，得到tf-idf
                    overloadServiceFileTFIDFList[i][j] *= (len * 1.0 / (wordOccurrenceMap.get(curWord) + 1));
                }
            }
        }

        // step4、计算两两文件之间的余弦相似度
        overloadServiceFileSimMatrix = new double[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                double sim = calculateCosineSim(overloadServiceFileTFIDFList[i], overloadServiceFileTFIDFList[j]);
                overloadServiceFileSimMatrix[i][j] = sim;
                overloadServiceFileSimMatrix[j][i] = sim;
//                System.out.println("i - " + i + " ; j - " + j + " ; sim: " + sim);
            }
        }
        System.out.println("代码文件之间的语义相似度计算完成。");
    }

    /**
     * 计算某个word在所有过载服务代码文件下出现的次数
     * @param curWord
     * @return
     */
    public static int getCurWordOccurrences(String curWord) {
        int count = 0;
        for (int i = 0; i < overloadServiceFileList.size(); i++) {
            int allFileId = allServiceFileList.indexOf(overloadServiceFileList.get(i));
            HashMap<String, Integer> wordFrequency = allServiceFileWords.get(allFileId);
            if (wordFrequency.containsKey(curWord)) {
                count ++;
            }
        }
        return count;
    }

    /**
     * 从两个向量计算余弦相似度
     * @param tfIdfVec1
     * @param tfIdfVec2
     * @return
     */
    public static double calculateCosineSim(double[] tfIdfVec1, double[] tfIdfVec2) {
        double sum = 0;
        for (int i = 0; i < tfIdfVec1.length; i++) {
            sum += tfIdfVec1[i] * tfIdfVec2[i];
        }
        return sum / calculateVecSize(tfIdfVec1) / calculateVecSize(tfIdfVec2);
    }

    /**
     * 计算一个向量的绝对值
     * @param vec
     * @return
     */
    public static double calculateVecSize(double[] vec) {
        double sum = 0;
        for (double v : vec) {
            sum += v * v;
        }
        return Math.sqrt(sum);
    }

    /**
     * 读取功能原子聚类结果
     */
    public static void readCluster() {
        String clusterStr = readFile(clusterDir);
        JSONObject jsonObject = JSONObject.parseObject(clusterStr);
        JSONArray fileArray = jsonObject.getJSONArray("clusters");
        clusters = new ArrayList<>();
        for (int i = 0; i < fileArray.size(); i++) {
            JSONArray cluster = fileArray.getJSONArray(i);
            List<String> clusterFileList = cluster.stream()
                    .map(Object::toString)
                    .collect(Collectors.toList());
            clusters.add(new FunctionalAtom(clusterFileList));
        }
        faNums = clusters.size();
        System.out.println("读取功能原子聚类结果成功！");
    }

    /**
     * 读取relation.json中的0-1矩阵
     */
    public static void readRelationMatrix() {
        RelationFile relationFile = JSONObject.parseObject(readFileAsString(relationDir), RelationFile.class);
        relationGraph = relationFile.dependGraph;
    }

    /**
     * 搜索重置过程数据
     */
    public static void experimentInitDataStructure(String granularity) {
        // 重复实验需要刷新一些数据
        historyRecord = new HashMap<>();
        outputPrograms = new ArrayList<>();
        if (granularity.equals("fa")) {
            Program origin = generateFAOriginProgram();
            outputPrograms.add(origin);
        } else {
            Program origin = generateFileOriginProgram();
            outputPrograms.add(origin);
        }
        outputObjectiveData = new ArrayList<>();
        List<Double> originObjectives = new ArrayList<Double>() {{
            add(0.0);
            add(0.0);
            add(0.0);
        }};
        outputObjectiveData.add(originObjectives);
        outputFrontData = new ArrayList<>();
    }

    public static Program generateFAOriginProgram() {
        Program origin = new Program("originProgram");
        SubService originService = new SubService("originService", new ArrayList<>());
        for (int j = 0; j < faNums; j++) {
            originService.children.add(new FAFile("FA - " + j, clusters.get(j).fileList));
        }
        origin.children = new ArrayList<>();
        origin.children.add(originService);
        return origin;
    }

    public static Program generateFileOriginProgram() {
        Program origin = new Program("originProgram");
        SubService originService = new SubService("originService", new ArrayList<>());
        for (int j = 0; j < overloadServiceFileList.size(); j++) {
            int fileId = j;
            ArrayList<String> children = new ArrayList<String>() {{ add(overloadServiceFileList.get(fileId)); }};
            originService.children.add(new FAFile("File - " + fileId, children));
        }
        origin.children = new ArrayList<>();
        origin.children.add(originService);
        return origin;
    }
}
