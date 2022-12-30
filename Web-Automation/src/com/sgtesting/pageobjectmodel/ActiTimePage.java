package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//Create WebElement for UserName text field
	private WebElement username;
	
	public WebElement getUserName()
	{
		return username;
	}
	
	//Create WebElement for Password text field
	private WebElement pwd;
	public WebElement getPwd() 
	{
		return pwd;
	}

	//Create WebElement for Login button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//Create WebElement for FlyOutWindow
	private WebElement gettingStartedShortcutsPanelId;
	
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//Create WebElement for Logout link
	@FindBy(linkText = "Logout")
	private WebElement oLogout;
	
	public WebElement getLogout()
	{
		return oLogout;
	}
}
