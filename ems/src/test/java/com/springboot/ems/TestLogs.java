package com.springboot.ems;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLogs {
	
	public static Logger Log = Logger.getLogger(TestLogs.class.getName());

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("./src/main/resources/log4j.properties");
		
		Log.info("This is the information log");
		Log.error("Here the error logs will be printed");

	}

}
