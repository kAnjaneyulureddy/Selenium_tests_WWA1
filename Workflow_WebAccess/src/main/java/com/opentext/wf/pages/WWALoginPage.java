package com.opentext.wf.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class WWALoginPage extends CommonPage {
	
	@FindBy(id="m_txtUserName")
	WebElement userName;
	
	@FindBy(id="m_txtPassword")
	WebElement Password;
	
	@FindBy(id="btnLogin")
	WebElement loginButton;
	
	
	
	

	public WWALoginPage(WebDriver driver)
	{
		super(driver);
		
		PageFactory.initElements(driver, this);
	    
		wait.until(ExpectedConditions.visibilityOf(userName));
		
		if(!(driver.getTitle().contains("Login")))
				{
			        throw new IllegalStateException("This is not login page");
			        
				}
				
	}
	
	private void enterUserName(String strUserName)
	{
	    userName.clear();
	    userName.sendKeys(strUserName);
	}
	
	private void enterPassword(String strPassword)
	{
		Password.clear();
		Password.sendKeys(strPassword);
	}
	
	private void clickOnLogIn()
	{
		loginButton.click();
	}
	
	public WWAHomePage Login(String strUserName, String strPassword)
	{
	   enterUserName(strUserName);
	   enterPassword(strPassword);
	   clickOnLogIn();
	   
	   return new WWAHomePage(this.driver);
	}
	
	
}
