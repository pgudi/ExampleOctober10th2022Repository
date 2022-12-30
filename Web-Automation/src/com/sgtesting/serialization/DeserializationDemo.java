package com.sgtesting.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		FileInputStream fin=null;
		ObjectInputStream in=null;
		try
		{
			fin=new FileInputStream("F:\\EXAMPLE\\Employee.ser");
			in=new ObjectInputStream(fin);
			
			Employee empObject=(Employee) in.readObject();
			empObject.displayEmpNumber();
			empObject.displayEmpFirstName();
			empObject.displayJobName();
			empObject.displayCityName();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				in.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
