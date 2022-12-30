package com.sgtesting.interfaces;
interface Student
{
	default void showBranchName(String name)
	{
		System.out.println("Branch Name :"+name);
	}
}

interface Library
{
	default void showBranchName(String name)
	{
		System.out.println("Branch Name :"+name);
	}
}

class DemoStudent implements Student, Library
{

	public void showBranchName(String name)
	{
		System.out.println("Branch Name :"+name);
	}
	
}
public class InterfaceDemo2 {
	public static void main(String[] args) {
		DemoStudent o=new DemoStudent();
		o.showBranchName("CSE");

	}

}
