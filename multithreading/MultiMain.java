package com.technoelevate.multithreading;

import java.util.Iterator;

public class MultiMain {

	public static void main(String[] args) {//main thread
		
		//System.out.println(Thread.currentThread().getName());
		//Thread.currentThread().setPriority(7);
		
		//Thread.currentThread().setName("sandeep");
		//System.out.println(Thread.currentThread().getName());
		
		
		PrintNum t1 = new PrintNum();
		t1.start();
		//System.out.println(t1.getPriority());
		
		t1.yield();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
		
		PrintChar t2 = new PrintChar();
		t2.start();
		
		
		System.out.println("this is main method");
		
	}

}
