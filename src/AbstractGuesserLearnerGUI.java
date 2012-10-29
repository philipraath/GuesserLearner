import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author philraath
 *
 */
public abstract class AbstractGuesserLearnerGUI implements UIInterface {

	/* (non-Javadoc)
	 * @see UIInterface#displayWelcome()
	 */
	@Override
	public void displayWelcome() {
		display("Welcome to the Guesser/Learner application!");
	}

	/* (non-Javadoc)
	 * @see UIInterface#displayGoodbye()
	 */
	@Override
	public void displayGoodbye() {
		display("Goodbye! Thanks for playing!");

	}

	/* (non-Javadoc)
	 * @see UIInterface#askQuestion(java.lang.String)
	 */
	@Override
	public String askQuestion(String question) {
		return JOptionPane.showInputDialog(question);
	}

	/* (non-Javadoc)
	 * @see UIInterface#makeStatement(java.lang.String)
	 */
	@Override
	public void makeStatement(String statement) {
		display(statement);
	}

	/* (non-Javadoc)
	 * @see UIInterface#display(java.lang.String)
	 */
	@Override
	public void display(String input) {
		JOptionPane.showMessageDialog(null, input);

	}

}
