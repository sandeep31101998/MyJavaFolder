package com.technoelevate.exceptionhandling;

public class Amain {

	public static void main(String[] args) {
		A a = new A();
		try {
			a.add();
		} catch (Exception e) {
			 e.printStackTrace();
			System.out.println(e.getMessage()); 
			System.out.println(e);
		}

		System.out.println("this is after try and catch block");

	}

}
