package com.technoelevate.inheritance;

public class SuperClass 
{
	SuperClass()
	{
		System.out.println("This is superclass constructor");
	}
	
	int i;
	SuperClass(int i)
	{
		
		this.i=i;
		System.out.println(i);
	}
	
	public void superMethod()
	{
		System.out.println("this is super class method");
	}
}
