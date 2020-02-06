package com.auxenta;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Validation {

	private static Logger logger = LogManager.getLogger(Validation.class.getName());

	public static Boolean checkInputEmpty(String source) {
		return source.isEmpty();
	}

	public static Boolean checkEquals(String source, String target) {
		return source.equals(target);
	}

	public static void checkAll(String args[]) throws IOException {
		if (checkInputEmpty(args[0])) {
			logger.error("Input is Empty. Please provide valid input");
			throw new NullPointerException("Input is Empty. Please provide valid input");
		} else if (args.length != 2) {
			logger.error("Input should not be more than or less than two");
			throw new ArrayIndexOutOfBoundsException("Input should not be more than or less than two");
		} else if (checkEquals(args[0], args[1])) {
			logger.error("Source file and Target file are same");
			throw new FileAlreadyExistsException("Source file and Target file are same");
		}
	}
	
}
