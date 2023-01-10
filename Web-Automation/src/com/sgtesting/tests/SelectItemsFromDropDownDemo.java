package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectItemsFromDropDownDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		selectItems();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("file:///F:/HTML/Sample.html");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void selectItems()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.id("tools"));
			Select oSelect=new Select(oEle);
			oSelect.selectByIndex(1);
			Thread.sleep(2000);
			oSelect.selectByValue("rc");
			Thread.sleep(2000);
			oSelect.selectByVisibleText("Selenium WebDriver");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
