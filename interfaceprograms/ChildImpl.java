package com.technoelevate.interfaceprograms;

public class ChildImpl implements ChildInf {

	@Override
	public void method() {
		
		System.out.println("this is the child implementation class");

	}

	public static void main(String[] args) {
		
		ChildImpl c = new ChildImpl();
		c.method();

	}

}
