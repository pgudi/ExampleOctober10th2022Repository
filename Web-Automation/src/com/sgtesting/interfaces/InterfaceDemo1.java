package com.sgtesting.interfaces;
interface University
{
	void showUniversityName(String name);
	
	static void showCollegeName(String name)
	{
		System.out.println("College Name is "+name);
	}
}

class SLNEngg implements University
{
	public void showUniversityName(String name)
	{
		System.out.println("University Name is "+name);
	}
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		SLNEngg obj=new SLNEngg();
		obj.showUniversityName("VTU Belguam");
		University.showCollegeName("SLN Engineering College");

	}

}
