package decisiontreenodes;

public abstract class DecisionTreeNode<String> extends BTNode<String>{

	/**
	 * the Generated serialVersionUID.
	 */
	private static final long serialVersionUID = -3760734368537123926L;
	
	// private BTNode<String> DTNode; // necessary if I try the no-warning route
	/**
	 * 
	 */
	public DecisionTreeNode()
	{
		super();
	}
	
	/**
	 * 
	 * @param value
	 * @param no
	 * @param yes
	 */
	public DecisionTreeNode( String value, /*DecisionTreeNode<String> no,*/
											/*DecisionTreeNode<String> yes*/
											DecisionTreeNode<String> no, 
											DecisionTreeNode<String> yes )
	{
		// The commented out part works with the other commented out parts
		// of the constructor and fields.
		/*DTNode = new BTNode<String>( value );
		DTNode.setLeftChild( no );
		DTNode.setRightChild( yes );*/	
		super( value, no, yes ); // Do not like the warning but as you go up 
		// it seems like the type should become more general.
	}
	
	/**
	 * 
	 * @return
	 */
	public DecisionTreeNode<String> getYesLink()
	{
		return ( DecisionTreeNode<String> )super.getRightChild();
	}
	
	/**
	 * 
	 * @return
	 */
	public DecisionTreeNode<String> getNoLink()
	{
		return ( DecisionTreeNode<String> )super.getLeftChild();
	}
	
	/**
	 * 
	 * @param link
	 */
	public void setYesLink( DecisionTreeNode<String> link )
	{
		super.setRightChild( link );
	}
	
	/**
	 * 
	 * @param link
	 */
	public void setNoLink( DecisionTreeNode<String> link )
	{
		super.setLeftChild( link );
	}
	
	/**
	 * 
	 * @return
	 */
	public java.lang.String toString()
	{
		return super.toString();
	}
}
