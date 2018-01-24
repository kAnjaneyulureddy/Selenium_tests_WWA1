package com.opentext.wf.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	private Properties props = new Properties();
	
	private FileInputStream fis;
	
    private static ReadProperties rp = new ReadProperties();
	
	private ReadProperties()
	{
		
		System.out.println(System.getProperty("user.dir"));
		// System.setProperty("user.dir", WFConstants.WF_UI_TEST_PROPS_FILE_PATH_ENV_KEY);
		// System.getenv("user.dir");
		
		// String propsFilePath= String.format("%s/%s",  System.getProperty("user.dir"), WFConstants.WF_UI_TEST_CONFIG_PROPS_FILE_NAME);
		String propsFilePath = WFConstants.WF_UI_TEST_CONFIG_PROPS_FILE_NAME;
		
		try
		{
			fis = new FileInputStream(propsFilePath);
			props.load(fis);
			
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}	
		
		
	}
	
	
	public static ReadProperties getReadPropertiesInstance()
	
	{
		
		if(null == rp)
		{
			rp = new ReadProperties();
			return rp;
		}
		return rp;
	}
	
	public String getUserName()
	{
		return props.getProperty("UserName");
	}
	
	public String getPassword()
	{
		return props.getProperty("Password");
	}
	
	public String getURL()
	{
		return props.getProperty("URL");
	}
	
	public String getBrowser()
	{
		System.out.println(props.getProperty("Browser"));
		return props.getProperty("Browser");
	}
	

	public String getBrowserDriversPath() {
		return props.getProperty("BrowserDriverPath");
	}
	
		
	
	

}
