package decisiontreenodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BTNodeTest {
	
	private BTNode<String> root;
	private BTNode<String> leftNode;
	private BTNode<String> rightNode;
	
	private BTNode<Integer> integerNode;
	private BTNode<Integer> rightIntegerNode;
	private BTNode<Integer> leftIntegerNode;
	
	private BTNode<Boolean> booleanNode;
	private BTNode<Boolean> rightBooleanNode;
	private BTNode<Boolean> leftBooleanNode;
		
	private String value = "test";
	private Integer testNum = new Integer( 10 );
	private Boolean testBool = new Boolean( false );
	private String integerStr = "10";
	private String boolStr = "false";
		
	/**
	 * Tests that a BTNode<T> pointed to by a given BTNode's left
	 * pointer returns the correct BTNode<T> or null. Tests the following:
	 * 		1) that it returns a BTNode<T>
	 *		2) that it returns a BTNode<T> identical to root.left
	 * 			including the data and its pointers (or null)
	 * 		3) does not return some other field from the BTNode<T>
	 */
	@Test
	public void getLeftChildTest()
	{
		leftNode = new BTNode<String>( "left" );
		rightNode = new BTNode<String> ( "right" );
		root = new BTNode<String> ( value, leftNode, rightNode );
		
		// Test that it returns a BTNode<?>
		assertTrue( root.getLeftChild() instanceof BTNode<?> );
		
		// Test that it returns a BTNode<T> identical to root.left
		assertEquals( leftNode, root.getLeftChild() );
		
		// Test that it returns only the BTNode<T> pointed to by root.left
		assertFalse( rightNode.equals( root.getLeftChild() ) );
		assertFalse( value.equals( root.getLeftChild() ) );
		
		// Test that checks for a null pointer
		root = new BTNode<String>();
		assertNull( root.getLeftChild() );
	}
	
	/**
	 * Tests that a BTNode<T> pointed to by a given BTNode's right
	 * pointer returns the correct BTNode<T> or null. Tests the following:
 	 *		1) that it returns a BTNode<T>
  	 *		2) that it returns a BTNode<T> identical to root.right
  	 *			including the data and its pointers (or null)
	 */
	@Test
	public void getRightChildTest()
	{
		leftNode = new BTNode<String>( "left" );
		rightNode = new BTNode<String> ( "right" );
		root = new BTNode<String> ( value, leftNode, rightNode );
		
		// Test that it returns a BTNode<?>
		assertTrue( root.getRightChild() instanceof BTNode<?> );
		
		// Test that it returns a BTNode<E> identical to root.right
		assertEquals( rightNode, root.getRightChild() );
		
		// Test that it returns only the BTNode<T> pointed to by root.right
		assertFalse( leftNode.equals( root.getRightChild() ) );
		assertFalse( value.equals( root.getRightChild() ) );
		
		// Test that checks for a null pointer
		root = new BTNode<String>();
		assertNull( root.getRightChild() );
	}
	
	/**
	 * Tests whether the BTNode's getValue() method returns
	 * the correct data. Tests the following:
	 * 		1) that it returns the correct data type for String, Integer and Boolean.
	 * 			and that it returns something when the field is not null
	 * 			1a) returns null when the field is null
	 * 		2) that it returns the value assigned to a BTNode<String>, BTNode<Integer>
	 * 			and BTNode<Boolean>.
	 * 		3) that it does not return any value from child fields.
	 */
	@Test
	public void getValueTest()
	{
		root = new BTNode<String>( "test" );
		integerNode = new BTNode<Integer>( 10 );
		booleanNode = new BTNode<Boolean>( false );
		BTNode<String> nullNode = new BTNode<String>();
		
		// Test that calling getValue() w/a null node returns null
		assertNull( nullNode.getValue() );
		
		// Test that getValue() return is not null when the field has 
		// an assigned value
		assertNotNull( root.getValue() );
		assertNotNull( integerNode.getValue() );
		assertNotNull( booleanNode.getValue() );		
		
		// Test that getValue() returns the correct data type
		assertTrue( root.getValue() instanceof String );
		assertTrue( integerNode.getValue() instanceof Integer );
		assertTrue( booleanNode.getValue() instanceof Boolean );
		
		// Test that getValue() returns the correct value 
		assertEquals( value, root.getValue() );
		assertEquals( testNum, integerNode.getValue() );
		assertEquals( testBool, booleanNode.getValue() );
		
		// Test that getValue() returns the correct field from the BTNode<T>
		root = new BTNode<String>( "test", leftNode, rightNode );
		integerNode = new BTNode<Integer>( 10, leftIntegerNode, rightIntegerNode );
		booleanNode = new BTNode<Boolean>( false, leftBooleanNode, rightBooleanNode );
		assertFalse( root.getValue().equals( leftNode ) || 
				     root.getValue().equals( rightNode ) );
		assertFalse( integerNode.getValue().equals( leftIntegerNode ) || 
			     	 integerNode.getValue().equals( rightIntegerNode ) );
		assertFalse( booleanNode.getValue().equals( leftBooleanNode ) || 
			     	 booleanNode.getValue().equals( rightBooleanNode ) );
	}
	
	/**
	 * Tests whether the toString method returns a string that reflects
	 * the data stored in the value variable of the BTNode<T>. Tests the following:
	 * 		1) that it returns null or a not null when appropriate
	 * 		2) that it returns the correct String given the value and its toString() method
	 * 		3) that it returns a String appropriate to an instance's toString() method
	 * 		4) that it does not return some other value in an instance of BTNode<T>
	 */
	@Test
	public void toStringTest()
	{
		root = new BTNode<String>( "test" );
		integerNode = new BTNode<Integer>( 10 );
		booleanNode = new BTNode<Boolean>( false );
		BTNode<String> nullNode = new BTNode<String>();
		
		// Test that calling toString() w/a null node throws 
		// NullPointerException and its handled.
		assertTrue( nullNode.toString().equals( "field was null" ) );
		
		// Test that toString() return is not null when the field has 
		// an assigned value
		assertNotNull( root.toString() );
		assertNotNull( integerNode.toString() );
		assertNotNull( booleanNode.toString() );		
		
		// Test that toString() returns a toString() version of the instantiated
		// value
		assertTrue( root.toString().equals( "test" ) );
		assertTrue( integerNode.toString().equals( integerStr ) );
		assertTrue( booleanNode.toString().equals( boolStr ) );
		
		// Test that toString returns a String from the correct 
		// field in the BTNode<T>
		root = new BTNode<String>( "test", leftNode, rightNode );
		integerNode = new BTNode<Integer>( 10, leftIntegerNode, rightIntegerNode );
		booleanNode = new BTNode<Boolean>( false, leftBooleanNode, rightBooleanNode );
		assertFalse( root.toString().equals( leftNode ) || 
				     root.toString().equals( rightNode ) );
		assertFalse( integerNode.toString().equals( leftIntegerNode ) || 
			     	 integerNode.toString().equals( rightIntegerNode ) );
		assertFalse( booleanNode.toString().equals( leftBooleanNode ) || 
			     	 booleanNode.toString().equals( rightBooleanNode ) );
	}
}

