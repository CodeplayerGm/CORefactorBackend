package com.nju.rjxy.refactorbackend.nsga.crossover;

import com.nju.rjxy.refactorbackend.nsga.datastructure.Chromosome;
import com.nju.rjxy.refactorbackend.nsga.datastructure.Population;

import java.util.ArrayList;
import java.util.List;

import static com.nju.rjxy.refactorbackend.nsga.PreProcessLoadData.historyRecord;
import static com.nju.rjxy.refactorbackend.nsga.Common.randomGenerateFileChromosome;
import static com.nju.rjxy.refactorbackend.nsga.objective.ConcernGranularityObjective.ifChromosomeOverload;

public class FileRandomCrossover extends AbstractCrossover {

    public FileRandomCrossover(CrossoverParticipantCreator crossoverParticipantCreator, float crossoverProbability) {
        super(crossoverParticipantCreator);
        this.crossoverProbability = crossoverProbability;
    }

    /**
     * 随机交叉
     * @param population
     * @return
     */
    @Override
    public List<Chromosome> perform(Population population) {
        int parentSize = population.getPopulace().size();
        if (parentSize < 2) {
            return new ArrayList<>();
        }

        // 基于交叉概率计算当前代交叉的组数
        int crossNum = (int) (this.crossoverProbability * parentSize);
        crossNum = Math.max(crossNum, 1);

        // 交叉产生的新个体集合
        List<Chromosome> children = new ArrayList<>();
        for (int i = 0; i < crossNum; i++) {
            Chromosome randomChromosome = randomGenerateFileChromosome();
            if (!historyRecord.containsKey(randomChromosome)) {
                historyRecord.put(randomChromosome, ifChromosomeOverload(randomChromosome));
                children.add(randomChromosome);
            }
        }

        return children;
    }


}
