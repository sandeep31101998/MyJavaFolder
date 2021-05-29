package com.technoelevate.hasarelationship;

public class Student {
	
	Heart heart = new Heart("heart is working", 90);
	Brain brain = new Brain(5, 1);
	
	public void hasaBook(Book book)
	{
		System.out.println(book.author);
		System.out.println(book.title);
	}
	
	public void hasaBike(Bike bike)
	{
		System.out.println(bike.brand);
		System.out.println(bike.mileage);
	}
	

}
