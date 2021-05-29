package com.technoelevate.abstraction;
import java.util.*;
public class Circle extends Shape {

	Scanner s = new Scanner(System.in);
	double PI=3.142,r;
	
	@Override
	public void input() {
		System.out.println("enter the radius of circle");
		r=s.nextDouble();
	}

	@Override
	public void compute() {
		area=PI*r*r;
	}

}
