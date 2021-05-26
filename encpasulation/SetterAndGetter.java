package com.technoelevate.encpasulation;

public class SetterAndGetter {

	public static void main(String[] args) 
	{
		Encapsulation e = new Encapsulation();
		
		e.setEname("sandeep");
		e.setDept("development");
		e.setSal(0);
		
		String name = e.getEname();
		String dept = e.getDept();
		int sal = e.getSal();
		
		System.out.println(name);
		System.out.println(dept);
		System.out.println(sal);

	}

}
