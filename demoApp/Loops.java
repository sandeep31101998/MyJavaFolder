package com.technoelevate.demoApp;

import java.util.Iterator;

public class Loops {

	public static void main(String[] args) {
		// while loop
		/*
		 * int i=1; while(i<=5) { System.out.println("*"); i++; }
		 */

		// do while
		/*
		 * int j = 1; do { System.out.print("*"); j++; }while(j<=5);
		 */

		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if ((i % 2) != 0 || j == 1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				if (i == j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
