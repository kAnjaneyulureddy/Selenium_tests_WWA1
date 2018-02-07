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
	
	@FindBy(id= "Image1")
	WebElement WWAImage;
	
		
	@FindBy(name="tpRight")
	WebElement RightFrame;
	
	@FindBy(name="tpTopLeft")
	WebElement TopLeftFrame;
	
	@FindBy(id="ShortCutIFrame")
	WebElement TopLeftInnerFrame;
	
	
	@FindBy(xpath="//span[contains(text(),'Inbox : Admin')]")
	WebElement InboxTaskViewSpan;
	
	
	@FindBy(xpath="//span[@id='DataListCtrl_ctl00_ShortCutKey1_lblText']")
	WebElement Inbox;
	
	
	
	
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
	
}
