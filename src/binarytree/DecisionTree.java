package binarytree;

import java.io.Serializable;

import decisiontreenodes.DecisionTreeNode;
import decisiontreenodes.QuestionNode;
import decisiontreenodes.ThingNode;

public class DecisionTree implements Serializable {
	
	/**
	 * Generated serialVersionUID
	 */
	private static final long serialVersionUID = -7112302926311497490L;

	private DecisionTreeNode<String> root;
	
	private static final String FILENAME = "animal";
	
	/**
	 * Default DecisionTree Constructor. Constructs a tree with
	 * a single ThingNode<String> root.
	 */
	public DecisionTree()
	{
		root = new ThingNode<String>( "Tiger" );
	}
	
	/**
	 * Single parameter Guesser Constructor. Constructs a tree
	 * by deserializing a .ser file and assigning it to root.
	 * @param fileName
	 */
	public DecisionTree( String FILENAME )
	{
		// Traversal of a binary tree while assigning it nodes from the file
	}
	
	/**
	 * Single argument Constructor with root passed as a parameter
	 * @param root - DecisionTreeNode<String> to assign to root.
	 */
	public DecisionTree( DecisionTreeNode<String> root )
	{
		this.root = root;
	}
	
	/**
	 * Add a new DecisionTreeNode<String> to the Tree.
	 */
	public void addNodeToTree()
	{
		
	}
	
	/**
	 * Creates a new tree consisting of a QuestionNode and its two
	 * ThingNode children. 
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
	
	/**
	 * Returns the no child of the current root in the DecisionTree.
	 *
	 * @return DecisionTreeNode<String> or null if the current root is a ThingNode.
	 */
	public DecisionTreeNode<String> nextNoNode()
	{
		return root.getNoLink();
	}
	
	/**
	 * Returns the yes child of the current root in the DecisionTree.
	 *
	 * @return DecisionTreeNode<String> or null if the current root is a ThingNode.
	 */
	public DecisionTreeNode<String> nextYesNode()
	{
		return root.getYesLink();
	}
}
