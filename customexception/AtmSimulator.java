package com.technoelevate.customexception;

public class AtmSimulator {

	public int balance = 10000;
	
	void withdraw(int amount) throws InsufficientBalanceException
	{
		if(amount<=0)
		{
		  throw	new InsufficientBalanceException("Invalid amount");
		}else if(amount>balance)
		{
		throw new InsufficientBalanceException("withdraw amount greater than balance amount");
		}else {
			balance-=amount;
			System.out.println("new balance :"+balance);
		}
	}
}
