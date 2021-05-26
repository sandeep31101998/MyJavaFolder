package com.technoelevate.inheritance;

public class SuperClass 
{
	int n=0;
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
