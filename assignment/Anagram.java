package com.technoelevate.assignment;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("enter the first string");
		String str1 = s.next();
		System.out.println("enter the second string");
		String str2 = s.next();

		boolean res = isAnagram(str1, str2);

		if (res) {
			System.out.println("the string is anagram");
		} else {
			System.out.println("the string is not anagram");
		}
	}

	private static boolean isAnagram(String str1, String str2) {
		int count1[] = new int[26];
		int count2[] = new int[26];

		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				count1[ch - 65]++;
			} else if (ch >= 'a' && ch <= 'z') {
				count1[ch - 97]++;
			}
		}
		
		for (int i = 0; i < str2.length(); i++) {
			char ch = str2.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				count2[ch - 65]++;
			} else if (ch >= 'a' && ch <= 'z') {
				count2[ch - 97]++;
			}
		}
		
		for(int i=0;i<count1.length;i++)
		{
			if(count1[i]!=count2[i])
				return false;
		}
		
		return true;

	}

}
