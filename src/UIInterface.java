
public interface UIInterface {
	
	/**
	 * Displays a welcome message.
	 */
	void displayWelcome();
	
	/**
	 * Displays a goodbye message.
	 */
	void displayGoodbye();
	
	/**
	 * Displays a message that requires an answer.
	 * @param question - question that requires an answer
	 * @return String containing response to questions
	 */
	String askQuestion(String question);
	
	/**
	 * Displays an informative message that does not require an answer.
	 * @param statement - statement to be displayed
	 */
	void makeStatement(String statement);
	
	/**
	 * Displays an input. 
	 * The purpose of this method is to abstract TUI and GUI 
	 * specific display methods within the code, and refer to any
	 * display function as display(). This increases readability, and only 
	 * requires changes in display method to be changed in one place.
	 * The nature of the display will depend on the application.
	 */
	void display(String input);
}
