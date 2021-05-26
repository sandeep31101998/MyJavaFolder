package com.technoelevate.inheritance;

public class SubClass extends SuperClass {

	int n = 100;

	public SubClass() {
		this.n = super.n;
		System.out.println(n + " This is subclass constructor");
	}

	public void subMethod() {
		System.out.println("This is subclass method");
	}

	public static void main(String[] args) {
		SubClass s = new SubClass();
		s.superMethod();
		s.subMethod();

	}

}
