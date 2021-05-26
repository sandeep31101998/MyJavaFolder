package com.technoelevate.game;
import java.util.Scanner;
public class Guesser {
	int guessNum;

	int guessNum() {
		Scanner s = new Scanner(System.in);
		guessNum = s.nextInt();
		return guessNum;

	}
}
