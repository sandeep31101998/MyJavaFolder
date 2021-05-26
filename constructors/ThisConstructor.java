package com.technoelevate.constructors;

//constructor chaining
public class ThisConstructor {

	public ThisConstructor() {
		System.out.println("this is 1st constructor");
	}

	public ThisConstructor(int i) {
		this();
		System.out.println("this is 2nd constructor");
	}

	public static void main(String[] args) {
		ThisConstructor tc = new ThisConstructor(1);
	}

}
