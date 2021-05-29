package com.technoelevate.downcasting;

public class Downcasting {

	public static void main(String[] args) {
		
		Parent p = new Child();
		p.name="sandeep";
		
		Child c = (Child) p;
		
		 c.age = 18;   
	        System.out.println(c.name);   
	        System.out.println(c.age);   
	        c.showMessage();

	}

}
