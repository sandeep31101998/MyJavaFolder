package com.technoelevate.inheritance;

public class SubClass extends SuperClass {
	
	public SubClass()
	{
		super(10);
		System.out.println("This is subclass constructor");
	}
	public void subMethod()
	{
		System.out.println("This is subclass method");
	}
	
	

	public static void main(String[] args) 
	{
		SubClass s = new SubClass();
		s.superMethod();
		s.subMethod();

	}
	

}
