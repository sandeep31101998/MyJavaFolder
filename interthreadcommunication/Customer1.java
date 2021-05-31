package com.technoelevate.interthreadcommunication;

public class Customer1 extends Thread{

	BankAcc b;

	public Customer1(BankAcc b) {
		super();
		this.b = b;
	}
	
	public void run() {
		
		b.withDraw(20000);

	}
}
