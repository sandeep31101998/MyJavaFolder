package com.technoelevate.synchronization;

public class Thread4 extends Thread{
	
	Table t;

	public Thread4(Table t) {
		super();
		this.t = t;
	}
	
	public void run()
	{
		t.printTable(10000);
	}

}
