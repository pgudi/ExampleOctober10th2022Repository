package com.sgtesting.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo1 {
	public static void main(String[] args) {
	//	matchesDemo();
	//	findDemo();
	//	countOfMatch();
	//	displayMatches();
	//	replaceDemo();
		splitDemo();
	}
	
	private static void matchesDemo()
	{
		Pattern pattern=Pattern.compile("Java");
		Matcher match=pattern.matcher("Java1");
		boolean val=match.matches();
		System.out.println(val);
	}
	
	private static void findDemo()
	{
		Pattern pattern=Pattern.compile("Java");
		Matcher match=pattern.matcher("Java JRE JVM Java JDK Java");
		
		boolean val=match.find();
		System.out.println(val);
	}
	
	private static void countOfMatch()
	{
		Pattern pattern=Pattern.compile("Java");
		Matcher match=pattern.matcher("Java JRE JVM Java JDK Java");
		int count=0;
		while(match.find())
		{
			count+=1;
		}
		System.out.println("# of Matches :"+count);
	}

	private static void displayMatches()
	{
		Pattern pattern=Pattern.compile("Java");
		Matcher match=pattern.matcher("Java JRE JVM Java JDK Java");
		while(match.find())
		{
			System.out.println(match.group());
		}
	}
	
	private static void replaceDemo()
	{
		Pattern pattern=Pattern.compile("Java");
		Matcher match=pattern.matcher("Java JRE JVM Java JDK Java");
		
		String val=match.replaceAll("JavaScripting");
		System.out.println(val);
	}
	
	private static void splitDemo()
	{
		Pattern pattern=Pattern.compile(",");
		String s[]=pattern.split("Apple,Mango,Orange,Banana");
		for(String kk:s)
		{
			System.out.println(kk);
		}
	}
}
