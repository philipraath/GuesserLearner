package userInterface;

import javax.swing.JOptionPane;

/**
 * @author philraath
 *
 */
public class GuesserLearnerGUI extends AbstractGuesserLearnerUI {		

	/* (non-Javadoc)
	 * @see UIInterface#askQuestion(java.lang.String)
	 */
	@Override
	public String askQuestion(String question) {
		return JOptionPane.showInputDialog(question);
	}

	/* (non-Javadoc)
	 * @see UIInterface#display(java.lang.String)
	 */
	@Override
	public void display(String input) {
		JOptionPane.showMessageDialog(null, input);
	}
}

	