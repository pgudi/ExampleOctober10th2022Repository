package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		displayURL();
		displayTitle();
		displayLinkCount();
//		enterTextInTextField1();
//		enterTextInTextField2();
//		clickOnButtonField1();
//		clickOnButtonField2();
//		clickOnCheckBoxField1();
//		clickOnCheckBoxField2();
//		clickOnRadioButtonField1();
//		clickOnRadioButtonField2();
		selectItemFromDropDown();
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
	
	private static void displayURL()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		String url=(String) js.executeScript("var kk=document.URL;return kk;");
		System.out.println("URL :"+url);
	}
	
	private static void displayTitle()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		String title=(String) js.executeScript("var kk=document.title;return kk;");
		System.out.println("Title :"+title);
	}
	
	private static void displayLinkCount()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		long count=(long) js.executeScript("var kk=document.getElementsByTagName('A');return kk.length;");
		System.out.println("Link Count :"+count);
	}
	
	private static void enterTextInTextField1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('uid1user1name1').value='DemoUser1';");
	}
	
	private static void enterTextInTextField2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.name("pass1word1"));
		js.executeScript("arguments[0].value='Welcome123';",oEle);
	}

	private static void clickOnButtonField1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('btn1submit1button1').click();");
	}
	
	private static void clickOnButtonField2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.xpath("//input[@value='Submit']"));
		js.executeScript("arguments[0].click();",oEle);
	}
	
	private static void clickOnCheckBoxField1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('chk1windows').click();");
	}
	
	private static void clickOnCheckBoxField2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.xpath("//input[@id='chk2linux']"));
		js.executeScript("arguments[0].click();",oEle);
	}
	
	private static void clickOnRadioButtonField1()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('rad1chrome').click();");
	}
	
	private static void clickOnRadioButtonField2()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		WebElement oEle=oBrowser.findElement(By.xpath("//input[@id='rad2firefox']"));
		js.executeScript("arguments[0].click();",oEle);
	}
	
	private static void selectItemFromDropDown()
	{
		JavascriptExecutor js=(JavascriptExecutor) oBrowser;
		String strScript="var list=document.getElementById('tools');";
		strScript+="for(var i=0;i<list.length;i++)";
		strScript+="{";
		strScript+="if(list[i].text='Selenium IDE')";
		strScript+="{";
		strScript+="list[i].selected='1';";
		strScript+="}";
		strScript+="}";
		js.executeScript(strScript);
	}
}
