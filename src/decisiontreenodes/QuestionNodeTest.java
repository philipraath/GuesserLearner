package decisiontreenodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QuestionNodeTest {
	
	private QuestionNode<String> root;
	private QuestionNode<String> nullNode;
	
	private String testValue = "test";
	
	/**
	 * Tests that a call to a QuestionNode's getQuestion()
	 * method returns the data stored in the value variable.
	 * Tests the following:
	 * 	1) that the returned value is the correct String, or null.
	 *  2) that the returned value is type String when not null.
	 *  3) that data in other QuestionNode fields are not returned.
	 */
	@Test
	public void getQuestionTest()
	{
		root = new QuestionNode<String>( "test", null, null );
		nullNode = new QuestionNode<String>( null, null, null );
		
		// Test that calling getQuestion() w/a null node returns null
		assertNull( nullNode.getQuestion() );
		
		// Test that getQuestion() return is not null when the field has 
		// an assigned value
		assertNotNull( root.getQuestion() );
				
		// Test that getQuestion() returns the correct data type
		assertTrue( root.getQuestion() instanceof String );
				
		// Test that getQuestion() returns the correct value 
		assertEquals( testValue, root.getQuestion() );
				
		// Test that getQuestion() returns the correct field from the BTNode<T>
		root = new QuestionNode<String>( "test", null, null );
		assertFalse( root.getQuestion().equals( null ) || 
				     root.getQuestion().equals( null ) );
	}
	
	/**
	 * Tests whether the toString method returns a string that reflects
	 * the data stored in the value variable of the QuestionNode. 
	 * Tests the following:
	 * 		1) that it returns a String appropriate to an instance's 
	 * 			toString() method
	 */
	@Test
	public void toStringTest()
	{
		root = new QuestionNode<String>( "test", null, null );
		nullNode = new QuestionNode<String>( null, null, null );
		
		// Test that calling toString() w/a null node throws 
		// NullPointerException and its handled.
		assertTrue( nullNode.toString().equals( "field was null" ) );
		
		// Test that toString() return is not null when the field has 
		// an assigned value
		assertNotNull( root.toString() );
				
		// Test that toString() returns a toString() version of the instantiated
		// value
		assertTrue( root.toString().equals( "test" ) );
		
		// Test that toString returns a String from the correct 
		// field in the QuestionNode<T>
		root = new QuestionNode<String>( "test", null, null );
		assertFalse( root.toString().equals( null ) || 
				     root.toString().equals( null ) );
	}
}
