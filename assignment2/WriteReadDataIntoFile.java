package com.technoelevate.assignment2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteReadDataIntoFile {

	public static void writeData() throws IOException {
		FileWriter fw = new FileWriter("E:\\Java\\DemoProj\\src\\com\\technoelevate\\assignment2\\WriteData.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("EmployeeName : sandeep\n");
		bw.write("Designation : JavaDeveloper\n");
		bw.write("Salary : 20,000\n");
		fw.flush();
		bw.close();
		bw.close();
		System.out.println("-------------------write Sucessful--------------------------");
	}

	public static void readData() throws IOException {
		FileReader fr = new FileReader("E:\\Java\\DemoProj\\src\\com\\technoelevate\\assignment2\\WriteData.txt");
		BufferedReader br = new BufferedReader(fr);

		String display;

		while ((display = br.readLine()) != null) {
			System.out.println(display);
		}

		br.close();
		fr.close();
		System.out.println("-------------------Read Sucessful--------------------------");
	}

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		boolean b = true;
		while (b) {
			System.out.println();
			System.out.println("1.WriteData\n2.ReadData\n3.Exit");
			System.out.println("ENTER YOUR CHOICE");
			int ch = s.nextInt();
			System.out.println();
			switch (ch) {
			case 1:
				writeData();
				break;
			case 2:
				readData();
				break;
			case 3:
				b = false;
				break;
			default:
				System.out.println("invalid choice");
				break;
			}
		}
		
		if(b==false)
		{
			System.out.println("Exit Successful");
		}
	}

}
