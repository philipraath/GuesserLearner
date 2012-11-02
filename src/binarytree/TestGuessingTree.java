package binarytree;

import org.junit.Test;

public class TestGuessingTree
{
	
	/**
	 * Tests whether a given BTNode<E> is a leaf by checking to see if
	 * both children are null. Tests the following:
	 * 		1) that it returns true when root == null
	 * 		2) that it returns true when root.left && root.right are null
	 * 		3) that it returns false when root.left = BTNode<E>
	 * 		4) that it returns false when root.right = BTNode<E>
	 * 		5) that it returns false when root.left && root.right = BTNode<E>
	 */
	@Test
	public void isLeafTest()
	{
		// Test that it returns true when root == null
		// Test that it returns true when root.left && root.right are null
		// Test that it returns false when root.left = BTNode<E>
		// Test that it returns false when root.right = BTNode<E>
		// Test that it returns false when root.left && root.right = BTNode<E>
	}
	
	/**
	 * Tests that a binary tree pointed to by a given BTNode's left
	 * pointer returns the correct binary tree. Tests the following:
	 * 		1) that it returns a BTNode<E>
	 *		2) that it returns a BTNode<E> identical to root.left
	 * 			including the data and its pointers
	 */
	@Test
	public void getLeftSubtreeTest()
	{
		// Test that it returns a BTNode<E>
		// Test that it returns a BTNode<E> identical to root.left
		// including the data and its pointers
	}
	
	/**
	 * Tests that a binary tree pointed to by a given BTNode's right
	 * pointer returns the correct binary tree. Tests the following:
 	 *		1) that it returns a BTNode<E>
  	 *		2) that it returns a BTNode<E> identical to root.right
  	 *			including the data and its pointers
	 */
	@Test
	public void getRightSubtreeTest()
	{
		// Test that it returns a BTNode<E>
		// Test that it returns a BTNode<E> identical to root.right
		// including the data and its pointers
	}
	
	/**
	 * Tests whether the BinaryTree's getData() method returns
	 * the correct data. Tests the following:
	 * 		1) that it returns the correct data type (primitive)
	 * 		2) that it returns the correct data type (object)
	 * 		3) that it returns the correct value of a primitive
	 * 		4) that it returns the correct instance of an object
	 */
	@Test
	public void getDataTest()
	{
		// Test that it returns the correct data type (primitive)
		// Test that it returns the correct data type (object)
		// Test that it returns the correct value of a primitive
		// Test that it returns the correct instance of an object
	}
	
	/**
	 * Tests whether the toString method returns a string that is an in-order
	 * traversal of the data fields in the BinaryTree. Tests the following:
	 * 		1) that it returns an in-order traversal of a BinaryTree
	 */
	@Test
	public void toStringTest()
	{
		// Tests that the sequence of data listed in the String is the same
		// as an in-order traversal of the tree
	}
}
