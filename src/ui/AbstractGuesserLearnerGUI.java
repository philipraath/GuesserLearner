package ui;
import javax.swing.JOptionPane;
/**
 * @author philraath
 *
 */
public abstract class AbstractGuesserLearnerGUI implements UIInterface {

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
	
	/*
	 * @see UIInterface#replaceObject(java.lang.String)
	 */
	public String replaceObject(String correctValue, String generic){
		return generic.replaceAll("object", correctValue);
	}
	
	/*
	 * @see UIInterface#replaceObject(java.lang.String, java.lang.String, 
	 * 								  java.lang.String)
	 */
	public String replaceObject(String incorrectGuess, String correctAnswer,
								String generic){
		String processed;
		processed = generic.replaceAll("incorrectGuess", incorrectGuess);
		processed = processed.replaceAll("correctAnswer", correctAnswer);
		return processed;		
	}

}
