package com.technoelevate.interthreadcommunication;

public class Customer2 extends Thread {

	BankAcc b;

	public Customer2(BankAcc b) {
		super();
		this.b = b;
	}
	
	public void run()
	{
		b.deposit(30000);
	}
}
