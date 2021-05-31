package com.technoelevate.synchronization;

public class Thread1 extends Thread {
	Table t;

	public Thread1(Table t) {
		super();
		this.t = t;
	}

	public void run() {
		t.printTable(10);
	}

}
