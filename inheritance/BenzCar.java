package com.technoelevate.inheritance;

public class BenzCar extends Car {

	BenzCar(String name, String color) {
		super(name, color);
		
	}
	public void running()
	{
		System.out.println("benz car is running"); //over riding
	}
//	pubic void finalmethod()
//	{
//		System.out.println("cannot change the implementation logic"); //final method
//	}
	
	public static void main(String[] args) {
		
		
		
	}

}
