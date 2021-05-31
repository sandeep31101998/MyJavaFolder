package com.technoelevate.runnableinterface;

public class ThreadR1 implements Runnable {

	@Override
	public void run() {
		
		for(int i=65;i<=90;i++)
		{
			System.out.println((char)(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
