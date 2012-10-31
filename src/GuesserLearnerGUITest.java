import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GuesserLearnerGUITest {

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
		GuesserLearnerGUI gui = new GuesserLearnerGUI();
		String response = gui.askQuestion(question);
		assertNotNull(response);
		assert(response.equals("yes"));
	}
	
	@Test
	public void replaceObjectTest(){
		GuesserLearnerGUI gui = new GuesserLearnerGUI();
		String response = gui.replaceObject(correctValue, UIInterface.askObject);
		assertNotNull(response);
		assertFalse(response.contains("object"));
		assertEquals("Is it a flower?", response);
		
		response = gui.replaceObject(correctValue, gui.goodbye);
		assertFalse(response.contains("object"));
		assertEquals(gui.goodbye, response);
		
		
		response = gui.replaceObject(incorrectGuess, correctAnswer,
										UIInterface.askForQuestion);
		String expectedResponse = "Please enter a yes/no question" +
				" that distinguishes between a daisy " +
				"and a rose:";
		assertNotNull(response);
		assertEquals(expectedResponse, response);
	}

}
