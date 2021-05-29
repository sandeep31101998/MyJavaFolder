package com.technoelevate.hasarelationship;

public class Charger {

	String brand;
	double voltage;
	public Charger(String brand, double voltage) {
		super();
		this.brand = brand;
		this.voltage = voltage;
	}
	public String getBrand() {
		return brand;
	}
	public double getVoltage() {
		return voltage;
	}
}
