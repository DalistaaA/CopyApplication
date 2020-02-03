package com.auxenta;

import java.io.File;

public class Validation {

	boolean value = false;

	public Boolean checkSourceExisting(File source) {
		return source.exists();
	}

	public Boolean checkInputEmpty(String source) {
		return source.isEmpty();
	}

	public Boolean checkPathFormat(File source, File target) {
		File file = new File("");
		if ((file.getAbsolutePath().equals(source.getAbsolutePath()))
				&& (file.getAbsolutePath().equals(source.getAbsolutePath()))) {

			value = true;
		}
		return value;
	}
}
