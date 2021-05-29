package com.technoelevate.constructors;

public class ConstructorOverload 
{
	String name;
	int age;
	
	public ConstructorOverload(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public ConstructorOverload(int age , String name) {
		this("sandeep", 12);
		this.age = age;
		this.name = name;
	}
	
	public static void main(String[] args) {
		
		ConstructorOverload c1 = new ConstructorOverload("sandeep",23);
		System.out.println(c1.name+" "+c1.age);
		
		ConstructorOverload c2 = new ConstructorOverload(23,"sandeep");
		System.out.println(c2.age+" "+c2.name);
	}
	
}
