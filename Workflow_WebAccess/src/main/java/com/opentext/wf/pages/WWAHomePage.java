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
	
	/* @FindBy(xpath = "//*[@id=\"DataListCtrl_ctl04_ShortCutKey1_lblText\"]")
	WebElement logoffImage;
	
	@FindBy(name="buttonAssign")
	WebElement reassignButton; */
	
	public WWAHomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	   
		if (!(driver.getTitle().contains("Captaris Workflow")))
		{
			throw new IllegalStateException("This is not Homepage");
		}
	}
	
	/* public WWALoginPage logOffWWA()
	{
	
		logoffImage.click();
		
		return new WWALoginPage(this.driver);
	}
	
	public WWAHomePage  reassignButtontest()
	{
		reassignButton.click();
		return new WWAHomePage(this.driver);
	} */
}
