package com.sgtesting.tests;

public class ExecuteAutoITDemo {

	public static void main(String[] args) {
		executeAutoIT();

	}
	
	private static void executeAutoIT()
	{
		try
		{
	//		Runtime.getRuntime().exec("F:\\ExampleAutomation\\AutoIT\\FirstTestScript.exe");
			
			Runtime obj=Runtime.getRuntime();
			obj.exec("F:\\ExampleAutomation\\AutoIT\\ThirdTestScriptSaveFile.exe");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
