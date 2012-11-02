package ui;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author philraath
 *
 */
public class GuesserLearnerTUI extends AbstractGuesserLearnerTUI {

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
	 * @see UIInterface#display(java.lang.String)
	 */
	@Override
	public void display(String input) {
		System.out.println(input);
	}
	
	
}
