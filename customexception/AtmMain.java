package com.technoelevate.customexception;

public class AtmMain {

	public static void main(String[] args) throws InsufficientBalanceException {
		
		AtmSimulator a = new AtmSimulator();
		a.withdraw(5000);
		
	}

}
