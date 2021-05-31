package com.technoelevate.interthreadcommunication;

public class BankAcc {
	double balance = 10000;

	synchronized void withDraw(int amount) {
		System.out.println("Withdrawing is in progress");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (amount > balance) {
			System.out.println("insufficient balance wait till deposit is done");

			try {
				Thread.sleep(2000);
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("withdraw is successful");
			
		} else {
			System.out.println("withdraw is successful");

		}
	}

	synchronized void deposit(int amount) {
		System.out.println("old balance is "+balance);
		System.out.println("depositing is in progress of amount: "+amount);
		System.out.println("updated balance is "+(amount + balance));
		notify();
	}
}
