package com.technoelevate.assignment;

import java.util.Scanner;

//a sentence containing every letter of the alphabet.
//being A quick brown fox jumps over the lazy dog
public class Panagram 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the sentence");
		String str = s.nextLine();
		
		boolean res = isPanagram(str);
		if(res)
		{
			System.out.println("string is panagram");
		}else
		{
			System.out.println("string is not panagram");
		}

	}

	private static boolean isPanagram(String str)
	{
		if(str.length()<26)
			return false;
		
		int count[] = new int[26];
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(ch>='A'&&ch<='Z')
			{
				count[ch-65]++;
			}
			else if(ch>='a'&&ch<='z')
			{
				count[ch-97]++;
			}
		}

		for(int i=0;i<26;i++)
		{
			if(count[i]==0)
				return false;
		}
		return true;
	}

}
