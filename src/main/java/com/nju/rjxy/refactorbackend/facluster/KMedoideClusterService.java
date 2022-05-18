package com.nju.rjxy.refactorbackend.facluster;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.nju.rjxy.refactorbackend.common.FileUtils.*;
import static com.nju.rjxy.refactorbackend.common.Utils.javaAndDirectoryFilter;

@Service
public class KMedoideClusterService {

    /**
     * 中心点聚类算法
     * @param servicePath
     * @param dependsPath
     * @param outputPath
     */
    public void FAClustering(String servicePath, String dependsPath, String outputPath, int k) throws IOException {
        // 目标服务下的文件列表
        List<String> srvFileList = scan(new File(servicePath), javaAndDirectoryFilter);
        int len = srvFileList.size();

        // 项目所有文件列表
        String jsonString = readFile(dependsPath);
        JSONObject jsonObject = JSONObject.parseObject(jsonString);
        JSONArray fileArray = jsonObject.getJSONArray("variables");
        List<String> fileSequence = new ArrayList<>();
        for (Object aFileArray : fileArray) {
            fileSequence.add(aFileArray.toString());
        }

        // 初始化依赖图矩阵
        int[][] dependGraph = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                dependGraph[i][j] = Integer.MAX_VALUE;
            }
        }

        JSONArray cellArray = jsonObject.getJSONArray("cells");
        // step1、读取依赖关系
        int count = 0;
        for (int i = 0; i < cellArray.size(); i++){
            JSONObject subObj = cellArray.getJSONObject(i);
            int srcId = subObj.getIntValue("src");
            int destId = subObj.getIntValue("dest");
            String srcFile = fileSequence.get(srcId), destFile = fileSequence.get(destId);
            if (srvFileList.contains(srcFile) && srvFileList.contains(destFile)) {
                int srcIndex = srvFileList.indexOf(srcFile), destIndex = srvFileList.indexOf(destFile);
                dependGraph[srcIndex][destIndex] = 1;
                dependGraph[destIndex][srcIndex] = 1;
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (dependGraph[i][j] == 1) {
                    count ++;
                }
            }
        }

        // step2、计算间接依赖 - 弗洛伊德算法
        floyd(dependGraph);
        count = 0;
        // 寻找最大依赖距离 - 直径
        int maxM = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (dependGraph[i][j] > 1 && dependGraph[i][j] < Integer.MAX_VALUE) {
                    count ++;
                    maxM = Math.max(maxM, dependGraph[i][j]);
                }
            }
        }

        // step3、归一化距离矩阵
        // dependGraph[i][j]表示文件i和文件j之间的依赖需要跨越的steps数，既包含直接依赖，又包含间接依赖。值越大，说明依赖相似度越低
        double[][] distanceMatrix = new double[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (dependGraph[i][j] == Integer.MAX_VALUE) {
                    distanceMatrix[i][j] = 0;
                } else {
                    distanceMatrix[i][j] = 1 - (dependGraph[i][j] * 1.0 / maxM);
                }
            }
        }

        // step4、k-中心点聚类
        kMedoide(k, distanceMatrix, srvFileList, outputPath);
    }

    /**
     * 弗洛伊德算法，求解间接路径
     * @param graph
     */
    public void floyd(int[][] graph) {
        int n = graph.length;
        for (int i = 0; i < n; i++) {
            // 第一层循环取中间结点
            for (int j = 0; j < n; j++) {
                // 第二层循环遍历行
                for (int k = 0; k < n; k++) {
                    // 第三层循环遍历列
                    if (j != i && k != i && graph[i][k] != Integer.MAX_VALUE && graph[k][j] != Integer.MAX_VALUE) {
                        graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                    }
                }
            }
        }
    }

    /**
     * 聚类核心算法
     * @param k
     * @param distanceMatrix
     * @param fileSequence
     * @param outputPath
     */
    public void kMedoide(int k, double[][] distanceMatrix, List<String> fileSequence, String outputPath) throws IOException {
        int len = distanceMatrix.length;
        List<Integer> medoides = new ArrayList<>();
        List<List<Integer>> clusters;

        // 随机选k个中心点
        Random randomObj = new Random(k);
        int index = 0;
        while (index < k) {
            int random = randomObj.nextInt(len);
            if (medoides.contains(random)) {
                continue;
            }
            medoides.add(random);
            index ++;
        }

        // 迭代替换中心点
        int iter = 1;
        while (true) {
            // 重新聚簇
            clusters = newCluster(k, medoides);
            // 把非中心点分配给中心点
            for (int i = 0; i < len; i++) {
                if (!medoides.contains(i)) {
                    // 计算到所有中心点的距离，找最大的，分配过去
                    double max = 0;
                    int maxIndex = -1;
                    for (int j = 0; j < k; j++) {
                        if (distanceMatrix[i][medoides.get(j)] > max) {
                            max = distanceMatrix[i][medoides.get(j)];
                            maxIndex = j;
                        }
                    }

                    if (maxIndex == -1) {
                        // 到所有中心点距离都是0，随机分配
                        clusters.get(randomObj.nextInt(k)).add(i);
                    } else {
                        clusters.get(maxIndex).add(i);
                    }
                }
            }

            // 分配完后更新每个簇的中心点
            boolean flag = false;
            for (int i = 0; i < k; i++) {
                List<Integer> curCluster = clusters.get(i);
                int clusterSize = curCluster.size();

                // 计算原中心点的距离和
                double origin = 0;
                for (int j = 0; j < clusterSize; j++) {
                    if (curCluster.get(j) != medoides.get(i)) {
//                        System.out.println("  origin sum add: " + medoides.get(i) + " to " + curCluster.get(j) + " = " + distanceMatrix[medoides.get(i)][curCluster.get(j)]);
                        origin += distanceMatrix[medoides.get(i)][curCluster.get(j)];
                    }
                }

                // 尝试新中心点
                for (int j = 0; j < clusterSize; j++) {
                    int newMedoide = curCluster.get(j);
                    if (newMedoide != medoides.get(i)) {
                        double curSum = 0;
                        for (int l = 0; l < clusterSize; l++) {
                            int otherNode = curCluster.get(l);
                            if (newMedoide != otherNode) {
                                curSum += distanceMatrix[newMedoide][otherNode];
                            }
                        }
                        if (curSum > origin) {
                            flag = true;
                            // 相似度距离和变大了，替换中心点
                            medoides.set(i, newMedoide);
                        }
                    }

                    // 替换后中断尝试
                    if (flag) {
                        break;
                    }
                }
            }

            // 否则继续
            iter ++;
            // 一旦没有发送替换，就终止
            if (!flag) {
                break;
            }
        }

        // 衡量功能原子之间的依赖
//        System.out.println("功能原子之间的依赖：");
//        double[][] faGraph = new double[k][k];
//        for (int i = 0; i < k; i++) {
//            for (int j = 0; j < k; j++) {
//                faGraph[i][j] = 0;
//            }
//        }
//        for (int i = 0; i < k; i++) {
//            for (int j = i+1; j < k; j++) {
//                double dcount = 0;
//                List<Integer> clusterX = clusters.get(i), clusterY = clusters.get(j);
//                for (int x : clusterX) {
//                    for (int y : clusterY) {
//                        dcount += distanceMatrix[x][y];
//                    }
//                }
//                faGraph[i][j] = dcount;
//            }
//        }
//        for (int i = 0; i < k; i++) {
//            for (int j = 0; j < k; j++) {
//                System.out.printf("%2f ", faGraph[i][j]);
//            }
//            System.out.println();
//        }

        // 写入到json
        printClusters(k, medoides, clusters, fileSequence);
        writeClusterToJson(outputPath, clusters, fileSequence);
    }

    public static void main(String[] args) throws IOException {
//        String servicePath = "D:\\Development\\idea_projects\\mall-swarm-merge1\\merge1";
//        String dependsPath = "D:\\School\\nju\\毕业设计\\通用\\实验数据\\mall-swarm\\merge1\\dependency.json";
//        String outputPath = "D:\\School\\nju\\毕业设计\\通用\\实验数据\\mall-swarm\\merge1\\cluster.json";
//        String servicePath = "D:\\Development\\idea_projects\\mall-swarm-merge2\\merge2";
//        String dependsPath = "D:\\School\\nju\\毕业设计\\通用\\实验数据\\mall-swarm\\merge2\\dependency.json";
//        String outputPath = "D:\\School\\nju\\毕业设计\\通用\\实验数据\\mall-swarm\\merge2\\cluster.json";
//        String servicePath = "D:\\Development\\idea_projects\\mogu_blog_v2-merge2\\merge2";
//        String dependsPath = "D:\\School\\nju\\毕业设计\\通用\\实验数据\\mogu_blog_v2\\merge2\\dependency.json";
//        String outputPath = "D:\\School\\nju\\毕业设计\\通用\\实验数据\\mogu_blog_v2\\merge2\\cluster.json";
//        String servicePath = "D:\\Development\\idea_projects\\mogu_blog_v2-merge3\\merge3";
//        String dependsPath = "D:\\School\\nju\\毕业设计\\通用\\实验数据\\mogu_blog_v2\\merge3\\dependency.json";
//        String outputPath = "D:\\School\\nju\\毕业设计\\通用\\实验数据\\mogu_blog_v2\\merge3\\cluster.json";
//        String servicePath = "D:\\Development\\idea_projects\\lamp-cloud-merge1\\merge1";
//        String dependsPath = "D:\\School\\nju\\毕业设计\\通用\\实验数据\\lamp-cloud\\merge1\\dependency.json";
//        String outputPath = "D:\\School\\nju\\毕业设计\\通用\\实验数据\\lamp-cloud\\merge1\\cluster.json";
//        String servicePath = "D:\\Development\\idea_projects\\lamp-cloud-merge2\\merge2";
//        String dependsPath = "D:\\School\\nju\\毕业设计\\通用\\实验数据\\lamp-cloud\\merge2\\dependency.json";
//        String outputPath = "D:\\School\\nju\\毕业设计\\通用\\实验数据\\lamp-cloud\\merge2\\cluster.json";
//        String servicePath = "D:\\Development\\idea_projects\\simplemall-merge3\\merge3";
//        String dependsPath = "D:\\School\\nju\\毕业设计\\通用\\实验数据\\simplemall\\merge3\\dependency.json";
//        String outputPath = "D:\\School\\nju\\毕业设计\\通用\\实验数据\\simplemall\\merge3\\cluster.json";
//        String servicePath = "D:\\Development\\idea_projects\\simplemall-merge4\\merge4";
//        String dependsPath = "D:\\School\\nju\\毕业设计\\通用\\实验数据\\simplemall\\merge4\\dependency.json";
//        String outputPath = "D:\\School\\nju\\毕业设计\\通用\\实验数据\\simplemall\\merge4\\cluster.json";
        String servicePath = "D:\\Development\\idea_projects\\microservices-platform-merge3\\merge3";
        String dependsPath = "D:\\School\\nju\\毕业设计\\通用\\实验数据\\microservices-platform\\merge3\\dependency.json";
        String outputPath = "D:\\School\\nju\\毕业设计\\通用\\实验数据\\microservices-platform\\merge3\\cluster.json";
        int faFileGranularity = 5;
        new KMedoideClusterService().FAClustering(servicePath, dependsPath, outputPath, faFileGranularity);
    }
}
