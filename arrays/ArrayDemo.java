package com.technoelevate.arrays;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) 
	{
		System.out.println(args[0]);
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the value of size");
		int n = s.nextInt();

		int arr[] = new int[n];
		
		System.out.println("enter "+n+" elements ");
		for(int i=0;i<arr.length;i++)
		{
//			System.out.println("enter the "+(i)+" number");
			arr[i]=s.nextInt();
		}
		
		int sum=0;
		System.out.println("sum of array elements are");
		for (int i = 0; i < arr.length; i++) 
		{
			sum=sum+arr[i];
			
		}
		System.out.println(sum);
		
		int largest = 0;
		System.out.println("largest of array is");
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>largest)
				largest=arr[i];
		}
		System.out.println(largest);
		
		int smallest = arr[0];
		System.out.println("smallest of array is");
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]<smallest)
				smallest=arr[i];
		}
		System.out.println(smallest);
		
		
	}

}
