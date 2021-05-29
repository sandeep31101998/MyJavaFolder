package com.technoelevate.multipleinterface;

public class FanImpl implements Iswitch,Iregulator {

	@Override
	public void increaseSpeed() {
		System.out.println("speed is incresased");
		
	}

	@Override
	public void reduceSpeed() {
		System.out.println("speed is reduced");
		
	}

	@Override
	public void switchOn() {
		System.out.println("Switch on");
		
	}

	@Override
	public void switchOff() {
		System.out.println("Switch off");
		
	}

}
