package com.technoelevate.hasarelationship;

public class CompAggrMain {

	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		
		Charger charger = new Charger("samsungCharger", 5);
		
//		System.out.println(mobile.os.os);
//		System.out.println(mobile.os.version);
		
		mobile.hasa(charger);
		
		mobile=null;
	
		System.out.println(mobile.os.os);
		System.out.println(mobile.os.version);
		
		System.out.println(charger.brand);
		System.out.println(charger.voltage);

	}

}
