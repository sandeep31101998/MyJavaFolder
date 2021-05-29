package com.technoelevate.interfaceprograms;

public class Apple implements Mobile {

	@Override
	public void call() {
		
		System.out.println("Calling from Apple phone");

	}

	@Override
	public void chat() {
		
		System.out.println("Chatting from Apple phone");

	}

	@Override
	public void cost() {
		
		System.out.println("The cost of Apple phone is 95000");

	}

}
