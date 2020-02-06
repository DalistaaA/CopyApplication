package com.auxenta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	
	private static Logger logger = LogManager.getLogger(App.class);
	
	public static void main(String[] args) {
		try {
			UserInput.handlingInputs(args);
		} catch (Exception e) {
			logger.error(e);
		}
		
	}
}
