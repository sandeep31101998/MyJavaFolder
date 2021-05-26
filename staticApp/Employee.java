package com.technoelevate.staticApp;

public class Employee 
{
	static String company = "technoelevate";
	
	String ename;
	int age;
	String place;
	
	static {
		System.out.println("this is static block");
		company = "Test yantra";
	}
}
