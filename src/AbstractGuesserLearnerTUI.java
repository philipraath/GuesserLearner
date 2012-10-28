import java.util.Scanner;

/**
 * @author philraath
 *
 */
public abstract class AbstractGuesserLearnerTUI implements UIInterface {

	static Scanner inputReader = new Scanner(System.in);
	/* 
	 * @see UIInterface#displayWelcome()
	 */
	@Override
	public void displayWelcome() {
		display("Welcome to the Guesser/Learner application!");
	}

	/* 
	 * @see UIInterface#displayGoodbye()
	 */
	@Override
	public void displayGoodbye() {
		display("Goodbye! Thanks for playing!");
	}

	/* 
	 * @see UIInterface#displayQuestion()
	 */
	@Override
	public String askQuestion(String question) {
		display(question);
		return inputReader.next();
	}

	/* 
	 * @see UIInterface#displayStatment()
	 */
	@Override
	public void makeStatement(String statement) {
		display(statement);
	}
	
	/*
	 * @see UIInterface#display(java.lang.String)
	 */
	public void display(String input) {
		System.out.println(input);
	}

}
