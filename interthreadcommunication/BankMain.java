package com.technoelevate.interthreadcommunication;

public class BankMain {

	public static void main(String[] args) {
		
		BankAcc b = new BankAcc();
		
		Customer1 c1 = new Customer1(b);
		Customer2 c2 = new Customer2(b);
		
		c1.start();
		c2.start();

	}

}
