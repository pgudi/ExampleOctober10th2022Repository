package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopupBrowsersDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		handlingPopups();
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
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void handlingPopups()
	{
		try
		{
			WebElement oLink=oBrowser.findElement(By.linkText("actiTIME Inc."));
			System.out.println("Before click on link,Numbers of popups :"+getPopupCount());
			oLink.click();
			Thread.sleep(3000);
			System.out.println("After click on link,Numbers of popups :"+getPopupCount());
			if(getPopupCount()>0)
			{
				popupsTesting();
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static int getPopupCount()
	{
		int count=0;
		count=oBrowser.getWindowHandles().size()-1;
		return count;
	}

	private static void popupsTesting()
	{
		try
		{
			String parentBrowser=oBrowser.getWindowHandle();
			System.out.println("Parent Borwser :"+parentBrowser);
			Object popups[]=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<popups.length;i++)
			{
				String childBrowser=popups[i].toString();
				System.out.println("Child Browser :"+childBrowser);
				Thread.sleep(2000);
				oBrowser.switchTo().window(childBrowser);
				String childBrowserTitle=oBrowser.getTitle();
				System.out.println("childBrowserTitle :"+childBrowserTitle);
				oBrowser.findElement(By.linkText("Try Free")).click();
				Thread.sleep(2000);
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
