package com.technoelevate.upcasting;
//parent is bigger datatype than child type , so it is implisit
public class UpcastingExample {

	public static void main(String[] args) 
	{
		Parent obj1 = new Child();
		Parent obj2 = new Child();
		
		obj1.PrintData();
		obj2.PrintData();

	}

}
