package com.opentext.wf.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadTestData {
	
	
	private Properties props = new Properties();
	
	private FileInputStream fis;
	
	private static ReadTestData testData = new ReadTestData();
	
	private ReadTestData() {
	
		System.out.println(System.getProperty("user.dir"));
		// System.setProperty("user.dir", WFConstants.WF_UI_TEST_PROPS_FILE_PATH_ENV_KEY);
		
		// String prosFilePath = String.format("%s/%s", System.getProperty("User.dir"), WFConstants.WF_UI_TEST_DATA_FILE_NAME);
		String prosFilePath = WFConstants.WF_UI_TEST_DATA_FILE_NAME;
		
		
		try 
		{
			
			fis = new FileInputStream(prosFilePath);
			props.load(fis);
		}
		
		catch(IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	public static ReadTestData getReadTestDataInstance()
	{
		if(null == testData)
		{
			testData = new ReadTestData();
			return testData;
		}
		return testData;
		
	}
	
	public String getTestUserName()
	{
		return props.getProperty("userName");
	}
	
	public String getPassword()
	{
		return props.getProperty("userPassword");
	}
	
	
	
	
	

}
