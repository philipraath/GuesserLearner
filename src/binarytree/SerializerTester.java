package binarytree;

import decisiontreenodes.DecisionTreeNode;
import decisiontreenodes.QuestionNode;
import decisiontreenodes.ThingNode;

public class SerializerTester {
	
	private DecisionTree tree;
	private DecisionTreeNode<String> question;
	private DecisionTreeNode<String> thing;
	private DecisionTreeNode<String> root;
	private Serializer serializer = new Serializer();
	
	public SerializerTester()
	{
		
	}
	
	public void run()
	{
		question = new QuestionNode<String>( "question1", null, null );
		thing = new ThingNode<String>( "thing1" );
		root = new QuestionNode<String>( "root", question, thing );
		tree = new DecisionTree( root );
		serializer.serializeToFile( "decisiontree.ser", tree );
	}
	
	public void run1()
	{
		DecisionTree newTree = ( DecisionTree )serializer.deserializeFromFile( "decisiontree.ser" );
		System.out.println( newTree.getRoot().toString() );
		System.out.println( newTree.nextYesNode().toString() );
		System.out.println( newTree.nextNoNode().toString() );
	}
	
	public static void main( String[] args )
	{
		SerializerTester test = new SerializerTester();
		//test.run();
		test.run1();
	}
}
