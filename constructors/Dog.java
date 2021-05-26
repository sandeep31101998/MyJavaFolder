package com.technoelevate.constructors;

public class Dog {

	private int age;
	private String breed;
	private String name;
	
	Dog(int age,String breed,String name)
	{
		this.age=age;
		this.breed=breed;
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	public String getBreed() {
		return breed;
	}
	public String getName() {
		return name;
	}
	
	
	
}
