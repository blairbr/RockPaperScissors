package RockPaperScissors;

public class RockPlayer extends Player {
	
	//constructor

	public RockPlayer() {
	}

	//method
	@Override
	public String generateRoshambo() {
		setRoshambo("rock");
		setName("Dwayne");
		return getRoshambo();
	}
}