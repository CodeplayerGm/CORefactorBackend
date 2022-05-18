package com.nju.rjxy.refactorbackend.codeTopics.service;

import com.google.gson.Gson;
import com.nju.rjxy.refactorbackend.codeTopics.lda.Inferencer;
import com.nju.rjxy.refactorbackend.codeTopics.lda.LDAOption;
import com.nju.rjxy.refactorbackend.codeTopics.lda.Model;
import com.nju.rjxy.refactorbackend.codeTopics.postprocess.FileDependence;
import com.nju.rjxy.refactorbackend.codeTopics.postprocess.FunctionalTopic;
import com.nju.rjxy.refactorbackend.codeTopics.postprocess.FunctionalTopicUtil;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.nju.rjxy.refactorbackend.common.FileDirManage.*;
import static com.nju.rjxy.refactorbackend.common.FileUtils.*;
import static com.nju.rjxy.refactorbackend.common.Utils.javaAndDirectoryFilter;
import static com.nju.rjxy.refactorbackend.common.Utils.readModel;

@Service
public class FunctionalTopicService {

    public void functionalTopicSelect(double tc1, double tc2, double service, double file, String[] srvPaths) throws IOException {
        // 1、加载聚类模型
        Model model = readModel();

        // 2、读取文件列表
        List<String> fileSequence = readFileList(filenameDir);

        // 3、手动输入服务列表，每个服务为一个单词。包括服务下的文件列表
        Map<String, List<String>> serviceFiles = serviceExtract(srvPaths);

        // 下面的步骤需要先去depends项目里完成：对depends获取的依赖关系做进一步处理变成relation.json文件
        String content = readFile(relationDir);
        Gson gson = new Gson();
        FileDependence fileDependence = gson.fromJson(content, FileDependence.class);

        FunctionalTopicUtil topicUtil = new FunctionalTopicUtil(fileSequence, serviceFiles, model, fileDependence);

        // 筛选出功能性主题列表，非功能性的主题过滤掉。每个主题以FunctionalTopic的数据结构存储
        // tc_threshold 主题内聚性阈值，tc_threshold=0.4是根据论文中准确度达到峰值时对应的tc值设置的（论文P44）
        // file_threshold 主题与文件相关度阈值
        // service_threshold 主题与服务相关度阈值
        List<FunctionalTopic> topicList = topicUtil.findFunctionalTopic(tc1, file, service);
        writeConcernToFile(model, topicList, tc2);
    }

    /**
     * 手动获取服务信息。要得到服务名 和 路径下的文件列表
     * @return
     */
    private Map<String, List<String>> serviceExtract(String[] srvPaths) {
        // 对每个服务，读取其目录下的文件
        Map<String, List<String>> serviceFilesMap = new HashMap<>();
        String unique = "uniqueSrvId";
        int index = 1;
        for (String path : srvPaths) {
            List<String> files = scan(new File(path), javaAndDirectoryFilter);
            serviceFilesMap.put(unique + index, files);
            index ++;
        }

//        printServiceFileNumbers(serviceFilesMap);
        return serviceFilesMap;
    }

    /**
     * 打印并把功能性主题筛选结果写入文件
     * @param model
     * @param topicList
     * @param tc_threshold
     */
    private void writeConcernToFile(Model model, List<FunctionalTopic> topicList, double tc_threshold) {
        System.out.println("功能性主题筛选结果：");
        // 反转得到服务对应的关注点
        HashMap<String, List<Integer>> serviceToConcern = new HashMap<>();
        // 写入文件的内容
        List<Integer> idList = new ArrayList<>();
        List<Double> tcList = new ArrayList<>();
        for (FunctionalTopic topic : topicList) {
            if (topic.tc >= tc_threshold) {
//                System.out.println(model.printTopics(3).get(topic.topicID));
//                System.out.println("TC = " + topic.tc);

//                System.out.print("services:");
                topic.services.forEach(item -> {
//                    System.out.print(item + ";");
                    List<Integer> list = serviceToConcern.getOrDefault(item, new ArrayList<>());
                    list.add(topic.topicID);
                    serviceToConcern.put(item, list);
                });
//                System.out.println();

                idList.add(topic.topicID);
                tcList.add(topic.tc);
            }
        }

        for (Map.Entry<String, List<Integer>> entry : serviceToConcern.entrySet()) {
            System.out.println("服务：" + entry.getKey());
            entry.getValue().forEach(concern -> System.out.print(concern + ","));
            System.out.println();
            System.out.println("关注点数量：" + entry.getValue().size());
        }

        // 关注点写入文件
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(concernDir));
            for (int i = 0; i < idList.size(); i++) {
                writer.write(idList.get(i) + " " + tcList.get(i));
                writer.write("\n");
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("写入：" + concernDir + " 完成。 一共：" + idList.size());
    }

    /**
     * 打印每个服务对应的文件数量
     * @param serviceFiles
     */
    private void printServiceFileNumbers(Map<String, List<String>> serviceFiles) {
        System.out.println("服务 - 文件数量对应关系：");
        int total = 0;
        for (Map.Entry<String, List<String>> entry : serviceFiles.entrySet()) {
            System.out.println("service: " + entry.getKey() + " ; file number: " + entry.getValue().size());
            total += entry.getValue().size();
        }
        System.out.println("total:" + total);
        System.out.println("---------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        String content = readFile(relationDir);
        Gson gson = new Gson();
        FileDependence fileDependence = gson.fromJson(content, FileDependence.class);
        int count = 0;
        for (int i = 0; i < fileDependence.dependGraph.length; i++) {
            for (int j = 0; j < fileDependence.dependGraph.length; j++) {
                if (fileDependence.dependGraph[i][j] > 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
