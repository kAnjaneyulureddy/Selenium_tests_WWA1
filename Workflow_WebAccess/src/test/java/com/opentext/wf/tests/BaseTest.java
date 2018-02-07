package com.opentext.wf.tests;

import com.opentext.wf.utils.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver;
	
	ReadProperties rp;
	
	ReadTestData testData;
	
	static String driverName;
	
	@BeforeTest
	public void launchBrowser()
	{
		rp = ReadProperties.getReadPropertiesInstance();
	
		testData = ReadTestData.getReadTestDataInstance();
		
		String browserName = rp.getBrowser();
		
		
		System.out.println(browserName);
		
		driver = Browser.getDriverInstance(browserName);
		driver.get(rp.getURL());
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}
	

}
