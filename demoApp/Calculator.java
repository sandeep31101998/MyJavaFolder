package com.technoelevate.demoApp;

public class Calculator {
	
	String name;
	int age;
	

	void add() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	void add(int a, double b) {
		short c = (short) b;
		System.out.println(a + c);
	}

	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add();
		c.add(20, 25.5f);
		c.name = "sandeep";
		c.age = 23;
		System.out.println(c.name);
		System.out.println(c.age);
		
	}
}
