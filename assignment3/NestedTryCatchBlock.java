package com.technoelevate.assignment3;

import java.util.*;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		int a[] = new int[3];

		a[0] = 25;
		a[1] = 20;
		a[2] = 19;

		Scanner s = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("ENTER THE INDEX TO DISPLAY NUMBER");
			int index = s.nextInt();
			try {
				System.out.println("This is 1st try block");
				try {
					System.out.println("This is 2nd try block");
					System.out.println(a[index]);
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("ENTERED INDEX NOT FOUND------------------------------");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("Finally block");
			}
		}
	}

}
