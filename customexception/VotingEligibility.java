package com.technoelevate.customexception;

public class VotingEligibility {

	int validAge = 18;
	
	public void vote(int age)
	{
		if(age<18)
		{
			throw new AgeValidator("You are not eligible for votting");
		}else {
			System.out.println(age+" your age is eligible for votting");
		}
	}
}
