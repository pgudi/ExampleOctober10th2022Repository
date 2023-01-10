package com.sgtesting.interfaces;
interface EnggCollege
{
	void displayEngineeringCollegeName(String name);
}

interface Subjects
{
	void showSubjects(String [] subjects);
}

class SLNCollege implements EnggCollege,Subjects
{
	public void displayEngineeringCollegeName(String name)
	{
		System.out.println("College Name :"+name);
	}
	
	public void showSubjects(String [] subjects)
	{
		System.out.println("Subjects ...");
		for(int i=0;i<subjects.length;i++)
		{
			System.out.println(subjects[i]);
		}
	}
}
public class InterfaceDemo3 {
	public static void main(String[] args) {
		EnggCollege obj1=new SLNCollege();
		obj1.displayEngineeringCollegeName("SLN Engineering College");
		
		Subjects subjects=(Subjects) obj1;
		subjects.showSubjects(new String[] {"Maths","Java","JavaScript","HTML"});;

	}

}
