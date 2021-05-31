package com.technoelevate.assignment3;

/*The Java for-each loop or enhanced for loop is introduced since J2SE 5.0. 
It provides an alternative approach to traverse the array or collection in Java.
It is mainly used to traverse the array or collection elements.
The advantage of the for-each loop is that it eliminates the possibility of bugs and makes the code more readable.
It is known as the for-each loop because it traverses each element one by one.*/

import java.util.Scanner;

public class ForEachLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = s.nextInt();

		int arr[] = new int[n];

		System.out.println("enter the array elements");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		System.out.println("displaying array elements using for-each loop");
		for (int res : arr) {
			System.out.println(res);
		}
		
	}

}
