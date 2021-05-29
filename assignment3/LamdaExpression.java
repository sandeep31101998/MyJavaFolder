package com.technoelevate.assignment3;

import java.util.ArrayList;

public class LamdaExpression {

	public static void main(String[] args) {

		Demo d = () -> System.out.println("hello hi"); // no arguments
		d.display();
		Demo d1 = () -> { // no arguments
			System.out.println("stmt 1");
			System.out.println("stmt 2");
		};
		d1.display();

		Sum c1 = (n1, n2) -> n1 + n2;
		System.out.println(c1.sum(10, 20));

		Mul m1 = (n1, n2) -> n1 * n2;
		System.out.println(m1.mul(10, 10));

		Div d11 = (n1, n2) -> {
			if (n2 == 0) {
				System.err.print("cannot divide by ");
				return n2;
			} else {
				return n1 / n2;
			}
		};

		System.out.println(d11.div(10, 2));
		
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		
		al.forEach(e->System.out.println(e));

	}
}

interface Demo // functional interface contains only one method
{
	void display();
}

interface Sum {
	int sum(int n1, int n2);
}

interface Mul {
	int mul(int n1, int n2);
}

interface Div {
	int div(int n1, int n2);
}