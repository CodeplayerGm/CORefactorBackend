package com.nju.rjxy.refactorbackend.depends.format.path;

public class WindowsPathFilenameWritter implements FilenameWritter{
	@Override
	public String reWrite(String originalPath) {
		return originalPath.replaceAll("/","\\\\");
	}
}
