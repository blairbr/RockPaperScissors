package RockPaperScissors;

public class HumanPlayer extends Player {

	// Constructor
	public HumanPlayer(String name, String roshambo) {
		setName(name);
		setRoshambo(roshambo);
	}

	
	// override Roshambo METHOD
	@Override
	public String generateRoshambo() {
		return getRoshambo();
	}
}
