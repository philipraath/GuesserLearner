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
	
	@Test
	public void invalidEntryTest(){
		genericTestInvalidEntry(tui);
		genericTestInvalidEntry(gui);
	}
	
	@Test
	public void validateYesOrNoTest(){
		genericTestValidateYesOrNo(tui);
		genericTestValidateYesOrNo(gui);
	}

	/**
	 * tests the askQuestion method for UIInterface
	 * @param ui - can receive either a graphic or text based
	 * 				instance of UIInterface
	 */
	private void genericTestAskQuestion(UIInterface ui) {
		String response = ui.askQuestion(question);
		assertNotNull(response);
		assert(response.equals("yes"));
	}

	/**
	 * tests the replaceObject method for UIInterface
	 * @param ui - can receive either a graphic or text based
	 * 				instance of UIInterface
	 */
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
	
	private void genericTestInvalidEntry(UIInterface ui){
		String response = ui.invalidEntry("Please enter 'yes' " +
				"to test invalidEntry");
		assertNotNull(response);
		assert(response.equals("yes"));
	}
	
	private void genericTestValidateYesOrNo(UIInterface ui){
		char response = ui.validateYesOrNo("y");
		assertTrue(response == 'y');
		response = ui.validateYesOrNo("Y");
		assertTrue(response == 'y');
		response = ui.validateYesOrNo("n");
		assertTrue(response == 'n');
		response = ui.validateYesOrNo("N");
		assertTrue(response == 'n');
		
		response = ui.validateYesOrNo("yasdfasdfasdf");
		assertTrue(response == 'y');
		response = ui.validateYesOrNo("Yasdfasdfas");
		assertTrue(response == 'y');
		response = ui.validateYesOrNo("nasdfasdfa");
		assertTrue(response == 'n');
		response = ui.validateYesOrNo("Nasdfasdf");
		assertTrue(response == 'n');
	}
}
