package binarytree;

import decisiontreenodes.*;

public class Guesser 
{
	private DecisionTreeNode<String> root;
	
	private static final String FILENAME = "animal";
	
	/**
	 * Default Guesser Constructor. Constructs a tree with
	 * a single ThingNode<String> root.
	 */
	public Guesser()
	{
		root = new ThingNode<String>( "Tiger" );
	}
	
	/**
	 * Single parameter Guesser Constructor. Constructs a tree
	 * by deserializing a .ser file and assigning it to root.
	 * @param fileName
	 */
	public Guesser( String FILENAME )
	{
		// Traversal of a binary tree while assigning it nodes from the file
	}
	
	/**
	 * Add a new DecisionTreeNode<String> to the Tree.
	 */
	public void addNodeToTree()
	{
		
	}
	
	/**
	 * Constructs a new ThingNode from user input.
	 * @param thing - String parameter for ThingNode constructor
	 * @return ThingNode<String>
	 */
	public ThingNode<String> createThingNode( String thing )
	{
		return null;
	}
	
	/**
	 * Creates a new tree consisting of a QuestionNode and its two
	 * ThingNode children.  as a child to the current root's
	 * parent. The tree 
	 * @param userYesNo
	 * @param newQuestion
	 * @param newThing
	 * @return
	 */
	public DecisionTreeNode<String> performTreeSurgery( String userYesNo, 
														QuestionNode<String> newQuestion,
														ThingNode<String> newThing ) 
	{
		return null;
	}
}
