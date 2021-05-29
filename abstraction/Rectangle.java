package com.technoelevate.abstraction;

import java.util.Scanner;

public class Rectangle extends Shape {

	Scanner s = new Scanner(System.in);
	double length,bredth;
	@Override
	public void input() {

		System.out.println("enter the length and bredth of Rectangle");
		length = s.nextDouble();
		bredth = s.nextDouble();

	}

	@Override
	public void compute() {
		area = length*bredth;

	}

}
