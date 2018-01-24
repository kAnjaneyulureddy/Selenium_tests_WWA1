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
	
	@Test(priority=1)
	public void loginIntoWWA()
	{
		loginPg = new WWALoginPage(driver);
		homepg = loginPg.Login("Admin", "");
		System.out.println("Workflow Docker Demo");
		Assert.assertEquals(driver.getTitle(), "Captaris Workflow", "In Login page");
		
	}
   	
	@Test(priority=2)
	public void InboxView()
	{
		homepg = homepg.InboxViewClick();
		String InboxText = homepg.InboxTaskViewSpanCheck();
		Assert.assertEquals(InboxText, "Inbox : Admin");
							
	}
	
	@Test(priority=3)
	public void OutboxView()
	{
		homepg = homepg.OutboxViewClick();
		String OutboxText = homepg.OutboxTaskViewSpanCheck();
		Assert.assertEquals(OutboxText, "Outbox : Admin");
	}
	
	
	

}
