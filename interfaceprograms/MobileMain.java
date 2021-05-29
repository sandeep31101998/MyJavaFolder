package com.technoelevate.interfaceprograms;

public class MobileMain {

	public static void main(String[] args) {
		
		Selection s = new Selection();
		
		Mobile m = new Oneplus();
		s.select(m);
		
		System.out.println();
		
		m=new Redmi();
		s.select(m);
		
		System.out.println();
		
		m=new Apple();
		s.select(m);
		
	}

}
