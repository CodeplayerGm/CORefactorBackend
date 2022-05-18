package com.nju.rjxy.refactorbackend.nsga.mutation;

import com.nju.rjxy.refactorbackend.nsga.datastructure.Chromosome;

import static com.nju.rjxy.refactorbackend.nsga.Common.randomGenerateFAChromosome;

public class FARandomMutation extends AbstractMutation {

    public FARandomMutation(float mutationProbability) {
        super(mutationProbability);
    }

    @Override
    public Chromosome perform(Chromosome chromosome) {
        return randomGenerateFAChromosome();
    }
}
