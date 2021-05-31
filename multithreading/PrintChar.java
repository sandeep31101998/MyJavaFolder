package com.technoelevate.multithreading;

public class PrintChar extends Thread {

	@Override
	public void run() {
		//System.out.println(Thread.currentThread().getName());
		for(int i=65;i<=90;i++)
		{
			System.out.println((char)(i));
			
		}
	}

	
}
