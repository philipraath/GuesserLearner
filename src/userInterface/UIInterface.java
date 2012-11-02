package userInterface;


public interface UIInterface {
	
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
	
	/** 
	 * Replaces the word "object" in a string with the input string.
	 * @param input - String to replace "object"
	 * @return processed String with "object" replaced
	 */
	String replaceObject(String input, String correctValue);
	
	/**
	 * Replaces the string "object1" with the incorrect guess, and replaces
	 * the string "object2" with the correct answer.
	 * @param String incorrectGuess - guess by program that is wrong
	 * @param String correctAnswer - object being thought of by user
	 * @param String unprocessed - string that refers generically to 
	 * 								incorrectGuess and correctAnswer
	 */
	String replaceObject(String incorrectGuess, String correctAnswer,
							String unprocessed);
}
