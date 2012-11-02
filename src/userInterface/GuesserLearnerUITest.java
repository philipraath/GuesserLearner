package userInterface;

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
	UIInterface tui;
	UIInterface gui;
	
	@Before
	public void setUp() throws Exception {
		question = "Is this a question? \nPlease enter 'yes'.";
		tui = new GuesserLearnerTUI();
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
		genericTestAskQuestion(tui);
		genericTestAskQuestion(gui);
	}
	
	@Test
	public void replaceObjectTest(){
		genericTestReplaceObject(tui);
		genericTestReplaceObject(gui);
	}

	private void genericTestAskQuestion(UIInterface ui) {
		String response = ui.askQuestion(question);
		assertNotNull(response);
		assert(response.equals("yes"));
	}

	private void genericTestReplaceObject(UIInterface ui) {
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
