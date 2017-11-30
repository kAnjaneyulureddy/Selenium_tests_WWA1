package com.opentext.wf.pages;
import com.opentext.wf.utils.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonPage {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected ReadProperties rp;
	protected ReadTestData testData;
	
	
	public CommonPage(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}
	
}
