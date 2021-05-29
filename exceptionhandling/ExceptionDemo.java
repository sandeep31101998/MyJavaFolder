package com.technoelevate.exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a[] = new int[6];
		A b = new A();
		b=null;
		try {
			//System.out.println(a[1]);
			//System.out.println(1 / 0);
			b.add();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
		}

	}

}
