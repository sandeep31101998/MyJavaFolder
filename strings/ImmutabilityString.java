package com.technoelevate.strings;

public class ImmutabilityString {

	public static void main(String[] args) 
	{
		String s1 = "sandeep";
		String s2 = "sandeep";
		
		String s3 = s1.concat(" coder");
		System.out.println(s3);
		
		if(s1==s3)
		{
			System.out.println("references are equal");
		}else {
			System.out.println("references are not equal");
		}
		
		
		if(s1==s2)
		{
			System.out.println("references are equal");
		}else {
			System.out.println("references are not equal");
		}

	}

}
