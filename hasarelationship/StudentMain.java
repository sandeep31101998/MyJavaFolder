package com.technoelevate.hasarelationship;

public class StudentMain {

	public static void main(String[] args) 
	{
		Student student = new Student();
		
		System.out.println(student.heart.heartbeat);
		System.out.println(student.heart.weight);
		
		System.out.println(student.brain.weight);
		System.out.println(student.brain.iq);
		
		Bike bike = new Bike("BMW", 15);
		Book book = new Book("sandeep", "My life my wish");
		
		student.hasaBike(bike);
		student.hasaBook(book);
		
		student = null;
		
		System.out.println(bike.brand);
		System.out.println(bike.mileage);
		
		System.out.println(book.author);
		System.out.println(book.title);
		
	}

}
