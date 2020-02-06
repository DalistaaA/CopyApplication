package com.auxenta;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FilesUtil {

	private static Logger logger = LogManager.getLogger(FilesUtil.class.getName());

	public static Boolean copy(File sourceDir, File targetDir) throws IOException {
		boolean copied = false;
		if (sourceDir.isDirectory()) {
			FileUtils.copyDirectory(sourceDir, targetDir);
			logger.info("Folder Copied!!!");
			copied = true;
		} else {
			FileUtils.copyFile(sourceDir, targetDir);
			logger.info("FIle Copied!!!");
			copied = true;
		}
		return copied;
	}
}
