package com.sgtesting.tests;

import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number :");
		double x=sc.nextDouble();
		System.out.println("Enter Second Number :");
		double y=sc.nextDouble();
		
		double res=(x-y);
		System.out.println("Substraction Result :"+res);
		sc.close();

	}

}
