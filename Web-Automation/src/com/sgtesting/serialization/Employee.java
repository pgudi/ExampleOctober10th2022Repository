package com.sgtesting.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	private long empNo;
	private String firstName;
	private String jobName;
	private String cityName;
	
	public Employee(long empNo, String firstName, String jobName, String cityName) {
		this.empNo = empNo;
		this.firstName = firstName;
		this.jobName = jobName;
		this.cityName = cityName;
	}
	
	public void displayEmpNumber()
	{
		System.out.println("Employee Number :"+empNo);
	}
	
	public void displayEmpFirstName()
	{
		System.out.println("First Name :"+firstName);
	}

	public void displayJobName()
	{
		System.out.println("Job Name :"+jobName);
	}
	
	public void displayCityName()
	{
		System.out.println("City Name :"+cityName);
	}
}
