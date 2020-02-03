package com.auxenta;

import java.io.File;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class UserInput {

	String input;
	String output;
	Scanner scan = new Scanner(System.in);
	boolean select = true;

	private static Logger logger = LogManager.getLogger(UserInput.class);
	
	Validation validation = new Validation();

	public void handlingUserInputs() {

		FilesUtils filesUtils = new FilesUtils();
		while (select) {
			logger.info("Enter your source path");
			input = scan.nextLine();

			logger.info("Enter your target path");
			output = scan.nextLine();
			// call validation here

			if (validation.checkInputEmpty(input)) {
				logger.error("Input is empty, Please provide valid input");
			} else {

				File sourceFolder = new File(input);
				File destinationFolder = new File(output.toString());
				filesUtils.copyFolder(sourceFolder, destinationFolder);
			}
			logger.info("Select Yes to continue or No to Exit");
			String enter = scan.nextLine();

			if (enter.equalsIgnoreCase("no")) {
				select = false;
				logger.info("Now you are exit. Thank you");
				break;
			}

		}

	}
}
