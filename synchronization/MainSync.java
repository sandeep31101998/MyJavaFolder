package com.technoelevate.synchronization;

public class MainSync {

	public static void main(String[] args) {
		Table table1 = new Table();
		Table table2 = new Table();
		
		Thread1 t1 = new Thread1(table2);//10
		Thread2 t2 = new Thread2(table2);//100
		Thread3 t3 = new Thread3(table1);//1000
		Thread4 t4 = new Thread4(table1);//10000
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
