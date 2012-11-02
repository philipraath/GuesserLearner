package controller;

public interface ControllerInterface {

	public void displayGreeting();
	
	public void displayInstructions(String typeOfObject);
	
	public boolean askAboutObject();
	
	public void displayVictory();
	
	public String askGiveUpQuestion();
	
	public String askForDistinguishingQuestion();
	
	public String askForDistinguishingAnswer();
	
	public boolean askPlayAgain();
	
	public void setUp();
	
	public void tearDown();
	
	public void displayGoodbye();
	
	/**
	 * asks if the user prefers a text or graphic based interface
	 * @return boolean - 0 = text, 1 = graphic
	 */
	public boolean chooseUIMode();
	
	public void treeChoice();
	
	public void saveToFile();
}
