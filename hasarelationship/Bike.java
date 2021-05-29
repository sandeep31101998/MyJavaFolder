package com.technoelevate.hasarelationship;

public class Bike {

	String brand;
	int mileage;
	public String getBrand() {
		return brand;
	}
	public int getMileage() {
		return mileage;
	}
	public Bike(String brand, int mileage) {
		super();
		this.brand = brand;
		this.mileage = mileage;
	}
}
