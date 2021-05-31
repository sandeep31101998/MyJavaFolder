package com.technoelevate.synchronization;

public class Table {

	synchronized static void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n*i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
