package com.nju.rjxy.refactorbackend.depends.extractor.cpp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.cdt.core.dom.ast.IASTPreprocessorMacroDefinition;
import org.eclipse.cdt.core.dom.ast.IMacroBinding;
import org.eclipse.cdt.core.parser.IScanner;
import org.eclipse.cdt.core.parser.NullLogService;
import org.eclipse.cdt.core.parser.ParserMode;
import org.eclipse.cdt.internal.core.dom.parser.AbstractGNUSourceCodeParser;
import org.eclipse.cdt.internal.core.dom.parser.cpp.GNUCPPSourceParser;

import com.nju.rjxy.refactorbackend.depends.extractor.cpp.cdt.GPPParserExtensionConfigurationExtension;
import com.nju.rjxy.refactorbackend.depends.util.FileUtil;

public abstract class MacroRepo {
	private Map<String, String> defaultMacroMap = new HashMap<>();
	/**
	 * Generate default macro from system include paths
	 * @param sysIncludePath
	 * @return
	 */
	public Map<String, String> buildDefaultMap(List<String> sysIncludePath) {
		for (String p : sysIncludePath) {
			if (!FileUtil.isDirectory(p)) {
				IScanner scanner = Scanner.buildScanner(p,defaultMacroMap, sysIncludePath, true);
				if (scanner==null) continue;
				AbstractGNUSourceCodeParser sourceCodeParser = new GNUCPPSourceParser(scanner,
						ParserMode.COMPLETE_PARSE, new NullLogService(), new GPPParserExtensionConfigurationExtension(),
						null);
				sourceCodeParser.parse();
				Map<String, IMacroBinding> macros = scanner.getMacroDefinitions();
				for (String key : macros.keySet()) {
					String exp = new String(macros.get(key).getExpansion());
					if (exp.length() > 0) {
						defaultMacroMap.put(key, exp);
					}

				}
			}
		}
		return defaultMacroMap;
	}
	
	
	public Map<String, String> getDefaultMap() {
		return defaultMacroMap;
	}


	public abstract Map<String, String> get(String incl);


	public abstract void putMacros(String fileFullPath,  Map<String, String> macroMap,
			IASTPreprocessorMacroDefinition[] macroDefinitions);

}
