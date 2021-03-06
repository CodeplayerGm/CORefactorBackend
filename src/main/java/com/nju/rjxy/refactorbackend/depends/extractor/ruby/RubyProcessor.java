/*
MIT License

Copyright (c) 2018-2019 Gang ZHANG

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package com.nju.rjxy.refactorbackend.depends.extractor.ruby;

import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.*;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.CALL;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.CAST;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.CONTAIN;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.CREATE;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.IMPORT;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.INHERIT;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.MIXIN;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.PARAMETER;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.RETURN;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.SET;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.THROW;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.USE;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.nju.rjxy.refactorbackend.depends.entity.repo.BuiltInType;
import com.nju.rjxy.refactorbackend.depends.extractor.AbstractLangProcessor;
import com.nju.rjxy.refactorbackend.depends.extractor.FileParser;
import com.nju.rjxy.refactorbackend.depends.extractor.ParserCreator;
import com.nju.rjxy.refactorbackend.depends.extractor.ruby.jruby.JRubyFileParser;
import com.nju.rjxy.refactorbackend.depends.relations.ImportLookupStrategy;

public class RubyProcessor extends AbstractLangProcessor implements ParserCreator{
    private static final String LANG = "ruby";
    private static final String[] SUFFIX = new String[] {".rb"};
	private ExecutorService executor;
    public RubyProcessor() {
    	super(true);
    }

	@Override
	public String supportedLanguage() {
		return LANG;
	}

	@Override
	public String[] fileSuffixes() {
		return SUFFIX;
	}


	@Override
	public FileParser createFileParser(String fileFullPath) {
		executor = Executors.newSingleThreadExecutor();
		return new JRubyFileParser(fileFullPath,entityRepo,executor,new IncludedFileLocator(super.includePaths()),inferer,this);
	}


	@Override
	protected void finalize() throws Throwable {
		this.executor.shutdown();
		super.finalize();
	}

	@Override
	public ImportLookupStrategy getImportLookupStrategy() {
		return new RubyImportLookupStrategy();
	}


	@Override
	public BuiltInType getBuiltInType() {
		return new RubyBuiltInType();
	}
	
	@Override
	public List<String> supportedRelations() {
		ArrayList<String> depedencyTypes = new ArrayList<>();
		depedencyTypes.add(IMPORT);
		depedencyTypes.add(CONTAIN);
		depedencyTypes.add(INHERIT);
		depedencyTypes.add(CALL);
		depedencyTypes.add(PARAMETER);
		depedencyTypes.add(RETURN);
		depedencyTypes.add(SET);
		depedencyTypes.add(CREATE);
		depedencyTypes.add(USE);
		depedencyTypes.add(CAST);
		depedencyTypes.add(THROW);
		depedencyTypes.add(MIXIN);
		return depedencyTypes;
	}		
}
