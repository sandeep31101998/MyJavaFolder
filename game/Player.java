package com.technoelevate.game;
public class Player {
	int Player1;
	int Player2;
	int Player3;

	int p1Guess() {
		System.out.println("P1 enter p1 guess number");
		Guesser g = new Guesser();
		Player1 = g.guessNum();
		return Player1;
	}

	int p2Guess() {
		System.out.println("P2 enter p2 guess number");
		Guesser g = new Guesser();
		Player2 = g.guessNum();
		return Player2;
	}

	int p3Guess() {
		System.out.println("P3 enter p3 guess number");
		Guesser g = new Guesser();
		Player3 = g.guessNum();
		return Player3;
	}
}
