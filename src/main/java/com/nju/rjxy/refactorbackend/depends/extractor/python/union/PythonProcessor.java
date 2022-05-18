package com.nju.rjxy.refactorbackend.depends.extractor.python.union;

import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.*;

import java.util.ArrayList;
import java.util.List;

import com.nju.rjxy.refactorbackend.depends.entity.repo.BuiltInType;
import com.nju.rjxy.refactorbackend.depends.extractor.AbstractLangProcessor;
import com.nju.rjxy.refactorbackend.depends.extractor.FileParser;
import com.nju.rjxy.refactorbackend.depends.extractor.python.BasePythonProcessor;
import com.nju.rjxy.refactorbackend.depends.extractor.python.PythonBuiltInType;
import com.nju.rjxy.refactorbackend.depends.extractor.python.PythonImportLookupStrategy;
import com.nju.rjxy.refactorbackend.depends.extractor.ruby.IncludedFileLocator;
import com.nju.rjxy.refactorbackend.depends.relations.ImportLookupStrategy;

public class PythonProcessor extends BasePythonProcessor {

	public PythonProcessor() {
		/* Because Python is dynamic languange, 
		 * we eagerly resolve expression*/
		super(true);
	}

	@Override
	public String supportedLanguage() {
		return "python";
	}


	@Override
	public FileParser createFileParser(String fileFullPath) {
		IncludedFileLocator includeFileLocator = new IncludedFileLocator(super.includePaths());
		return new PythonFileParser(fileFullPath,entityRepo,includeFileLocator,inferer,this);
	}

	

}
