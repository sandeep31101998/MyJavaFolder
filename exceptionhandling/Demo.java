package com.technoelevate.exceptionhandling;

public class Demo {

	public static void main(String[] args) {
		System.out.println(1);
		try {
		System.out.println(2/0);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(3);
	}

}
