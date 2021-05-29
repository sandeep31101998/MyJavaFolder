package com.technoelevate.customexception;

public class Me {

	int balance = 100;
	public void hasMoney(int amount) throws NoMoneyException
	{
		if(amount > balance)
		{
			throw new NoMoneyException("i cant give money");
		}
		else {
			balance-=amount;
			System.out.println("My money balance :"+balance);
		}
	}
}
