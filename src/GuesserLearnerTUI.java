import java.util.Scanner;

/**
 * 
 */

/**
 * @author philraath
 *
 */
public class GuesserLearnerTUI extends AbstractGuesserLearnerTUI {

	static Scanner inputReader = new Scanner(System.in);
	/* 
	 * @see UIInterface#displayWelcome()
	 */
	@Override
	public void displayWelcome() {

	}

	/* 
	 * @see UIInterface#displayGoodbye()
	 */
	@Override
	public void displayGoodbye() {
	}

	/* 
	 * @see UIInterface#displayQuestion()
	 */
	@Override
	public String askQuestion(String question) {
		System.out.println(question);
		return inputReader.next();
	}

	/* 
	 * @see UIInterface#displayStatment()
	 */
	@Override
	public void displayStatment(String statement) {

	}
}
