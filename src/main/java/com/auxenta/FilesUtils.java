package com.auxenta;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FilesUtils {

Validation validation = new Validation();
	
	private static Logger logger = LogManager.getLogger(FilesUtils.class);

	public Boolean copyFolder(File sourceDir, File targetDir){
		boolean boo = false;
		try {

			if (validation.checkSourceExisting(sourceDir)) {
				if (sourceDir.isDirectory()) {
					// Verify if destinationFolder is already present; If not then create it
					if (!targetDir.exists()) {
						targetDir.mkdir();
						logger.info("Directory created :: " + targetDir);
					}

					// Get all files from source directory
					String files[] = sourceDir.list();

					// Iterate over all files and copy them to destinationFolder one by one
					for (String file : files) {
						File srcFile = new File(sourceDir, file);
						File destFile = new File(targetDir, file);

						// Recursive function call
						copyFolder(srcFile, destFile);
						boo = true;

					}
				} else {
					Files.copy(sourceDir.toPath(), targetDir.toPath(), StandardCopyOption.REPLACE_EXISTING);
					logger.info("File copied :: " + targetDir);
					boo = true;
				}
			} else {
				if(validation.checkSourceExisting(targetDir)) {
					logger.info("There is no Source File in that Location");
				}
				logger.error("There is no Source File in that Location");
			}
		} 
			catch (IOException e) {
				logger.error("Error in copying folder");
				boo = false;
		}

		return boo;
	}

}
