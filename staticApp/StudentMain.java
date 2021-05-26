package com.technoelevate.staticApp;

public class StudentMain {

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.sname = "sandeep";
		s1.rollno = 1;
		System.out.println(s1.sname);
		System.out.println(s1.rollno);
		s1.study();
		
		System.out.println();
		
		Student s2 = new Student();
		s2.sname = "shashank";
		s2.rollno = 2;
		System.out.println(s2.sname);
		System.out.println(s2.rollno);
		s2.study();

	}

}
