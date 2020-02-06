package com.auxenta;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FilesUtilTest {

	static String userHome = System.getProperty("user.home");
	static String fileSeparator = System.getProperty("file.separator");
	
	static  File srcFolder = new File(userHome + fileSeparator + "folder1");
	static  File tarFolder = new File(userHome + fileSeparator + "folder2");
	static File sourcefile = new File("." + fileSeparator + "Log" + fileSeparator + "logging.log");

	
	@BeforeAll
	public static void beforeAll() throws IOException {
		srcFolder.mkdirs();
		tarFolder.mkdir();
		FileUtils.copyFileToDirectory(sourcefile, srcFolder);
		FileUtils.copyFileToDirectory(sourcefile, tarFolder);
	}

	@AfterAll
	public static void afterAll() {
		srcFolder.delete();
		tarFolder.delete();
	}

	@Test
	void testCopyFolder() throws IOException {
		File tar = new File(tarFolder + fileSeparator + "abc.log");
		Assertions.assertTrue(FilesUtil.copy(sourcefile, tar));
//		Assertions.assertFalse(FilesUtil.copy(sourcefile, sourcefile));
//		Assertions.assertFalse(FilesUtil.copy(srcFolder, srcFolder));
//		Assertions.assertTrue(FilesUtil.copy(srcFolder, tarFolder));
	}

}
