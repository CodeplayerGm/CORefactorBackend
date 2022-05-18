package com.nju.rjxy.refactorbackend.depends.extractor.kotlin;

import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.ANNOTATION;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.CALL;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.CAST;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.CONTAIN;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.CREATE;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.IMPLEMENT;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.IMPORT;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.INHERIT;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.PARAMETER;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.RETURN;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.SET;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.THROW;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.USE;

import java.util.ArrayList;
import java.util.List;

import com.nju.rjxy.refactorbackend.depends.entity.repo.BuiltInType;
import com.nju.rjxy.refactorbackend.depends.extractor.AbstractLangProcessor;
import com.nju.rjxy.refactorbackend.depends.extractor.FileParser;
import com.nju.rjxy.refactorbackend.depends.extractor.java.JavaBuiltInType;
import com.nju.rjxy.refactorbackend.depends.extractor.java.JavaImportLookupStrategy;
import com.nju.rjxy.refactorbackend.depends.relations.ImportLookupStrategy;

public class KotlinProcessor extends AbstractLangProcessor {

	public KotlinProcessor() {
    	super(true);
	}

	@Override
	public String supportedLanguage() {
		return "kotlin[on-going]";
	}

	@Override
	public String[] fileSuffixes() {
		return new String[] {".kt"};
	}

	@Override
	public ImportLookupStrategy getImportLookupStrategy() {
		return new JavaImportLookupStrategy();
	}

	@Override
	public BuiltInType getBuiltInType() {
		return new JavaBuiltInType();
	}

	@Override
	protected FileParser createFileParser(String fileFullPath) {
		return new KotlinFileParser(fileFullPath,entityRepo, inferer);
	}
	
	@Override
	public List<String> supportedRelations() {
		ArrayList<String> depedencyTypes = new ArrayList<>();
		depedencyTypes.add(IMPORT);
		depedencyTypes.add(CONTAIN);
		depedencyTypes.add(IMPLEMENT);
		depedencyTypes.add(INHERIT);
		depedencyTypes.add(CALL);
		depedencyTypes.add(PARAMETER);
		depedencyTypes.add(RETURN);
		depedencyTypes.add(SET);
		depedencyTypes.add(CREATE);
		depedencyTypes.add(USE);
		depedencyTypes.add(CAST);
		depedencyTypes.add(THROW);
		depedencyTypes.add(ANNOTATION);
		return depedencyTypes;
	}	

}
