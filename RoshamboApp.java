package mainpackage;

import java.util.Scanner;

import RockPaperScissors.*;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Welcome to the Rock Paper Scissors game!");
		System.out.println("What's your name?");
		String name = scan1.nextLine();
		String keepGoing = "yes";

		while (keepGoing.equalsIgnoreCase("yes")) {
			System.out.println("Hi " + name
					+ ". Who do you want to play against, Kamel or Dwayne 'The Rock' Johnson? Enter Kamel or Dwayne");
			String opponent = scan1.nextLine();

			opponent = checkForValidOpponent(scan1, opponent);

			System.out.println("Rock, paper, or scissors?");
			String choice = scan1.nextLine();
			System.out.println(name + ":" + " " + choice);

			HumanPlayer human1 = new HumanPlayer(name, choice);
			String roshamboHuman = human1.generateRoshambo();

			if (opponent.equalsIgnoreCase("Dwayne")) {
				RockPlayer rockPlayer1 = new RockPlayer();
				System.out.println("Dwayne: " + rockPlayer1.generateRoshambo());

				determineRockWinner(roshamboHuman, rockPlayer1);
				
			} else {
				RandomPlayer randomPlayer1 = new RandomPlayer(name, choice);
				String roshamboRandomPlayer = randomPlayer1.generateRoshambo();
				System.out.println("Kamel: " + roshamboRandomPlayer);

				determineRandomWinner(human1, roshamboHuman, roshamboRandomPlayer);
			}
			System.out.println("Continue? (yes/no)");
			keepGoing = scan1.nextLine();
		}
	scan1.close();
	}

	public static void determineRandomWinner(HumanPlayer human1, String roshamboHuman, String roshamboRandomPlayer) {
		if (human1.generateRoshambo().equalsIgnoreCase(roshamboRandomPlayer)) {
			System.out.println("\nYou and Kamel tied.");
		}
		else if (roshamboHuman.equals("scissors") && roshamboRandomPlayer.equals("rock")) {
			System.out.println("\nYou lose. Boo hoo.");
		} else if (roshamboHuman.equals("scissors") && roshamboRandomPlayer.equals("paper")) {
			System.out.println("\nYou win!");
		} else if (roshamboHuman.equals("rock") && roshamboRandomPlayer.equals("paper")) {
			System.out.println("\nYou lose. Boo hoo.");
		} else if (roshamboHuman.equals("rock") && roshamboRandomPlayer.equals("scissors")) {
			System.out.println("\nYou win!");
		} else if (roshamboHuman.equals("paper") && roshamboRandomPlayer.equals("scissors")) {
			System.out.println("\nYou lose. Boo hoo.");
		} else {
			System.out.println("\nPaper covers rock. You win!");
		}
	}

	public static void determineRockWinner(String roshamboHuman, RockPlayer rockPlayer1) {
		if (roshamboHuman.equalsIgnoreCase(rockPlayer1.generateRoshambo())) {
			System.out.println("\nYou and Dwayne tied.");
		} else if (roshamboHuman.equals("scissors")) {
			System.out.println("\nYou lose. Boo hoo.");
		} else {
			System.out.println("\nYou win!");
		}
	}

	public static String checkForValidOpponent(Scanner scan1, String opponent) {
		while (!opponent.equalsIgnoreCase("Dwayne") && !opponent.equalsIgnoreCase("Kamel")) {
			System.out.println("Invalid response.  Please enter Dwayne or Kamel.");
			opponent = scan1.nextLine();
		}
		return opponent;
	}
}
