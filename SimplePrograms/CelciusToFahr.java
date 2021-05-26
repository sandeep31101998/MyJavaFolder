package com.technoelevate.SimplePrograms;

import java.util.Scanner;

public class CelciusToFahr {

	static double celciusToFahernheit(double c) {
		return (c * 9 / 5) + 32;
	}

	static double FahernheitTocelcius(double f) {
		return (f - 32) * 5 / 9;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("enter the celcius");
		double celcius = s.nextDouble();
		System.out.println("Fahernheit value is => " + celciusToFahernheit(celcius));

		System.out.println("enter the Fahernheit");
		double Fahernheit = s.nextDouble();
		System.out.println("celcius value is => " + FahernheitTocelcius(Fahernheit));
	}

}
