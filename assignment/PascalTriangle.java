package com.technoelevate.assignment;

import java.util.Scanner;

public class PascalTriangle 
{

	public static void main(String[] args) 
	{
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the row value");
		num=s.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int j=num;j>i;j--)
			{
				System.out.print(" ");
			}
			
			int val=1;
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(val+" ");
				val=val*(i-j)/(j+1);
			}
			System.out.println();
		}
	}

}
