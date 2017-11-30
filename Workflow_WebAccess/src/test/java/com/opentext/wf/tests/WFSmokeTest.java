package com.opentext.wf.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.opentext.wf.pages.WWAHomePage;
import com.opentext.wf.pages.WWALoginPage;

public class WFSmokeTest extends BaseTest{
	
	private WWALoginPage loginPg;
	private WWAHomePage homepg;
	
	@Test
	public void loginIntoWWA()
	{
		loginPg = new WWALoginPage(driver);
		
		//homepg = loginPg.Login(testData.getTestUserName(), testData.getPassword());
		
		homepg = loginPg.Login("Admin", "");
		// homepg = homepg.reassignButtontest();	
		System.out.println("Workflow Docker Demo");
	
		
		//Assert.assertTrue(driver.getTitle().contains("Captaris Workflow"));	
		// Assert.assertTrue(ExpectedConditions.);;
		
	}
	
	/*@Test
	public void logOffWWA()
	{
		loginPg = homepg.logOffWWA();
	} */
	
	/* @Test
		public void Reassignfun()
	{
	  homepg = homepg.reassignButtontest();	
	}
	*/
	
	

}
