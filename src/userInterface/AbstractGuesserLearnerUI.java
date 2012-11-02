package userInterface;


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
	
	/**
     * Returns a char of either 'y' or 'n' from any input that starts with 'y' or 'n'
     * or continues to prod the user until it can.
     * @param yesNo - String obtained from user input via scanner.next()
     * @return testResponse - char that should either be 'y' or 'n'
     */
    public char validateYesOrNo( String yesNo ) 
    { 
        char testResponse = Character.toLowerCase(yesNo.charAt(0)); 
        while(testResponse!='y' && testResponse!='n') 
        { 
        	
            String response = invalidEntry("Please restrict your response to 'y' for yes or 'n' for no!\n" + 
            				"please try again: "); 
            testResponse = Character.toLowerCase(response.charAt(0)); 
        } 
        return testResponse;  
    }
    
    @Override
    /**
     * Displays an error message when validation of user input fails.
     */
    public String invalidEntry( String errorMessage )
    {
  	  String response = askQuestion(errorMessage);
  	  return response;
    }

}
