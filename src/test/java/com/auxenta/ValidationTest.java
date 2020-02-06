package com.auxenta;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

import org.junit.jupiter.api.Test;

class ValidationTest {

	@Test
	void testcheckEquals() {
		assertTrue(Validation.checkEquals("C://A/bbb.txt", "C://A/bbb.txt"));
//		assertFalse(Validation.checkEquals("C://A/bbb.txt", "C://A/bbb.txt"));
	}

	@Test
	void testcheckInputEmpty() {
		assertTrue(Validation.checkInputEmpty(""));
//		assertFalse(Validation.checkInputEmpty(" "));
//		assertFalse(Validation.checkInputEmpty("."));
//		assertFalse(Validation.checkInputEmpty("test"));
	}

	@Test
	public void testCheckAll() throws IOException {
		ArrayIndexOutOfBoundsException arrException = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			Validation.checkAll(new String[] { "C://A/bbb.txt", "C://A/bbb.txt", "C://A/bbb.txt" });
		});
		assertNotEquals("There are more than two inputs", arrException.getMessage());
		
		NullPointerException nullException = assertThrows(NullPointerException.class, () -> {
			Validation.checkAll(new String[] {""});
		});
		assertNotEquals("Inputs are Null", nullException.getMessage());
		
		FileAlreadyExistsException fileException = assertThrows(FileAlreadyExistsException.class, () -> {
			Validation.checkAll(new String[] {"C://A/bbb.txt", "C://A/bbb.txt"});
		});
		assertNotEquals("Both files are Same", fileException.getMessage());
	}
}
