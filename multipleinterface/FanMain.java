package com.technoelevate.multipleinterface;

public class FanMain extends FanImpl {

	public static void main(String[] args) 
	{
		FanMain f = new FanMain();
		f.increaseSpeed();
		f.reduceSpeed();
		f.switchOn();
		f.switchOff();

	}

}
