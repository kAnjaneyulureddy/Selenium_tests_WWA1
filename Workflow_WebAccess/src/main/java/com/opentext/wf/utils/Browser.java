package com.opentext.wf.utils;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser {
	
	private static WebDriver driver=null;
	
	private static WebDriver initializeDriver(String browserName)
	{
		ReadProperties rp = ReadProperties.getReadPropertiesInstance();
		
		
		switch(browserName)
		{
		case "IE":
			
			System.setProperty("webdriver.ie.driver", rp.getBrowserDriversPath() + "/IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			break;
			
		case "CH":
			
			System.setProperty("webdriver.chrome.driver", rp.getBrowserDriversPath() + "/chromedriver.exe");
			
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
			
        default:
        	
        	System.out.println("Select the browser");
        	break;
        	
	
		}
		
		rp = null;
		return driver;	
	}
	
	public static WebDriver getDriverInstance(String browserName)
	{
		driver = null;
		
		if(driver==null)
		{
			driver = initializeDriver(browserName);
			return driver;
		}
		else
			return driver;
	}
	public static WebDriver getCurrentDriverInstance()
	{
		return driver;
		
	}
}






