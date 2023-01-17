package com.sgtesting.actitime.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksDemo {
	
	@Before
	public void I_open_the_Oracle_Database()
	{
		System.out.println("I open the Oracle 11g Express Edition Database");
	}
	
	@After
	public void I_connect_Oracle_Database()
	{
		System.out.println("I connect the Oracle 11g Express Edition Database");
	}
	

}
