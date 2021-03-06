package com.nju.rjxy.refactorbackend.depends.extractor.cpp;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.cdt.core.dom.ast.IASTPreprocessorMacroDefinition;

import com.nju.rjxy.refactorbackend.depends.entity.repo.EntityRepo;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class MacroEhcacheRepo extends MacroRepo {
	private EntityRepo entityRepo;
	CacheManager cacheManager;
	Cache cache;

	public MacroEhcacheRepo(EntityRepo entityRepo) {
		this.entityRepo = entityRepo;
		cacheManager = CacheManager.create();
		cache = cacheManager.getCache("macros");
	}

	@Override
	public Map<String, String> get(String incl) {
		Integer fileId = entityRepo.getEntity(incl).getId();
		Element cacheElement = cache.get(buildKey(fileId));
		if (cacheElement ==null)
			return new HashMap<>();
		@SuppressWarnings("unchecked")
		Map<String, String> macros = (Map<String, String>) (cacheElement.getObjectValue());
		if (macros == null)
			macros = new HashMap<>();
		return macros;
	}

	@Override
	public void putMacros(String fileFullPath, Map<String, String> macroMap,
			IASTPreprocessorMacroDefinition[] macroDefinitions) {
		if (macroDefinitions.length == 0 && macroMap.size() == 0)
			return;
		Integer fileId = entityRepo.getEntity(fileFullPath).getId();

		Map<String, String> macros = get(fileFullPath);
		macros.putAll(macroMap);
		for (IASTPreprocessorMacroDefinition def : macroDefinitions) {
			macros.put(def.getName().toString(), new String(def.getExpansion()));
		}
		Element cacheElement = new Element(buildKey(fileId), macros);
		cache.put(cacheElement);
	}

	private String buildKey(Integer fileId) {
		return "macro" + fileId;
	}

}
