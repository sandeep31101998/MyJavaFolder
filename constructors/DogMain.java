package com.technoelevate.constructors;

public class DogMain {

	public static void main(String[] args) {

		Dog d = new Dog(10,"pug","bunty");
		
		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println(d.getBreed());
	}

}
