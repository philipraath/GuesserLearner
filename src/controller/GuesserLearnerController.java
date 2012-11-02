/**
 * 
 */
package controller;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JOptionPane;

import binarytree.*;
import decisiontreenodes.*;
import userInterface.*;
/**
 * @author philraath
 *
 */
public class GuesserLearnerController implements ControllerInterface {

	private final String FILENAME = "animalTree.ser"; 
	UIInterface ui;
	Properties properties;
	DecisionTree decisionTree;

	public GuesserLearnerController() 
    { 
    	setUp();
    	displayGreeting();
//    	displayInstructions();
    }
	
	@Override
	public void displayGreeting() {
		ui.display(properties.getProperty("stateGreeting"));
	}

	@Override
	public void displayInstructions(String typeOfObject) {
		String instructions = properties.getProperty("stateInstructions");
		String processedInstructions = ui.replaceObject(typeOfObject, instructions);
		ui.display(processedInstructions);
	}

	/* 
	 * @see controller.ControllerInterface#askAboutObject()
	 */
	@Override
	public boolean askAboutObject() {
		// TODO Auto-generated method stub
		return false;
	}

	/* 
	 * @see controller.ControllerInterface#displayVictory()
	 */
	@Override
	public void displayVictory() {
		ui.display(properties.getProperty("stateVictoryResponse"));
	}

	/* 
	 * @see controller.ControllerInterface#askGiveUpQuestion()
	 */
	@Override
	public String askGiveUpQuestion() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * @see controller.ControllerInterface#askForDistinguishingQuestion()
	 */
	@Override
	public String askForDistinguishingQuestion() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * @see controller.ControllerInterface#askForDistinguishingAnswer()
	 */
	@Override
	public String askForDistinguishingAnswer() {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * @see controller.ControllerInterface#askPlayAgain()
	 */
	@Override
	public boolean askPlayAgain() {
		// TODO Auto-generated method stub
		return false;
	}

	/* 
	 * @see controller.ControllerInterface#setUp()
	 */
	@Override
	public void setUp() {
		if(chooseUIMode())
    	{
    		this.ui = new GuesserLearnerTUI();
    	}
    	else
    	{
    		this.ui = new GuesserLearnerGUI();
    	}
    	
    	properties = new Properties();
		try{
			properties.load(new FileInputStream("config.properties"));
		}
		catch(IOException ex){
			ex.printStackTrace();
		}

	}

	/* 
	 * @see controller.ControllerInterface#tearDown()
	 */
	@Override
	public void tearDown() {
		// TODO Auto-generated method stub

	}

	/* 
	 * @see controller.ControllerInterface#displayGoodbye()
	 */
	@Override
	public void displayGoodbye() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean chooseUIMode() {
		String question = "Would you like to use the graphical or " +
				"command line version of the game?";
	  	
		String[] options = {"Graphical", "Command Line"};
	  	Boolean returnValue = false;
	  	int response = JOptionPane.showOptionDialog(
	  			null, 
	  			question, 
	  			null, 
	  			JOptionPane.YES_NO_OPTION, 
	  			JOptionPane.PLAIN_MESSAGE, 
	  			null, 
	  			options, 
	  			null);
	  	if(response == 0){returnValue = false;}
	  	else {returnValue = true;}
	  	return returnValue;  
	}
	
	public void saveToFile(){
//		decisionTree.serialize();
	}
	
	public boolean isThingNode(){
		
		DecisionTreeNode<String> tempNode = decisionTree.getRoot();
		
		return (tempNode == null || (tempNode.getLeftChild() == null && tempNode.getRightChild() == null));
	}
	
	public void setDecisionTreeRoot(DecisionTreeNode<String> root){
		decisionTree = new DecisionTree(root);
	}

	@Override
	public void treeChoice() {
		String userResponse = ui.askQuestion("Would you like to start " +
				"from scratch or load a file? Please enter 'y' to start from scratch, or 'n' to load a file.");
		char response = ui.validateYesOrNo( ( Character.valueOf( userResponse.charAt( 0 ) ).toString() ) );
		
		if (response == 'y')
		{
			decisionTree = new DecisionTree();
		}
		else
		{
			decisionTree = new DecisionTree(FILENAME);
		}
		
	}

}
