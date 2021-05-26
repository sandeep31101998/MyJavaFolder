package com.technoelevate.strings;

public class MutableString {

	public static void main(String[] args) 
	{
		StringBuilder s1 = new StringBuilder("Techno");
		System.out.println(s1.capacity());
		
		StringBuffer s2 = new StringBuffer("Elevate");
		System.out.println(s2.capacity());
		
		System.out.println(s1.append(" Sandeep"));
		
		System.out.println(s2.append(" sandy"));
		
	}

}
