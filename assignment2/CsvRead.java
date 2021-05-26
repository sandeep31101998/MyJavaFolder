package com.technoelevate.assignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvRead {

	public static void main(String[] args) throws IOException {

		FileReader f = new FileReader("E:\\Java\\DemoProj\\src\\com\\technoelevate\\assignment2\\Csv_file.csv");
		BufferedReader br = new BufferedReader(f);

		String line = "";

		while ((line = br.readLine()) != null) {

			String count[] = line.split(",");
			System.out.println(count[0] + " " + count[1] + " " + count[2] + " " + count[3]);
		}
	}

}
