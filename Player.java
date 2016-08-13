package RockPaperScissors;

public abstract class Player {
//properties
	private String name;
	private String roshambo;
//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoshambo() {
		return roshambo;
	}
	public void setRoshambo(String roshambo) {
		this.roshambo = roshambo;
	}
// not using a constructor 
	
	//method
	public abstract String generateRoshambo();	
}

