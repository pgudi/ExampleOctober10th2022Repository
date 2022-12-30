package com.sgtesting.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		try
		{
			fout=new FileOutputStream("F:\\EXAMPLE\\Employee.ser");
			out=new ObjectOutputStream(fout);
			Employee obj=new Employee(7522, "James", "Manager", "Dallas");
			
			out.writeObject(obj);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				out.close();
				fout.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}

	}

}
