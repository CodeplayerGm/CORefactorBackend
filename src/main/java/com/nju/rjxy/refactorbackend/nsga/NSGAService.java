package com.nju.rjxy.refactorbackend.nsga;

import com.nju.rjxy.refactorbackend.nsga.crossover.FARandomCrossover;
import com.nju.rjxy.refactorbackend.nsga.crossover.FaSingleCrossover;
import com.nju.rjxy.refactorbackend.nsga.crossover.FileRandomCrossover;
import com.nju.rjxy.refactorbackend.nsga.crossover.FileSingleCrossover;
import com.nju.rjxy.refactorbackend.nsga.mutation.FARandomMutation;
import com.nju.rjxy.refactorbackend.nsga.mutation.FaModularMutation;
import com.nju.rjxy.refactorbackend.nsga.mutation.FileModularMutation;
import com.nju.rjxy.refactorbackend.nsga.mutation.FileRandomMutation;
import com.nju.rjxy.refactorbackend.nsga.objective.ObjectiveProvider;
import com.nju.rjxy.refactorbackend.nsga.plugin.DefaultPluginProvider;
import com.nju.rjxy.refactorbackend.nsga.runbody.Configuration;
import com.nju.rjxy.refactorbackend.nsga.runbody.FANsga2;
import com.nju.rjxy.refactorbackend.nsga.runbody.FileNsga2;
import com.nju.rjxy.refactorbackend.nsga.termination.TerminatingCriterionProvider;
import org.springframework.stereotype.Service;

import static com.nju.rjxy.refactorbackend.nsga.Common.appendStringToFile;
import static com.nju.rjxy.refactorbackend.nsga.Common.getFourBitsDoubleString;
import static com.nju.rjxy.refactorbackend.nsga.ParameterConfig.*;
import static com.nju.rjxy.refactorbackend.nsga.PostProcessShowData.*;
import static com.nju.rjxy.refactorbackend.nsga.PreProcessLoadData.*;

@Service
public class NSGAService {

    public void initParamConfig(int generation, int population, int maxRecord, float overloadRemainThreshold,
                                float crossoverProb, float mutationProb, float breakProb, double modelService,
                                double modelFile, int overloadThreshold) {
        // 前端只运行一次
        experimentTimes = 1;
        ParameterConfig.overloadRemainThreshold = overloadRemainThreshold;
        ParameterConfig.crossoverProb = crossoverProb;
        ParameterConfig.mutationProb = mutationProb;
        ParameterConfig.breakProb = breakProb;
        ParameterConfig.service_threshold = modelService;
        ParameterConfig.file_threshold = modelFile;
        overload_threshold = overloadThreshold;

        faMaxGeneration = generation;
        fileMaxGeneration = generation;
        faMaxPopulationSize = population;
        fileMaxPopulationSize = population;
        faMaxRecord = maxRecord;
        fileMaxRecord = maxRecord;
    }

    public void  faRefactorTest(Configuration configuration, int startIter) {
        // 功能原子粒度重构方法，初始化种群
        configuration.setPopulationProducer(DefaultPluginProvider.faInitPopulationProducer());
        configuration.objectives = ObjectiveProvider.provideFAStructuralAndSemanticAndMoJoFM();
        // 交叉操作
        configuration.setChromosomeLength(faNums);
        configuration.setCrossover(new FaSingleCrossover(null, crossoverProb));
        // 变异操作 - mutationProbability是在refactorGenerateChildrenProducerEncode方法中用的
        configuration.setMutation(new FaModularMutation(mutationProb, breakProb));
        // 子代更新方法
        configuration.setChildPopulationProducer(DefaultPluginProvider.childrenProducer(mutationProb));
        // 最大代数，与终止条件有关
        configuration.setGenerations(faMaxGeneration);
        // 原意是种群的固定数量，但在本研究中，种群数量是从1开始的，次值应该是种群上限
        configuration.setPopulationSize(faMaxPopulationSize);
        // 遗传终止方法
        configuration.setTerminatingCriterion(TerminatingCriterionProvider.refactorTerminatingCriterion(
                faMaxPopulationSize, faMaxRecord));

        FANsga2 faNsga2 = new FANsga2(configuration);
        for (int i = startIter; i <= experimentTimes; i++) {
            experimentInitDataStructure("fa");

            long start = System.currentTimeMillis();
            faNsga2.run(i, outputFAProgramJson, outputFAObjectiveTxt, outputFAFrontTxt, outputFACostTxt, true);
            long end = System.currentTimeMillis();

            appendStringToFile("\ntime:" + (end - start) / 1000.0, outputFACostTxt + i + ".txt", false);
            System.out.println("运行时间：" + getFourBitsDoubleString((end - start) / 1000.0) + " s");
        }
    }

    public void faRandomSearchTest(Configuration configuration, int startIter) {
        // 随机搜索，初始化种群
        configuration.setPopulationProducer(DefaultPluginProvider.faInitPopulationProducer());
        configuration.objectives = ObjectiveProvider.provideFAStructuralAndSemanticAndMoJoFM();
        // 交叉操作
        configuration.setChromosomeLength(faNums);
        configuration.setCrossover(new FARandomCrossover(null, crossoverProb));
        // 变异操作 - mutationProbability是在refactorGenerateChildrenProducerEncode方法中用的
        configuration.setMutation(new FARandomMutation(mutationProb));
        // 子代更新方法，参数暂时没用到
        configuration.setChildPopulationProducer(DefaultPluginProvider.randomChildrenProducer(mutationProb));
        // 最大代数，与终止条件有关
        configuration.setGenerations(faMaxGeneration);
        // 原意是种群的固定数量，但在本研究中，种群数量是从1开始的，次值应该是种群上限
        configuration.setPopulationSize(faMaxPopulationSize);
        // 遗传终止方法
        configuration.setTerminatingCriterion(TerminatingCriterionProvider.refactorTerminatingCriterion(
                faMaxPopulationSize, faMaxRecord));

        FANsga2 rs = new FANsga2(configuration);
        for (int i = startIter; i <= experimentTimes; i++) {
            experimentInitDataStructure("fa");
            // 实验计时
            long start = System.currentTimeMillis();
            rs.run(i, outputFARandomProgramJson, outputFARandomObjectiveTxt, outputFARandomFrontTxt, outputFARandomCostTxt, false);
            long end = System.currentTimeMillis();
            appendStringToFile("\ntime:" + (end - start) / 1000.0, outputFARandomCostTxt + i + ".txt", false);
            System.out.println("运行时间：" + getFourBitsDoubleString((end - start) / 1000.0) + " s");
        }
    }

    public void fileRefactorTest(Configuration configuration, int startIter) {
        // 代码文件粒度重构，初始化种群
        configuration.setPopulationProducer(DefaultPluginProvider.fileInitPopulationProducer());
        configuration.objectives = ObjectiveProvider.provideFileStructuralAndSemanticAndMoJoFM();
        // 交叉操作
        configuration.setChromosomeLength(overloadServiceFileList.size());
        configuration.setCrossover(new FileSingleCrossover(null, crossoverProb));
        // 变异操作 - mutationProbability是在refactorGenerateChildrenProducerEncode方法中用的
        configuration.setMutation(new FileModularMutation(mutationProb, breakProb));
        // 子代更新方法
        configuration.setChildPopulationProducer(DefaultPluginProvider.childrenProducer(mutationProb));
        // 最大代数，与终止条件有关
        configuration.setGenerations(fileMaxGeneration);
        // 原意是种群的固定数量，但在本研究中，种群数量是从1开始的，次值应该是种群上限
        configuration.setPopulationSize(fileMaxPopulationSize);
        // 遗传终止方法
        configuration.setTerminatingCriterion(TerminatingCriterionProvider.refactorTerminatingCriterion(
                fileMaxPopulationSize, fileMaxRecord));

        FileNsga2 fileNsga2 = new FileNsga2(configuration);
        for (int i = startIter; i <= experimentTimes; i++) {
            System.out.println("experiment - " + i + " -------------------------------------------------------------------");
            experimentInitDataStructure("file");

            long start = System.currentTimeMillis();
            fileNsga2.run(i, outputFileProgramJson, outputFileObjectiveTxt, outputFileFrontTxt, outputFileCostTxt, true);
            long end = System.currentTimeMillis();

            appendStringToFile("\ntime:" + (end - start) / 1000.0, outputFileCostTxt + i + ".txt", false);
            System.out.println("运行时间：" + getFourBitsDoubleString((end - start) / 1000.0) + " s");
        }
    }

    public void fileRandomSearchTest(Configuration configuration, int startIter) {
        // 代码文件粒度的随机搜索，初始化种群
        configuration.setPopulationProducer(DefaultPluginProvider.fileInitPopulationProducer());
        configuration.objectives = ObjectiveProvider.provideFileStructuralAndSemanticAndMoJoFM();
        // 交叉操作
        configuration.setChromosomeLength(overloadServiceFileList.size());
        configuration.setCrossover(new FileRandomCrossover(null, crossoverProb));
        // 变异操作 - mutationProbability是在refactorGenerateChildrenProducerEncode方法中用的
        configuration.setMutation(new FileRandomMutation(mutationProb));
        // 子代更新方法，参数暂时没用到
        configuration.setChildPopulationProducer(DefaultPluginProvider.randomChildrenProducer(mutationProb));
        // 最大代数，与终止条件有关
        configuration.setGenerations(fileMaxGeneration);
        // 原意是种群的固定数量，但在本研究中，种群数量是从1开始的，次值应该是种群上限
        configuration.setPopulationSize(fileMaxPopulationSize);
        // 遗传终止方法
        configuration.setTerminatingCriterion(TerminatingCriterionProvider.refactorTerminatingCriterion(
                fileMaxPopulationSize, fileMaxRecord));

        FileNsga2 rs = new FileNsga2(configuration);
        for (int i = 1; i <= experimentTimes; i++) {
            experimentInitDataStructure("file");

            long start = System.currentTimeMillis();
            rs.run(i, outputFileRandomProgramJson, outputFileRandomObjectiveTxt, outputFileRandomFrontTxt, outputFileRandomCostTxt, false);
            long end = System.currentTimeMillis();

            appendStringToFile("\ntime:" + (end - start) / 1000.0, outputFileRandomCostTxt + i + ".txt", false);
            System.out.println("运行时间：" + getFourBitsDoubleString((end - start) / 1000.0) + " s");
        }

    }

    public static void main(String[] args) {
//        Configuration configuration = new Configuration();
//
//        long start = System.currentTimeMillis();
////        faRefactorTest(configuration, 1);
////        faRandomSearchTest(configuration, 1);
////        fileRefactorTest(configuration, 1);
//        fileRandomSearchTest(configuration, 1);
//
//        long end = System.currentTimeMillis();
//        System.out.println("任务总耗时：" + getFourBitsDoubleString((end - start) / 1000.0));
    }

}
