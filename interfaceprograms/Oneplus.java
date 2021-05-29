package com.technoelevate.interfaceprograms;

public class Oneplus implements Mobile {

	@Override
	public void call() {
		
		System.out.println("Calling from Oneplus phone");

	}

	@Override
	public void chat() {
		
		System.out.println("Chatting from oneplus phone");

	}

	@Override
	public void cost() {
		
		System.out.println("The cost of oneplus phone is 45000");

	}

}
