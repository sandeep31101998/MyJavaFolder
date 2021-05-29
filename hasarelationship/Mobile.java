package com.technoelevate.hasarelationship;

public class Mobile {

	OperatingSystem os = new OperatingSystem("Android", 10);
	
	public void hasa(Charger c)
	{
		System.out.println(c.brand);
		System.out.println(c.voltage);
	}

}
