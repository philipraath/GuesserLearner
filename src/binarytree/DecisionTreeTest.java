package binarytree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import decisiontreenodes.*;

public class DecisionTreeTest 
{
	private DecisionTree treeTest;
	
	//private boolean correctGuess;
	private String yes, no, question, thing;
	private QuestionNode<String> nextTesterQ;
	private ThingNode<String> nextTesterT;
	private ThingNode<String> yesChild;
	private ThingNode<String> noChild;
	
	ThingNode<String> noChildExpected;
	ThingNode<String> yesChildExpected;
	
	@Before
	public void initialize()
	{
		yes = "yes";
		no = "no";
		question = "question";
		thing = "thing";
		yesChild = new ThingNode<String>( yes );
		noChild = new ThingNode<String>( no );
		noChildExpected = new ThingNode<String>( no );
		yesChildExpected = new ThingNode<String>( yes );
		nextTesterQ = new QuestionNode<String>( question, noChild, yesChild );
		nextTesterT = new ThingNode<String>( thing );
	}
	
	@Test
	public void performTreeSurgery()
	{
		
	}
	
	/**
	 * Tests the DecisonTree's nextNoNode() method by determining
	 * that it returns the child referenced by the node's left pointer.
	 * Tests the following:
	 * 		1) the no child is returned and not null with a QuestionNode
	 * 		2) the child returned is null with ThingNode 
	 */
	@Test
	public void nextNoNodeTest()
	{
		treeTest = new DecisionTree( nextTesterQ ); // construct treeTest with a QuestionNode<String>
		
		// Test that nextNoNode() returns noChild in QuestionNode and not any other data
		assertNotNull( treeTest.nextNoNode() );
		assertEquals( noChild, treeTest.nextNoNode() );
		assertFalse( yesChildExpected.equals( treeTest.nextNoNode() ) );
		assertFalse( question.equals( treeTest.nextNoNode() ) );
		
		treeTest = new DecisionTree( nextTesterT ); // reconstruct treeTest with a ThingNode<String>
		
		// Test that nextNoNode() returns null from a ThingNode and not any other data
		assertNull( treeTest.nextNoNode());
		assertFalse( thing.equals( treeTest.nextNoNode() ) );
	}
	
	/**
	 * Tests the DecisonTree's nextYesNode() method by determining
	 * that it returns the child referenced by the node's right pointer.
	 * Tests the following:
	 * 		1) the yes child is returned and not null with a QuestionNode
	 * 		2) the child is returned is null with ThingNode 
	 */
	@Test
	public void nextYesNodeTest()
	{
		treeTest = new DecisionTree( nextTesterQ ); // construct treeTest with a QuestionNode<String>
		
		// Test that nextYesNode() returns yesChild in QuestionNode and not any other data
		assertNotNull( treeTest.nextYesNode() );
		assertEquals( yesChild, treeTest.nextYesNode() );
		assertFalse( noChildExpected.equals( treeTest.nextYesNode() ) );
		assertFalse( question.equals( treeTest.nextYesNode() ) );
		
		treeTest = new DecisionTree( nextTesterT ); // reconstruct treeTest with a ThingNode<String>
		
		// Test that nextYesNode() returns null in ThingNode
		assertNull( treeTest.nextYesNode());
		assertFalse( thing.equals( treeTest.nextYesNode() ) );
	}
}
