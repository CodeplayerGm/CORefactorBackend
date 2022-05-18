package com.nju.rjxy.refactorbackend.nsga.termination;

import com.nju.rjxy.refactorbackend.nsga.datastructure.Population;

@FunctionalInterface
public interface TerminatingCriterion {
	boolean shouldRun(Population population, int generationCount, int maxGenerations);
}
