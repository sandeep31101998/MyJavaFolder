package com.technoelevate.inheritance;

public class Toyato extends Car {

	Toyato(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}
	public void running()
	{
		System.out.println("toyato car is running"); //over riding
	}
//	pubic void finalmethod()
//	{
//		System.out.println("cannot change the implementation logic"); //final method
//	}
}
