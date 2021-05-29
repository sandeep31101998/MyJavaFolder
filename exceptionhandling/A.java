package com.technoelevate.exceptionhandling;

public class A {

	static public void method() {
		System.out.println(1 / 0);
	}

	public void add() {
		method();
	}
}
