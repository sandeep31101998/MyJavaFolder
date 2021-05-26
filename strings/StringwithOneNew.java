package com.technoelevate.strings;

public class StringwithOneNew 
{
	public static void main(String[] args) {
		String s1 = new String("Techno");
		String s2 = "Techno";
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1==s2)
		{
			System.out.println("both are same");
		}else {
			System.out.println("both are  different");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("both are same");
		}else {
			System.out.println("both are  different");
		}
	}
	
}
