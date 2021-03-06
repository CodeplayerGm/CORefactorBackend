package com.nju.rjxy.refactorbackend.depends.extractor.python;

import com.nju.rjxy.refactorbackend.depends.entity.Entity;
import com.nju.rjxy.refactorbackend.depends.importtypes.Import;

public class NameAliasImport extends Import {

	private String aliasedName;
	private Entity entity;

	public NameAliasImport(String importedName, Entity entity,String aliasedName) {
		super(importedName);
		this.aliasedName = aliasedName;
		this.entity = entity;
	}

	public Entity getEntity() {
		return entity;
	}

	public String getAlias() {
		return aliasedName;
	}
}
