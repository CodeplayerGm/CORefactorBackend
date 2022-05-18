package com.nju.rjxy.refactorbackend.depends.extractor.python;

import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.ANNOTATION;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.CALL;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.CONTAIN;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.CREATE;
import static com.nju.rjxy.refactorbackend.depends.deptypes.DependencyType.IMPLLINK;
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
import com.nju.rjxy.refactorbackend.depends.relations.ImportLookupStrategy;

public abstract class BasePythonProcessor extends AbstractLangProcessor{
	private PythonImportLookupStrategy importedLookupStrategy;

	public BasePythonProcessor(boolean eagerExpressionResolve) {
		super(eagerExpressionResolve);
	}

	@Override
	public String[] fileSuffixes() {
		return new String[] {".py"};
	}

	@Override
	public ImportLookupStrategy getImportLookupStrategy() {
		importedLookupStrategy = new PythonImportLookupStrategy();
		return this.importedLookupStrategy;
	}


	@Override
	public BuiltInType getBuiltInType() {
		return new PythonBuiltInType();
	}

	@Override
	public List<String> supportedRelations() {
		/* To be check: is python support implemenent? 
		 * should no cast supported.
		 * */
//		depedencyTypes.add(IMPLEMENT);
//		depedencyTypes.add(CAST);

		ArrayList<String> depedencyTypes = new ArrayList<>();
		depedencyTypes.add(ANNOTATION);
		depedencyTypes.add(IMPORT);
		depedencyTypes.add(CONTAIN);
		depedencyTypes.add(INHERIT);
		depedencyTypes.add(CALL);
		depedencyTypes.add(PARAMETER);
		depedencyTypes.add(RETURN);
		depedencyTypes.add(SET);
		depedencyTypes.add(CREATE);
		depedencyTypes.add(USE);
		depedencyTypes.add(THROW);
		depedencyTypes.add(IMPLLINK);
		return depedencyTypes;
	}
}
