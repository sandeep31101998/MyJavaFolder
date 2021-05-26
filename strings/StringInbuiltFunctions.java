package com.technoelevate.strings;

public class StringInbuiltFunctions {

	public static void main(String[] args) 
	{
		String s = "SaNdEeP";
		
		
		System.out.println(s.charAt(6));
		System.out.println(s.concat(" coder"));
		System.out.println(s.contains("SaN"));
		System.out.println(s.compareToIgnoreCase("sandeepp"));
		System.out.println(s.equalsIgnoreCase("sandeep"));
		System.out.println(s.indexOf("P"));
		System.out.println(s.endsWith("P"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.isEmpty());
		
		String s1 = "b";
		String s2 = "a";
		
		System.out.println(s1.compareTo(s2));
		

	}

}
