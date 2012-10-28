import java.util.Scanner;

/**
 * 
 */

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
		// TODO Auto-generated method stub

	}

	/* 
	 * @see UIInterface#displayGoodbye()
	 */
	@Override
	public void displayGoodbye() {
		// TODO Auto-generated method stub

	}

	/* 
	 * @see UIInterface#displayQuestion()
	 */
	@Override
	public String askQuestion(String question) {
		return null;
	}

	/* 
	 * @see UIInterface#displayStatment()
	 */
	@Override
	public void displayStatment(String statement) {
		// TODO Auto-generated method stub

	}

}
