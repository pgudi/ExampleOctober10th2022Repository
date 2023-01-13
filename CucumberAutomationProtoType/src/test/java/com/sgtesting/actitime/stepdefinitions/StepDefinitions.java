package com.sgtesting.actitime.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	public static WebDriver oBrowser=null;
	/**
	 * Author:
	 * StepName:
	 * Description:
	 */
	@Given("^I launch the chrome browser$")
	public void I_launch_the_chrome_browser()
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
	
	/**
	 * Author:
	 * StepName:
	 * Description:
	 */
	@And("^I navigate the application url$")
	public void I_navigate_the_application_url()
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

	/**
	 * Author:
	 * StepName:
	 * Description:
	 */
	@When("^I enter the username in username text field$")
	public void I_enter_the_username_in_username_text_field()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * StepName:
	 * Description:
	 */
	@And("I enter the password in password text field")
	public void I_enter_the_password_in_password_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * StepName:
	 * Description:
	 */
	@And("^I click on login button$")
	public void I_click_on_login_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * StepName:
	 * Description:
	 */
	@Then("^I find the home page$")
	public void I_find_the_home_page()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * StepName:
	 * Description:
	 */
	@And("^I minimize the flyout window$")
	public void I_minimize_the_flyout_window()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * StepName:
	 * Description:
	 */
	@When("^I click on logout link$")
	public void I_click_on_logout_link()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * StepName:
	 * Description:
	 */
	@Then("^I find the login page$")
	public void I_find_the_login_page()
	{
		String expected,actual;
		try
		{
			expected="actiTIME - Login";
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * StepName:
	 * Description:
	 */
	@And("^I close the Application$")
	public void I_close_the_Application()
	{
		try
		{
			oBrowser.quit();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
