package ui;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GuesserLearnerTUITest {

	String question;
	String correctValue = "flower";
	String incorrectGuess = "daisy";
	String correctAnswer = "rose";
	@Before
	public void setUp() throws Exception {
		question = "Is this a question? \nPlease enter 'yes'.";
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void askQuestionTest() {
		GuesserLearnerTUI tui = new GuesserLearnerTUI();
		String response = tui.askQuestion(question);
		assertNotNull(response);
		assert(response.equals("yes"));
	}
	
	@Test
	public void replaceObjectTest(){
		GuesserLearnerTUI tui = new GuesserLearnerTUI();
		String response = tui.replaceObject(correctValue, UserCommunicationStrings.askObject);
		assertNotNull(response);
		assertFalse(response.contains("object"));
		assertEquals("Is it a flower?", response);
		
		response = tui.replaceObject(correctValue, UserCommunicationStrings.stateGoodbye);
		assertFalse(response.contains("object"));
		assertEquals(UserCommunicationStrings.stateGoodbye, response);
		
		
		response = tui.replaceObject(incorrectGuess, correctAnswer,
										UserCommunicationStrings.askForDistinguishingQuestion);
		String expectedResponse = "Please enter a yes/no question" +
				" that distinguishes between a daisy " +
				"and a rose:";
		assertNotNull(response);
		assertEquals(expectedResponse, response);
	}
}
