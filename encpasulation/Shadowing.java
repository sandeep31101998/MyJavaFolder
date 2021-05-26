package com.technoelevate.encpasulation;

public class Shadowing {
	
	int number;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;//this keyword variable shadowing
	}

	public static void main(String[] args) {
		
		Shadowing s = new Shadowing();
		s.setNumber(10);
		int n = s.getNumber();
		
		System.out.println(n);
		
	}

}
