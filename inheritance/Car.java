package com.technoelevate.inheritance;

public class Car {
	
	String name;
	String color;
	
	Car(String name,String color)
	{
		this.name=name;
		this.color=color;
	}

	public void running()
	{
		System.out.println("car is running");
	}
	
	final void finalmethod()
	{
		System.out.println("cannot change the implementation logic");
	}
	
}
