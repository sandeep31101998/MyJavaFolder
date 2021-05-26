package com.technoelevate.game;

public class MainGame {

	public static void main(String[] args) {

		Umpire u = new Umpire();
		int un = u.UmpireGuess();

		Player p = new Player();
		int p1 = p.p1Guess();
		int p2 = p.p2Guess();
		int p3 = p.p3Guess();

		/*
		 * if (un == p1) { System.out.println("player 1 won"); } else if (un == p2) {
		 * System.out.println("player 2 won"); } else if (un == p3) {
		 * System.out.println("player 3 won"); } else { System.out.println("try again");
		 * }
		 */

		if (un == p1 && un == p2 && un == p3) {
			System.out.println("All player won the game");
		} else if (un == p1 && un == p2) {
			System.out.println("Player 1 and Player 2 won the game");
		} else if (un == p2 && un == p3) {
			System.out.println("Player 2 and player 3 won the game");
		} else if (un == p1 && un == p3) {
			System.out.println("Player 1 and player 3 won the game");
		} else if (un == p3) {
			System.out.println("Player 3 won the game");
		} else if (un == p2) {
			System.out.println("Player 2 won the game");
		} else if (un == p1) {
			System.out.println("Player 1 won the game");
		} else {
			System.out.println("Try again...!");
		}
	}

}
