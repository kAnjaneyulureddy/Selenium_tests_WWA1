package com.opentext.wf.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WWAHomePage extends CommonPage{
	
	@FindBy(id= "Image1")
	WebElement WWAImage;
	
	
	@FindBy(xpath= "//span[contains(text(),'Inbox')]")
	WebElement InboxSpan;
	
	@FindBy(xpath="//span[contains(text(),'Outbox')]")
	WebElement OutboxSpan;
	
	@FindBy(name="tpRight")
	WebElement RightFrame;
	
	@FindBy(xpath="//span[contains(text(),'Inbox : Admin')]")
	WebElement InboxTaskViewSpan;
	
	@FindBy(xpath="//span[contains(text(),'Outbox : Admin)]")
	WebElement OutboxTaskViewSpan;
	
	
	public WWAHomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	   
		if (!(driver.getTitle().contains("Captaris Workflow")))
		{
			throw new IllegalStateException("This is not Homepage");
		}
	}
	
	public WWAHomePage InboxViewClick()
	{
	   driver.switchTo().frame(RightFrame);
	   //driver.switchTo().frame("tpRight");
	   InboxSpan.click();
	   return new WWAHomePage(this.driver);
 	  
	}
	public String InboxTaskViewSpanCheck()
	{ 
		String inboxTitleText = InboxTaskViewSpan.getText();
		return inboxTitleText;		
	}
	
	public WWAHomePage OutboxViewClick()
	{
		driver.switchTo().frame(RightFrame);
		OutboxSpan.click();
		return new WWAHomePage(this.driver);
	}
	
	public String OutboxTaskViewSpanCheck()
	{
		String outboxTitleText = OutboxTaskViewSpan.getText();
		return outboxTitleText;
	}
	
}
