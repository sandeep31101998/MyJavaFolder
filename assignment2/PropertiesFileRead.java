package com.technoelevate.assignment2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileRead {

	public static void main(String[] args) throws IOException {
	
		FileReader fr = new FileReader("E:\\Java\\DemoProj\\src\\com\\technoelevate\\assignment2\\db.properties");
		Properties p = new Properties();
		p.load(fr);
		String name = p.getProperty("db.name");
		String phone = p.getProperty("db.phone");
		String desg = p.getProperty("db.designation");
		String place = p.getProperty("db.place");
		
		System.out.println(name+" "+phone+" "+desg+" "+place);
	}

}
