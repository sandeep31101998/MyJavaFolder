package com.technoelevate.game;

import java.util.Scanner;

public class Umpire {
	int umpNumber;

	int UmpireGuess() {
		Scanner s = new Scanner(System.in);
		System.out.println("Umpire enter your number");
		umpNumber = s.nextInt();
		return umpNumber;
	}
}
