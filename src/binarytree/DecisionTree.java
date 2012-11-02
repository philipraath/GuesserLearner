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

	private DecisionTreeNode<String> parent;
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
	 * ThingNode children. This tree is subsequently added to the reference where
	 * this new subtree is to be placed. 
	 *  
	 * @param rootReference - the pointer to the location where the tree will be added
	 * @param newQuestion - the value to be added to the new QuestionNode
	 * @param noChild -the child to be added to QuestionNode.left
	 * @param yesChild - the child to be added to QuestionNode.right 
	 */
	public void performTreeSurgery( DecisionTreeNode<String> rootReference,
														String newQuestion,
														ThingNode<String> noChild,
														ThingNode<String> yesChild ) 
	{
		DecisionTreeNode<String> newSubTree = new QuestionNode<String>( newQuestion,
																		noChild,
																		yesChild );
		rootReference = newSubTree;
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
	
	/**
	 * Simple getter method for returning the DecisionTreeNode<String>
	 * assigned to the variable 'root'
	 * 
	 * @return DecisionTreeNode<String> - root
	 */
	public DecisionTreeNode<String> getRoot()
	{
		return root;
	}
	
	/**
	 * Simple getter method for returning the DecisionTreeNode<String>
	 * assigned to the variable 'parent'
	 * 
	 * @return DecisionTreeNode<String> - parent
	 */
	public DecisionTreeNode<String> getParent()
	{
		return parent;
	}
}
