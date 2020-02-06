package com.auxenta;

import java.io.File;
import java.io.IOException;

public class UserInput {

	public static void handlingInputs(String args[]) throws IOException {
			Validation.checkAll(args);
			File sourceFolder = new File(args[0]);
			File destinationFolder = new File(args[1]);
			FilesUtil.copy(sourceFolder, destinationFolder);
	}
}
