//package com.auxenta;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.io.File;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//class CopyApplicationTest {
//
//	@Test
//	void test_copyFolder() {
//			FilesUtils filesUtils=new FilesUtils();
//
//			File sourceDir1 = new File("C://A/bbb.txt");
//			File targetDir1 = new File("C://A/bbb.txt");
////			Assertions.assertTrue(filesUtils.copyFolder(sourceDir1, targetDir1));
//			
//			File sourceDir2 = new File("C://A/bbb.txt");
//			File targetDir2 = new File("C://A/abc.txt");
////			Assertions.assertTrue(filesUtils.copyFolder(sourceDir2, targetDir2));
//			
//			File sourceDir3 = new File("C://A/bbb.txt");
//			File targetDir3 = new File("C://B/bbb.txt");
////			Assertions.assertTrue(filesUtils.copyFolder(sourceDir3, targetDir3));
//			
//			File sourceDir4 = new File("C://A/bbb.txt");
//			File targetDir4 = new File("C://B/abc.txt");
////			Assertions.assertTrue(filesUtils.copyFolder(sourceDir4, targetDir4));
//			
//			File sourceDir5 = new File("C://A");
//			File targetDir5 = new File("C://B");
////			Assertions.assertTrue(filesUtils.copyFolder(sourceDir5, targetDir5));
//			
//			File sourceDir6 = new File("C://A");
//			File targetDir6 = new File("C://A");
////			Assertions.assertTrue(filesUtils.copyFolder(sourceDir6, targetDir6));
//			
//			File sourceDir7 = new File("C://A");
//			File targetDir7 = new File("C://B//C");
////			Assertions.assertTrue(filesUtils.copyFolder(sourceDir7, targetDir7));
//
//			File sourceDir8 = new File("C://A/bbb.txt");
//			File targetDir8 = new File("C://B");	
////			Assertions.assertTrue(filesUtils.copyFolder(sourceDir8, targetDir8));
//			
//			File sourceDir9 = new File("C://A?????bbb.txt");
//			File targetDir9 = new File("C://B");
//			Assertions.assertFalse(filesUtils.copyFolder(sourceDir9, targetDir9));
//	
//	}
//
//	@Test
//	void test_checkInputEmpty() {
//	Validation validation = new Validation();
//
//	Assertions.assertTrue(validation.checkInputEmpty(""));
//	Assertions.assertFalse(validation.checkInputEmpty("C://A/bbb.txt"));
//	Assertions.assertFalse(validation.checkInputEmpty("C://B"));
//	}
//
////	@Test
////	void testIsExistsPath() {
////	FileValidation fileValidation = new FileValidation();
////
////	File source = new File("C://Users/Aux-116/Documents/Jeyarani/source/source.txt");
////	Assertions.assertTrue(fileValidation.isExistsPath(source));
////
////	File source1 = new File("C://Users/Aux-116/Documents/Jeyarani/s");
////	Assertions.assertFalse(fileValidation.isExistsPath(source1));
////
////	File source2 = new File("");
////	Assertions.assertFalse(fileValidation.isExistsPath(source2));
////	}
////
////	@Test
////	void testIsDirectoryPath() {
////	FileValidation fileValidation = new FileValidation();
////
////	File source = new File("C://Users/Aux-116/Documents/Jeyarani/source");
////	Assertions.assertTrue(fileValidation.isDirectoryPath(source));
////
////	File source1 = new File("C://Users/Aux-116/Documents/Jeyarani/source/source.txt");
////	Assertions.assertFalse(fileValidation.isDirectoryPath(source1));
////
////	File source2 = new File("C://Users/Aux-116/Documents/Jeyarani/s");
////	Assertions.assertFalse(fileValidation.isDirectoryPath(source2));
////	}
//
//}
