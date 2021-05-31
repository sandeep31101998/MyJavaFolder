package com.technoelevate.synchronization;

public class Thread3 extends Thread{
	
	Table t;

	public Thread3(Table t) {
		super();
		this.t = t;
	}
	
	public void run()
	{
		t.printTable(100);
	}

}
