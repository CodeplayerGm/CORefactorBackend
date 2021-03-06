package com.nju.rjxy.refactorbackend.depends.extractor.python.union;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.nju.rjxy.refactorbackend.depends.entity.Entity;
import com.nju.rjxy.refactorbackend.depends.entity.FileEntity;
import com.nju.rjxy.refactorbackend.depends.entity.repo.EntityRepo;
import com.nju.rjxy.refactorbackend.depends.extractor.FileParser;
import com.nju.rjxy.refactorbackend.depends.extractor.python.PythonLexer;
import com.nju.rjxy.refactorbackend.depends.extractor.python.PythonParser;
import com.nju.rjxy.refactorbackend.depends.extractor.ruby.IncludedFileLocator;
import com.nju.rjxy.refactorbackend.depends.relations.Inferer;

public class PythonFileParser implements FileParser {

	private String fileFullPath;
	private EntityRepo entityRepo;
	private Inferer inferer;
	private IncludedFileLocator includeFileLocator;
	private PythonProcessor processor;

	public PythonFileParser(String fileFullPath, EntityRepo entityRepo, IncludedFileLocator includeFileLocator,
			Inferer inferer, PythonProcessor pythonProcessor) {
		this.fileFullPath = fileFullPath;
		this.entityRepo = entityRepo;
		this.inferer = inferer;
		this.includeFileLocator = includeFileLocator;
		this.processor = pythonProcessor;
	}

	@Override
	public void parse() throws IOException {
		/** If file already exist, skip it */
		Entity fileEntity = entityRepo.getEntity(fileFullPath);
		if (fileEntity!=null && fileEntity instanceof FileEntity) {
			return;
		}
        CharStream input = CharStreams.fromFileName(fileFullPath);
        Lexer lexer = new PythonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        
        PythonParser parser = new PythonParser(tokens);
        PythonCodeListener bridge = new PythonCodeListener(fileFullPath, entityRepo,inferer, includeFileLocator, processor);
	    ParseTreeWalker walker = new ParseTreeWalker();
	    walker.walk(bridge, parser.file_input());
	    
		fileEntity = entityRepo.getEntity(fileFullPath);
		fileEntity.inferEntities(inferer);
		((FileEntity)fileEntity).cacheAllExpressions();
	}

}
