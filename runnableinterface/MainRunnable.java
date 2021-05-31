package com.technoelevate.runnableinterface;

public class MainRunnable {

	public static void main(String[] args) {
		
		ThreadR tr = new ThreadR();
		Thread t = new Thread(tr);
		t.start();

		ThreadR1 tr1 = new ThreadR1();
		Thread t1 = new Thread(tr1);
		t1.start();
		
		System.out.println("hai");
		System.out.println("hai");
		System.out.println("hai");
	}

}
