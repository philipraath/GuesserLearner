package decisiontreenodes;

public class ThingNode<String> extends DecisionTreeNode<String> {

	/**
	 * Generated serialVersionUID 
	 */
	private static final long serialVersionUID = -1547753766479332916L;
	
	/**
	 * Single argument Constructor for ThingNode<T>. Instantiates
	 * a leaf node where the value field is passed a parameter.
	 * @param thing - a String assigned to the Node's value field
	 */
	public ThingNode( String thing )
	{
		super( thing, null, null );
	}
	
	/**
	 * Returns the value of the ThingNode<T>.
	 * @return String or null
	 */
	public String getThing()
	{
		return super.getValue();
	}
	
	/**
	 * Returns a String representing the data assigned to the 
	 * value variable.
	 * @return String
	 */
	public java.lang.String toString()
	{
		return super.toString();
	}
}
