
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
	void displayStatment(String statement);
}
