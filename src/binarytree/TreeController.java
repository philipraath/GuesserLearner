package binarytree;

import decisiontreenodes.DecisionTreeNode;
import decisiontreenodes.ThingNode;


public interface TreeController {
	
	/**
	 * Constructs a binary tree with a Thing Node root
	 */
	void constructBinaryTree();
	
	/**
	 * Deserializes a GuessingTree and assigns its root to the root
	 */
	void deserializeGuessingTree();
	
	/**
	 * Serialize a GuessingTree to the given filename.
	 */
	void serializeGuessingTree( String fileName );
	
	/**
	 * Add a new BTNode<E> to the Tree.
	 */
	void addNodeToTree();
	
	/**
	 * Gets a new Thing Node from user input.
	 * @param <T>
	 */
	<T> ThingNode<T> createThingNode();
	
	/**
	 * Add a new BinaryTree to the current root's parent.left or parent.right.
	 */
	void performTreeSurgery();
	
	/**
	 * Ask giveUpQuestion which gets the user to let teach the guesser
	 */  
	void askGiveUpQuestion();
	
	/**
	 * Ask askObject which asks the user if the thing they are thinking of is
	 * the data field's toString() from the current root node.
	 * @param <T>
	 */
	<T> void askObject( DecisionTreeNode<T> root );
	
	/**
	 * Determines if the user responds yes or no to a leaf's askObject question
	 * and calls either askGiveUpQuestion() or declareVictory() method.
	 * @param
	 */
	void victoryOrDefeat( String userResponse );
	
	/**
	 * Sends the UserCommunicationStrings.victoryResponse to the user interface.
	 */
	void declareVictory();
	
	/**
	 * Asks the user for a yes/no question that distinguishes between the object 
	 * in the current root's data field and the object the user had in mind. 
	 */
	String askDistinguishingQuestion();
	
	/**
	 * Requests the user to think of an object of the same type as the game's object-type.
	 */
}
