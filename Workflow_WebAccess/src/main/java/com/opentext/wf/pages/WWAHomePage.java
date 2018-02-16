package com.opentext.wf.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WWAHomePage extends CommonPage{
	
	
	@FindBy(name="tpRight")
	WebElement RightFrame;
	
	@FindBy(name="tpTopLeft")
	WebElement TopLeftFrame;
	
	@FindBy(id="ShortCutIFrame")
	WebElement TopLeftInnerFrame;
	
	@FindBy(name="tpBottomLeft")
	WebElement DownLeftFrame;
	
	
	@FindBy(xpath="//span[contains(text(),'Inbox : Admin')]")
	WebElement InboxTaskViewSpan;
	
	
	@FindBy(xpath="//span[@id='DataListCtrl_ctl00_ShortCutKey1_lblText']")
	WebElement Inbox;
	
	
	@FindBy(xpath="//span[contains(text(),'Outbox : Admin')]")
	WebElement OutboxTaskViewSpan;
	
	
	@FindBy(xpath="//span[@id='DataListCtrl_ctl01_ShortCutKey1_lblText']")
	WebElement Outbox;
	
	@FindBy(xpath="//span[contains(text(),'Overdue : Admin')]")
	WebElement OverdueTaskViewSpan;
	
	
	@FindBy(xpath="//span[@id='DataListCtrl_ctl02_ShortCutKey1_lblText']")
	WebElement Overdue;
	
	@FindBy(xpath="//span[@id='DataListCtrl_ctl03_ShortCutKey1_lblText']")
	WebElement CompanyName;
	
	@FindBy(xpath="//span[@id='DataListCtrl_ctl04_ShortCutKey1_lblText']")
	WebElement Logoff;
	
	@FindBy(xpath="//span[contains(text(),'FileList : Company Name')]")
	WebElement CompanyNameViewSpan;
	
	@FindBy(id="Image1")
	WebElement WWAImage;
	
	@FindBy(xpath="//span[@id='DataListCtrl_ctl00_ShortCutGroup1_lblText']")
	WebElement FolderList;
	
	@FindBy(xpath="//span[@id='DataListCtrl_ctl01_ShortCutGroup1_lblText']")
	WebElement CWFShortcuts;
	
	@FindBy(xpath="//span[@id='DataListCtrl_ctl02_ShortCutGroup1_lblText']")
	WebElement ddd;
	
	@FindBy(xpath="//span[contains(text(), 'FolderList')]")
	WebElement FolderListViewSpan;
	
	@FindBy(xpath="//span[contains(text(),'Captaris Workflow Shortcuts')]")
	WebElement CWFShortcutsSpan;
	
	@FindBy(xpath="//span[contains(text(),'ddd')]")
	WebElement DddShortutsSpan;
	
	
	
	
	public WWAHomePage(WebDriver driver)
	{
		super(driver);
		
		PageFactory.initElements(driver, this);
		
		System.out.println("Testing-constructor");
		 
		if (!(driver.getTitle().contains("Captaris Workflow")))
		{
			throw new IllegalStateException("This is not Homepage");
		}
	}
	
	public WWAHomePage InboxViewClick()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(TopLeftFrame);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.switchTo().frame(TopLeftInnerFrame);
	    Inbox.click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    return new WWAHomePage(this.driver);
 	  
	}
	public boolean InboxTaskViewSpanCheck()
	{ 
		driver.switchTo().defaultContent();
		driver.switchTo().frame(RightFrame);
		return InboxTaskViewSpan.isDisplayed();
		
	}
	
	public WWAHomePage OutboxViewClick()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(TopLeftFrame);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame(TopLeftInnerFrame);
		Outbox.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return new WWAHomePage(this.driver);
	}
	
	public boolean OutboxTaskViewSpanCheck()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(RightFrame);
		return OutboxTaskViewSpan.isDisplayed();
	}
	
	public WWAHomePage OverdueViewClick()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(TopLeftFrame);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame(TopLeftInnerFrame);
		Overdue.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return new WWAHomePage(this.driver);
	}
	
	public boolean OverdueTaskViewSpanCheck()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(RightFrame);
		return OverdueTaskViewSpan.isDisplayed();
	}
	
	public WWAHomePage CompanyNameViewClick()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(TopLeftFrame);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame(TopLeftInnerFrame);
		CompanyName.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return new WWAHomePage(this.driver);	
	}
	
	public boolean CompanyNameViewSpanCheck()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(RightFrame);
		return CompanyNameViewSpan.isDisplayed();
	}
	
	public boolean WWAImageLoadcheck()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(TopLeftFrame);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return WWAImage.isDisplayed();
	}
	public WWAHomePage FolderListViewClick()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(DownLeftFrame);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		FolderList.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return new WWAHomePage(this.driver);
				
	}
	
	public boolean FolderListLoadCheck()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(TopLeftFrame);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return FolderListViewSpan.isDisplayed();

	}
	
	public WWAHomePage CWFShortcutsViewClick()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(DownLeftFrame);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		CWFShortcuts.click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		return new WWAHomePage(this.driver);
	}
	
	public boolean CWFShortCutsLoadCheck()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(TopLeftFrame);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		return CWFShortcutsSpan.isDisplayed();
	}
	
	public WWAHomePage DddShortuctsViewClick()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(DownLeftFrame);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		ddd.click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		return new WWAHomePage(this.driver);	
		
	}
	
	public boolean DddShortcutsLoadCheck()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(TopLeftFrame);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		return DddShortutsSpan.isDisplayed();
	}
	
	public WWALoginPage logoff()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(TopLeftFrame);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.switchTo().frame(TopLeftInnerFrame);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Logoff.click();
		return new WWALoginPage(this.driver);
		
	}
	
}
	

