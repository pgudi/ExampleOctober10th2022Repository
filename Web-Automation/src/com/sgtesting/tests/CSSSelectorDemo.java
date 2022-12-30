package com.sgtesting.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	absolutecssPath();
	//	relativeCSSByTagNameAlone();
	//	relativeCSSByTagNameWithIDAttributeValue();
	//	relativeCSSByIDAttributeValue();
	//	relativeCSSByTagNameWithClassAttributeValue();
	//	relativeCSSByClassAttributeValue();
	//	relativeCSSByTagNameWithAttributeNameAndValue();
	//	relativeCSSByTagNameWithMultipleAttributeNameAndValue();
	//	relativeCSSByPartialMatchingOfAttributeValue();
	//	relativeCSSByTagNameWithAttributeNameCombination();
	//	relativeCSSByTagNameWithAttributeNameCombination_1();
	//	relativeCSSByTagNameWithAttributeNameCombination_2();
	//	relativeCSSByTagNameWithAttributeNameCombination_3();
	//	relativeCSSByNthChildConcept();
		relativeCSSByFollowingSiblingConcept();
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
	
	/**
	 * absolute cssSelector
	 */
	private static void absolutecssPath()
	{
		oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser1");
	}
	
	/*
	 * case 1: Identify the Element based on tag alone
	 * Syntax: <tagName>
	 */
	private static void relativeCSSByTagNameAlone()
	{
		oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser2");
	}
	
	/*
	 * case 2: Identify the Element based on tagName with id attribute value
	 * Syntax: <tagName>#<id attribute value>
	 */
	private static void relativeCSSByTagNameWithIDAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("DemoUser2");
	}

	/*
	 * case 3: Identify the Element based id attribute value alone
	 * Syntax: #<id attribute value>
	 */
	private static void relativeCSSByIDAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("DemoUser2");
	}
	
	/*
	 * case 4: Identify the Element based on tagName with class attribute value
	 * Syntax: <tagName>.<class attribute value>
	 */
	private static void relativeCSSByTagNameWithClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("DemoUser3");
	}
	
	/*
	 * case 5: Identify the Element based class attribute value
	 * Syntax: .<class attribute value>
	 */
	private static void relativeCSSByClassAttributeValue()
	{
		oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("DemoUser4");
	}
	
	/*
	 * case 6: Identify the Element based tagName with attributeName and value combination
	 * Syntax: <tagName>[attributeName='attribteValue']
	 */
	private static void relativeCSSByTagNameWithAttributeNameAndValue()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit']")).click();
	}
	
	/*
	 * case 7: Identify the Element based tagName with Multiple attributeName and value combination
	 * Syntax: <tagName>[attributeName='attribteValue']
	 */
	private static void relativeCSSByTagNameWithMultipleAttributeNameAndValue()
	{
		oBrowser.findElement(By.cssSelector("input[value='Submit'][class='submit1btn1']")).click();
	}
	
	/*
	 * case 8: Identify the Element based tagName with attributeName and value combination
	 *    ^=  --> strts-with
	 *    *=  --> contains
	 *    $=  --> ends-with
	 * Syntax: <tagName>[attributeName ^= 'attribteValue']
	 * Syntax: <tagName>[attributeName *= 'attribteValue']
	 * Syntax: <tagName>[attributeName $= 'attribteValue']
	 */
	private static void relativeCSSByPartialMatchingOfAttributeValue()
	{
	//	oBrowser.findElement(By.cssSelector("input[value ^= 'Sub']")).click();
		oBrowser.findElement(By.cssSelector("input[id *= 'submit']")).click();
	}
	
	/*
	 * case 9: Identify the Element based tagName with attributeName combination
	 * Syntax: <tagName>[attributeName]
	 */
	private static void relativeCSSByTagNameWithAttributeNameCombination()
	{
		//Display Number of Links 
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		System.out.println("# of Links :"+olinks.size());
	}
	
	private static void relativeCSSByTagNameWithAttributeNameCombination_1()
	{
		//Display Link Names
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			String linkname=olinks.get(i).getText();
			System.out.println(linkname);
		}
	}
	
	private static void relativeCSSByTagNameWithAttributeNameCombination_2()
	{
		//Based on partial Matching of ends with identify the link
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			String linkname=olinks.get(i).getText();
			if(linkname.endsWith("Tool"))
			{
				olinks.get(i).click();
				break;
			}
		}
	}
	
	private static void relativeCSSByTagNameWithAttributeNameCombination_3()
	{
		//Stale Element Reference Exception
		//stale element reference: element is not attached to the page document
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			String linkname=olinks.get(i).getText();
			if(linkname.endsWith("Institute"))
			{
				olinks.get(i).click();
				
			}
		}
	}
	
	/*
	 * case 10: Identify the Element based nth-child concept
	 * Syntax:   :nth-child(number)
	 */
	private static void relativeCSSByNthChildConcept()
	{
	//	oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(4)")).sendKeys("DemoUser1");
		oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(1)")).sendKeys("DemoUser1");
	}
	
	/*
	 * case 11: Identify the Element based following sibling appraoch
	 * Syntax:   <tagName> + <tagName> + <tagName>
	 */
	private static void relativeCSSByFollowingSiblingConcept()
	{
		oBrowser.findElement(By.cssSelector("form#frm3 > input + input + input + input")).sendKeys("DemoUser1111");
	}
}
