
import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GuesserLearnerUITest {

	String question;
	String correctValue = "flower";
	String incorrectGuess = "daisy";
	String correctAnswer = "rose";
	Properties properties;
	UIInterface ui;
	UIInterface gui;
	@Before
	public void setUp() throws Exception {
		question = "Is this a question? \nPlease enter 'yes'.";
		ui = new GuesserLearnerTUI();
		gui = new GuesserLearnerGUI();
		
		properties = new Properties();
		try{
			properties.load(new FileInputStream("config.properties"));
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
		askQuestion(ui);
		askQuestion(gui);
	}

	private void askQuestion(UIInterface ui) {
		String response = ui.askQuestion(question);
		assertNotNull(response);
		assert(response.equals("yes"));
	}
	
	@Test
	public void replaceObjectTest(){
		replaceObject(ui);
		replaceObject(gui);
	}

	private void replaceObject(UIInterface ui) {
		String response = ui.replaceObject(correctValue, 
				properties.getProperty("askObject"));
		assertNotNull(response);
		assertFalse(response.contains("object"));
		assertEquals("Is it a flower?", response);
		
		response = ui.replaceObject(correctValue, 
				properties.getProperty("stateGoodbye"));
		assertFalse(response.contains("object"));
		assertEquals(properties.getProperty("stateGoodbye"), response);
		
		response = ui.replaceObject(incorrectGuess, correctAnswer,
				properties.getProperty("askForDistinguishingQuestion"));
		String expectedResponse = "Please enter a yes/no question" +
				" that distinguishes between a daisy " +
				"and a rose:";
		assertNotNull(response);
		assertEquals(expectedResponse, response);
	}
}
