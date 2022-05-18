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

package com.nju.rjxy.refactorbackend.depends.extractor.java.context;

import java.util.ArrayList;
import java.util.List;

import com.nju.rjxy.refactorbackend.depends.entity.GenericName;
import com.nju.rjxy.refactorbackend.depends.extractor.java.JavaParser.TypeParameterContext;
import com.nju.rjxy.refactorbackend.depends.extractor.java.JavaParser.TypeParametersContext;

public class TypeParameterContextHelper {

	public static List<GenericName> getTypeParameters(TypeParametersContext typeParameters) {
		ArrayList<GenericName> r = new ArrayList<>();
		for(TypeParameterContext param:typeParameters.typeParameter()) {
			r.add(GenericName.build(param.IDENTIFIER().getText()));
		}
		return r;
	}

}
