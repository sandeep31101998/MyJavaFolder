package com.technoelevate.inheritance;

public class CarMain {

	public static void main(String[] args) {

		BenzCar bc = new BenzCar("benz series 1", "mat black");
		MaruthiCar mc = new MaruthiCar("baleno", "grey");
		Toyato t = new Toyato("etios", "black");
		Car c = new Car("car", "car");
		c = mc;
		System.out.println(c.name);
		System.out.println(c.color);
		c.running();
		System.out.println();
		c = bc;
		System.out.println(c.name);
		System.out.println(c.color);
		c.running();
		System.out.println();
		c = t;
		System.out.println(c.name);
		System.out.println(c.color);
		c.running();
	}

}
