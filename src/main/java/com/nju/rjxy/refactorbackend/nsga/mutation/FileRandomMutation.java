package com.nju.rjxy.refactorbackend.nsga.mutation;

import com.nju.rjxy.refactorbackend.nsga.datastructure.Chromosome;

import static com.nju.rjxy.refactorbackend.nsga.Common.randomGenerateFileChromosome;

public class FileRandomMutation extends AbstractMutation {

    public FileRandomMutation(float mutationProbability) {
        super(mutationProbability);
    }

    @Override
    public Chromosome perform(Chromosome chromosome) {
        return randomGenerateFileChromosome();
    }
}
