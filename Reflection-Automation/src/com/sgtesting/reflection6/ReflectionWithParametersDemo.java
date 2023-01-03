package com.sgtesting.reflection6;

import java.lang.reflect.Method;

public class ReflectionWithParametersDemo {
	public static void main(String[] args) {
		CustomerDetails obj=new CustomerDetails();
		
		try
		{
			//Two String parameters
			Class strparam[]=new Class[2];
			strparam[0]=String.class;
			strparam[1]=String.class;

			Method method=obj.getClass().getMethod("getPersonDetails", strparam);
			method.invoke(obj, new String("Santosh"),new String("Bangalore"));
			
			//one integer Parameters
			Class[] intpram=new Class[1];
			intpram[0]=Integer.TYPE;
			
			Method method2=obj.getClass().getMethod("displayEmpNumber", intpram);
			method2.invoke(obj, 7211);
			
			//One String parameter
			Class[] strparam1=new Class[1];
			strparam1[0]=String.class;
			
			Method method3=obj.getClass().getMethod("showStateName", strparam1);
			method3.invoke(obj, new String("Karnataka"));	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
