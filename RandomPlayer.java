package RockPaperScissors;

import java.util.Random;

public class RandomPlayer extends Player {

	// constructor
	public RandomPlayer(String name, String roshambo) {
		setName("Kamel");
		setRoshambo(getRoshambo());
	}

	// getRochambo method
	@Override
	public String generateRoshambo() {
		String random = "";
		Random rn = new Random();
		int answer = rn.nextInt(3) + 1;
		if (answer == 1) {
			random = "rock";
		} else if (answer == 2) {
			random = "scissors";
		} else {
			random = "paper";
		}
		return random;
	}
}
