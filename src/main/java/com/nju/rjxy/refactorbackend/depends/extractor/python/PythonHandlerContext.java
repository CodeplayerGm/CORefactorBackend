package com.nju.rjxy.refactorbackend.depends.extractor.python;

import com.nju.rjxy.refactorbackend.depends.entity.repo.EntityRepo;
import com.nju.rjxy.refactorbackend.depends.extractor.HandlerContext;
import com.nju.rjxy.refactorbackend.depends.relations.Inferer;

public class PythonHandlerContext extends HandlerContext {

	public PythonHandlerContext(EntityRepo entityRepo,Inferer inferer) {
		super(entityRepo,inferer);
	}


}
