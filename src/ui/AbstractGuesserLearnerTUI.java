package ui;
import java.util.Scanner;

/**
 * @author philraath
 *
 */
public abstract class AbstractGuesserLearnerTUI implements UIInterface {

	protected static final Scanner inputReader = new Scanner(System.in);

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
