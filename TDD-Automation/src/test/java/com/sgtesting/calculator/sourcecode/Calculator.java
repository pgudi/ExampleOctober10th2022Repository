package com.sgtesting.calculator.sourcecode;

public class Calculator {
	/**
	 * Method Name: Multiplication 
	 * Description: Multiply the integer Numbers
	 */
	public int multiplication(int number1,int number2)
	{
		int result=0;
		try
		{
			result=(number1*number2);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Method Name: Multiplication 
	 * Description: Multiply the integer Numbers
	 */
	public int multiplication(int numbers[])
	{
		int result=0;
		try
		{
			for(int i=0;i<numbers.length;i++)
			{
				result=result*numbers[i];
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Method Name: Division 
	 * Description: Dividing the integer Numbers
	 */
	public int division(int number1,int number2)
	{
		int result=0;
		try
		{
			result=(number1/number2);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Method Name: Subtraction 
	 * Description: Substracting the integer Numbers
	 */
	public int Subtraction(int number1,int number2)
	{
		int result=0;
		try
		{
			result=(number1-number2);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Method Name: Addition 
	 * Description: Adding the integer Numbers
	 */
	public int addition(int number1,int number2)
	{
		int result=0;
		try
		{
			result=(number1+number2);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Method Name: Addition 
	 * Description: Adding the integer Numbers
	 */
	public int addition(int numbers[])
	{
		int result=0;
		try
		{
			for(int i=0;i<numbers.length;i++)
			{
				result=result+numbers[i];
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
}
