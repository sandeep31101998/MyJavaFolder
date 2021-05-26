package com.technoelevate.nonstatic;

public class NonStaticDemo 
{
	{
		System.out.println("this is nonstatic block");
	}
	
	String s = "sandeep";
	int age = 23;
	
	public NonStaticDemo(){
		System.out.println("this is constructor");
	}

	public void NonstaticMethod()
	{
		System.out.println("Non static method");
	}
	public static void main(String[] args)
	{
		
		NonStaticDemo nd = new NonStaticDemo();
		nd.NonstaticMethod();

	}

}
