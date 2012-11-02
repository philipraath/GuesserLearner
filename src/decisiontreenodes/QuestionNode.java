package decisiontreenodes;

public class QuestionNode<String> extends DecisionTreeNode<String> {

	/**
	 * Generated serialVersionUID 
	 */
	private static final long serialVersionUID = 5658964994888838948L;
	
	/**
	 * Three argument Constructor for QuestionNode<T>. Instantiates
	 * an inner node where the left, right and value fields
	 * are all passed a parameter. 
	 * @param question
	 * @param noAnswer
	 * @param yesAnswer
	 */
	public QuestionNode( String question, DecisionTreeNode<String> noAnswer,
										  DecisionTreeNode<String> yesAnswer )
	{
		super( question, noAnswer, yesAnswer );
	}
	
	/**
	 * Returns the value of the QuestionNode<T>.
	 * @return String or null
	 */
	public String getQuestion()
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
