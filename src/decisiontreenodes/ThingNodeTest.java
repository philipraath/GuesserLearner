package decisiontreenodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ThingNodeTest {
	
	private ThingNode<String> root;
	private ThingNode<String> nullNode;
	
	private String testValue = "test";
	
	/**
	 * Tests that a call to a ThingNode's getThing()
	 * method returns the data stored in the 'value' variable.
	 * Tests the following:
	 * 	1) that the returned value is the correct String, or null.
	 *  2) that the returned value is type String when not null.
	 *  3) that data in other ThingNode fields are not returned. 
	 */
	@Test
	public void getThingTest()
	{
		root = new ThingNode<String>( "test" );
		nullNode = new ThingNode<String>( null );
		
		// Test that calling getThing() w/a null node returns null
		assertNull( nullNode.getThing() );
		
		// Test that getThing() return is not null when the field has 
		// an assigned value
		assertNotNull( root.getThing() );
				
		// Test that getThing() returns the correct data type
		assertTrue( root.getThing() instanceof String );
				
		// Test that getThing() returns the correct value 
		assertEquals( testValue, root.getThing() );
				
		// Test that getThing() returns the correct field from the BTNode<T>
		root = new ThingNode<String>( "test" );
		assertFalse( root.getThing().equals( null ) || 
				     root.getThing().equals( null ) );
	}
	
	/**
	 * Tests whether the toString method returns a string that reflects
	 * the data stored in the value variable of the ThingNode. 
	 * Tests the following:
	 * 		1) that it returns a String appropriate to an instance's 
	 * 			toString() method
	 */
	@Test
	public void toStringTest()
	{
		root = new ThingNode<String>( "test" );
		nullNode = new ThingNode<String>( null );
		
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
		// field in the ThingNode<T>
		root = new ThingNode<String>( "test" );
		assertFalse( root.toString().equals( null ) || 
				     root.toString().equals( null ) );
	}
}
