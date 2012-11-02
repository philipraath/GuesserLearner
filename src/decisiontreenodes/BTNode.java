package decisiontreenodes;

import java.io.Serializable;

/**
 * 
 * @author andrew.canastar
 *
 * @param <T>
 */
public class BTNode<T> implements Serializable
{
	/**
	 * The generated serialVersionUID.
	 */
	private static final long serialVersionUID = -3698214271722108761L;
	private BTNode<T> left;
	private BTNode<T> right;
	private T value;
	
	/**
	 * Default Constructor for BTNode<T>. Instantiates
	 * a leaf node where all fields are null.
	 */
	public BTNode()
	{
		this.left = null;
		this.right = null;
		this.value = null;
	}
	
	/**
	 * Single argument Constructor for BTNode<T>. Instantiates
	 * a leaf node where the value field is passed a parameter.
	 * @param value - a generic Type argument
	 */
	public BTNode( T value )
	{
		this.left = null;
		this.right = null;
		this.value = value;
	}
	
	/**
	 * Three argument Constructor for BTNode<T>. Instantiates
	 * an inner node where the left, right and value fields
	 * are all passed a parameter.
	 * @param value - a generic Type argument
	 * @param left - BTNode<T>
	 * @param right - BTNode<T>
	 */
	public BTNode( T value, BTNode<T> left, BTNode<T> right )
	{
		this.left = left;
		this.right = right;
		this.value = value;
	}
	
	/**
	 * Returns the left child of the BTNode<T>.
	 * @return BTNode<T> or null if there is no left child.
	 */
	public BTNode<T> getLeftChild()
	{
		return this.left;
	}
	
	/**
	 * Returns the right child of the BTNode<T>.
	 * @return BTNode<T> or null if there is no right child.
	 */
	public BTNode<T> getRightChild()
	{
		return this.right;
	}
	
	/**
	 * Returns the value of the BTNode<T>.
	 * @return T or null if there is no value for this node.
	 */
	public T getValue()
	{
		return this.value;
	}
	
	/**
	 * Sets the left child of the BTNode<T>.
	 * @param leftChild - BTNode<T>
	 */
	public void setLeftChild( BTNode<T> leftChild )
	{
		this.left = leftChild;
	}
	
	/**
	 * Sets the right child of the BTNode<T>.
	 * @param rightChild - BTNode<T>
	 */
	public void setRightChild( BTNode<T> rightChild )
	{
		this.right = rightChild;
	}
	
	/**
	 * Sets the value of the BTNode<T>.
	 * @param value - T, a generic type variable.
	 */
	public void setValue( T value )
	{
		this.value = value;
	}
	
	/**
	 * Returns the result of calling the toString() method of the
	 * BTNode<T>'s data type.
	 * @return String - a String containing the value referenced
	 * by the value field of the BTNode<T>
	 */
	public String toString()
	{
		try
		{
			return this.value.toString();
		}
		catch ( NullPointerException e )
		{
			return "field was null";
		}
	}
}
