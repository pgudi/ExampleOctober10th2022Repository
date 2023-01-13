package com.sgtesting.actitime.testsuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features="src/test/resources/FeatureFiles",
		glue="com.sgtesting.actitime.stepdefinitions"
		)
public class DriverScript {
	
	private TestNGCucumberRunner testngCucumberRunner=null;
	@BeforeClass(alwaysRun = true)
	public void setUpClass()
	{
		testngCucumberRunner=new TestNGCucumberRunner(this.getClass());
	}
	
	@Test(dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature)throws Throwable
	{
		testngCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	
	@DataProvider
	public Object[][] features() 
	{
		if(testngCucumberRunner==null)
		{
			testngCucumberRunner=new TestNGCucumberRunner(this.getClass());
		}
		return testngCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass()
	{
		testngCucumberRunner.finish();
	}
	
	
}
