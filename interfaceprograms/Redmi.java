package com.technoelevate.interfaceprograms;

public class Redmi implements Mobile {

	@Override
	public void call() {
		
		System.out.println("Calling from redmi phone");

	}

	@Override
	public void chat() {
		
		System.out.println("Chatting from redmi phone");
	}

	@Override
	public void cost() {
		
		System.out.println("The cost of redmi phone is 15000");
	}

}
