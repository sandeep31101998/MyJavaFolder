package com.technoelevate.assignment3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchFinallyBlockCombo {
	public static void writeData() throws IOException {
		FileWriter fw = new FileWriter("E:\\Java\\DemoProj\\src\\com\\technoelevate\\assignment2\\WriteData.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		try {
			bw.write("EmployeeName : sandeep\n");
			bw.write("Designation : JavaDeveloper\n");
			bw.write("Salary : 20,000\n");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

		System.out.println("-------------------write Sucessful--------------------------");
	}

	public static void readData() throws FileNotFoundException {
		FileReader fr = new FileReader("E:\\Java\\DemoProj\\src\\com\\technoelevate\\assignment2\\WriteData.txt");
		BufferedReader br = new BufferedReader(fr);

		String display;

		try {
			while ((display = br.readLine()) != null) {
				System.out.println(display);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

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

		if (b == false && s!=null) {
			s.close();
			System.out.println("Exit Successful");
		}

	}

}
