
import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GuesserLearnerTUITest {

	String question;
	String correctValue = "flower";
	String incorrectGuess = "daisy";
	String correctAnswer = "rose";
	Properties prop;
	@Before
	public void setUp() throws Exception {
		question = "Is this a question? \nPlease enter 'yes'.";
		prop = new Properties();
		try{
			prop.load(new FileInputStream("config.properties"));
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
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
		String response = tui.replaceObject(correctValue, prop.getProperty("askObject"));
		assertNotNull(response);
		assertFalse(response.contains("object"));
		assertEquals("Is it a flower?", response);
		
		response = tui.replaceObject(correctValue, prop.getProperty("stateGoodbye"));
		assertFalse(response.contains("object"));
		assertEquals(prop.getProperty("stateGoodbye"), response);
		
		response = tui.replaceObject(correctValue, prop.getProperty("stateGreeting"));
		assertFalse(response.contains("object"));
		assertEquals(prop.getProperty("stateGreeting"), response);
		
		
		response = tui.replaceObject(incorrectGuess, correctAnswer,
										prop.getProperty("askForDistinguishingQuestion"));
		String expectedResponse = "Please enter a yes/no question" +
				" that distinguishes between a daisy " +
				"and a rose:";
		assertNotNull(response);
		assertEquals(expectedResponse, response);
	}
}