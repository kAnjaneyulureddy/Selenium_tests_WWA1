package com.opentext.wf.tests;

import java.util.concurrent.TimeUnit;

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
		Assert.assertTrue(homepg.InboxTaskViewSpanCheck(), "Inbox task view is not displayed");
		//Assert.assertEquals(InboxText, "Inbox : Admin");
							
	}
	
	@Test(priority=3)
	public void OutboxView()
	{
		homepg = homepg.OutboxViewClick();
		Assert.assertTrue(homepg.OutboxTaskViewSpanCheck(), "Outbox task view is not displayed");
	}
	
	@Test(priority=4)
	public void OverdueView()
	{
		homepg = homepg.OverdueViewClick();
		Assert.assertTrue(homepg.OverdueTaskViewSpanCheck(), "Overdue task view is not displayed");
	}
	
	@Test(priority=5)
	public void CompanyNameView()
	{
		homepg = homepg.CompanyNameViewClick();
		Assert.assertTrue(homepg.CompanyNameViewSpanCheck(), "Company name view is not displayed");
	}
	@Test(priority=6)
	public void WWAImageLoadCheck()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertTrue(homepg.WWAImageLoadcheck(), "Web Access Image not loaded");
	}
	
	@Test(priority=7)
	public void FolderListView()
	{
		homepg = homepg.FolderListViewClick();
		Assert.assertTrue(homepg.FolderListLoadCheck(), "Folder List view is not displayed");
	}
	
	@Test(priority=8)
	public void CWFShortcutsView()
	{
		homepg = homepg.CWFShortcutsViewClick();
		Assert.assertTrue(homepg.CWFShortCutsLoadCheck(), "Shortcuts span not loaded");
	}
	
	@Test(priority=9)
	public void DddShortcutsView()
	{
		homepg = homepg.DddShortuctsViewClick();
		Assert.assertTrue(homepg.DddShortcutsLoadCheck(), "DDD shortcuts frame not loaded");
		homepg = homepg.CWFShortcutsViewClick();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=10)
	public void LogoffCheck()
	{
		loginPg = homepg.logoff();
		Assert.assertEquals(driver.getTitle(), "Login WebAccess", "Login page loaded");
	}
	
}
	
	

