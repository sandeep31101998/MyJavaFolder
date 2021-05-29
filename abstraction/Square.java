package com.technoelevate.abstraction;

import java.util.Scanner;

public class Square extends Shape {
	Scanner s = new Scanner(System.in);
	double length,bredth;
	
	public void input() {
		
		System.out.println("enter the length and bredth of square");
		length = s.nextDouble();
		bredth = s.nextDouble();
	}

	@Override
	public void compute() {
		area = length*bredth;
	}

}
