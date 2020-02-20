package com.example.demo;

public class RPS {

	public static int Comp = (int) (3 * Math.random()) + 1;

	public static String game(String Player1) {
		String CompChoice = "";

		if (Comp == 1) {
			
			CompChoice = "ROCK";
		} else if (Comp == 2) {

			CompChoice = "PAPER";
		} else if (Comp == 3) {

			CompChoice = "SCISSORS";
		} else {
		}

		if (Player1.equals(CompChoice)) {

			return "Player 1 choose " + Player1 + " & The computer choose " + CompChoice + " Its a Draw"; 


		}

		else {

			boolean playerWon = false;

			if (CompChoice.equals("ROCK")) {
				if (Player1.equals("PAPER"))
					playerWon = true;

				else
					playerWon = false;
			} else if (CompChoice.equals("PAPER")) {
				if (Player1.equals("SCISSORS"))
					playerWon = true;
				else
					playerWon = false;
			} else if (CompChoice.equals("SCISSORS")) {
				if (Player1.equals("ROCK"))
					playerWon = true;
				else
					playerWon = false;
			}

			if (playerWon)
				return "Player 1 choose " + Player1 + " & the computer choose " + CompChoice + " Player 1 wins";
			else { 
				if(Player1.equals("ROCK") && Player1.equals("PAPER") && Player1.equals("SCISSORS")) {
					return "Player 1 choose " + Player1 + " & the computer choose " + CompChoice + " The computer wins";

				}
				else {
					return "The player chose an invalid object";
				}
				}
				//hej
			
		}

	}

}
