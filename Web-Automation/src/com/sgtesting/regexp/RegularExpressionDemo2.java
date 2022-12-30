package com.sgtesting.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo2 {

	public static void main(String[] args) {
	//	regexpTesting1();
	//	regexpTesting2();
		regexpTesting3();
	}
	
	private static void regexpTesting1()
	{
		Pattern pattern=Pattern.compile("[0-9][0-9][0-9]");
		String str="Bangalore received 125 milimeter of rain yesterday";
		Matcher match=pattern.matcher(str);
		
		boolean val=match.find();
		System.out.println(val);
	}
	
	private static void regexpTesting2()
	{
		Pattern pattern=Pattern.compile("[0-9][0-9][0-9]");
		String str="Bangalore received 125 milimeter of rain yesterday";
		Matcher match=pattern.matcher(str);
		
		String val=match.replaceAll("many");
		System.out.println(val);
	}

	private static void regexpTesting3()
	{
		Pattern pattern=Pattern.compile("[0-9]{3}");
		String str="Bangalore received 125 milimeter of rain yesterday";
		Matcher match=pattern.matcher(str);
		
		String val=match.replaceAll("many");
		System.out.println(val);
	}
}
