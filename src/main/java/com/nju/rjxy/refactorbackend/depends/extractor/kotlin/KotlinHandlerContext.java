package com.nju.rjxy.refactorbackend.depends.extractor.kotlin;

import com.nju.rjxy.refactorbackend.depends.entity.repo.EntityRepo;
import com.nju.rjxy.refactorbackend.depends.extractor.java.JavaHandlerContext;
import com.nju.rjxy.refactorbackend.depends.relations.Inferer;

public class KotlinHandlerContext extends JavaHandlerContext {

	public KotlinHandlerContext(EntityRepo entityRepo, Inferer inferer) {
		super(entityRepo,inferer);
	}

}
