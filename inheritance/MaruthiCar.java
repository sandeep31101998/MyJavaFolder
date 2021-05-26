package com.technoelevate.inheritance;

public class MaruthiCar extends Car {

	MaruthiCar(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}
	public void running()
	{
		System.out.println("maruthi car is running"); //over riding
	}
//	pubic void finalmethod()
//	{
//		System.out.println("cannot change the implementation logic"); //final method
//	}

}
