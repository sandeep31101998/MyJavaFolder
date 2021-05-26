package com.technoelevate.strings;

public class CreatingStringDiffWays {

	public static void main(String[] args) 
	{
		
		//immutable String
		String s1 = "sandeep";
		String s2 = new String("sandeep");
		char s3[] = {'s','a','n','d','e','e','p'};
		String s4 = new String(s3);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
