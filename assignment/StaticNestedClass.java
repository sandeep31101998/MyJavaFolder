package com.technoelevate.assignment;

public class StaticNestedClass {
	
	public static class InnerClass
	{
		public void innerMethod()
		{
			System.out.println("i am static inner class method");
		}
	}

	public static void main(String[] args) {
		
		StaticNestedClass.InnerClass s = new StaticNestedClass.InnerClass();
		s.innerMethod();

	}

}
