package com.technoelevate.staticApp;

public class EmpMain {

	public static void main(String[] args)
	{
		System.out.println("Main method");
		Employee e1 = new Employee();
		e1.ename = "sandeep";
		e1.age = 23;
		e1.place = "bangalore";
		System.out.println();
		System.out.println(Employee.company);		
		System.out.println(e1.ename);
		System.out.println(e1.age);
		System.out.println(e1.place);
		
		System.out.println();
		
		Employee e2 = new Employee();
		e2.ename = "shashank";
		e2.age = 25;
		e2.place = "hampi";
		System.out.println(Employee.company);		
		System.out.println(e2.ename);
		System.out.println(e2.age);
		System.out.println(e2.place);
		
		
	}

}
