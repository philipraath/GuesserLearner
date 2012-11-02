package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import decisiontreenodes.DecisionTreeNode;
import decisiontreenodes.QuestionNode;
import decisiontreenodes.ThingNode;

import binarytree.DecisionTree;

public class GuesserLearnerControllerTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void controllerTest(){
//		GuesserLearnerController controller = new GuesserLearnerController();
//		controller.displayGreeting();
//		controller.displayVictory();
	}
	
	@Test
	public void askUIPreferenceTest() {
		GuesserLearnerController controller = new GuesserLearnerController();
		boolean response = controller.chooseUIMode();
		assertNotNull(response);
		assertNotNull(controller.ui);
		assert(controller.ui.getClass().toString().contains("userInterface.GuesserLearner"));
	}
	
	@Test
	public void displayInstructionsTest(){
		GuesserLearnerController controller = new GuesserLearnerController();
		controller.displayInstructions("animal");
	}
	
	@Test
	public void isThingTest(){
		GuesserLearnerController controller = new GuesserLearnerController();
		DecisionTreeNode<String> noChild = new ThingNode<String>("thing1");
		DecisionTreeNode<String> yesChild = new ThingNode<String>("thing2");
		DecisionTreeNode<String> root = new QuestionNode<String>("question", noChild, yesChild );
		controller.setDecisionTreeRoot(root);
		boolean result = controller.isThingNode();
		assertFalse(result);
		
		root = noChild;
		controller.setDecisionTreeRoot(root);
		result = controller.isThingNode();
		assertTrue(result);
	}
}
