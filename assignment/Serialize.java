package com.technoelevate.assignment;
import java.io.*;
//marker interface
public class Serialize implements Serializable
{
	
	String name ;
	int age ;

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Serialize s = new Serialize();
		s.name = "sandeep";
		s.age = 23;
		
		File f = new File("emp.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Serialize s2 = (Serialize) ois.readObject();
		
		System.out.println(s2.name+" "+s2.age);
	}

}

