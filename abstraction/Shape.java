package com.technoelevate.abstraction;

public abstract class Shape {
	
	double area;
	
	public abstract void input();
	public abstract void compute();
	public void display()
	{
		System.out.println("area is: "+area);
	}
}
