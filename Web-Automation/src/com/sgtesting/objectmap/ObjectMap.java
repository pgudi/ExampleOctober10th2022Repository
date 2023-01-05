package com.sgtesting.objectmap;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class ObjectMap {
	public static Properties prop=null;
	public ObjectMap(String fileName)
	{
		FileInputStream fin=null;
		
		try
		{
			fin=new FileInputStream(fileName);
			prop=new Properties();
			
			prop.load(fin);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public By getLocator(String logicalname)
	{
		By by=null;
		try
		{
			String locatordetails=null;
			locatordetails=prop.getProperty(logicalname);
			String locator[]=locatordetails.split(";");
			String locatorName=locator[0];
			String locatorValue=locator[1];
			switch(locatorName.toLowerCase())
			{
			case "id":
				by=by.id(locatorValue);
				break;
			case "name":
				by=by.name(locatorValue);
				break;
			case "xpath":
				by=by.xpath(locatorValue);
				break;
			case "classname":
				by=by.className(locatorValue);
				break;
			case "cssselector":
				by=by.cssSelector(locatorValue);
				break;
			case "linktext":
				by=by.linkText(locatorValue);
				break;
			case "partiallinktext":
				by=by.partialLinkText(locatorValue);
				break;
			case "tagname":
				by=by.tagName(locatorValue);
				break;
			default:
				System.out.println("Invalid Locator Name !!!!");
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return by;
	}
}
