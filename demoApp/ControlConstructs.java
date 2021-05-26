package com.technoelevate.demoApp;

public class ControlConstructs
{

	public static void main(String[] args) 
	{
		
		// if stmt and else if

		boolean login = false;
		boolean hasMoney = false;
		boolean Orderpizza = true;
		if (hasMoney && Orderpizza && login) 
		{
			System.out.println("You can order pizza");
			
		} 
		else if (!hasMoney && Orderpizza && login)
		{
			System.out.println("in sufficient money");
		} 
		else 
		{
			System.out.println("create an account");
		}

		// switch stmt
		int i = 10;
		switch (i) {
		case 1:
			System.out.println(" print 1");

			break;

		case 2:
			System.out.println(" print 2");

			break;

		default:
			System.out.println(" invalid input");
			break;
		}

	}

}
