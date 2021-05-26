package com.technoelevate.inheritance;

public class PlainMain {

	public static void main(String[] args) {
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();

//		pp.takeOff();
//		pp.fly();
//		pp.land();
//		
//		System.out.println();        //tight coupling
//		
//		fp.takeOff();
//		fp.fly();
//		fp.land();

		Plane p = new Plane();
		p = pp; // lose coupling
		p.takeOff();
		p.fly();
		p.land();
		((PassengerPlane) p).passengerCarry(); // downcasting

		System.out.println();

		p = fp;
		p.takeOff();
		p.fly();
		p.land();
		((FighterPlane) p).fighterCarry(); // downcasting
		
		
	}

}
