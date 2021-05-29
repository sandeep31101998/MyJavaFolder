package com.technoelevate.abstraction;

public class ShapeMain {

	public static void main(String[] args) 
	{
		Selection sel = new Selection();
		
		Shape s = new Rectangle();
		sel.select(s);
		
		s=new Square();
		sel.select(s);
		
		s=new Circle();
		sel.select(s);
	}

}
