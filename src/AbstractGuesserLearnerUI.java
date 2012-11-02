

/**
 * @author philraath
 *
 */
public abstract class AbstractGuesserLearnerUI implements UIInterface {

	

	/* 
	 * @see UIInterface#displayStatment()
	 */
	@Override
	public void makeStatement(String statement) {
		display(statement);
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
