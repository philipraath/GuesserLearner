/*
 * http://stackoverflow.com/questions/2597637/finding-height-in-binary-search-tree
 */
package binarytree;
//package KW.CH06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedList;

/**
 * Class for a binary tree that stores type E objects.
 **/
public class BinaryTree<E> implements Serializable 
{
    private LinkedList<Node<E>> levelQueue = new LinkedList<Node<E>>();
    private int count, height;
    
    /** Class to encapsulate a tree node. */
    protected static class Node<E> implements Serializable 
	 {
        // Data Fields

        /** The information stored in this node. */
        public E data;
        /** Reference to the left child. */
        public Node<E> left;
        /** Reference to the right child. */
        public Node<E> right;

        // Constructors
        /**
         * Construct a node with given data and no children.
         * @param data The data to store in this node
         */
        public Node(E data) 
		  {
            this.data = data;
            left = null;
            right = null;
        }

        // Methods
        /**
         * Returns a string representation of the node.
         * @return A string representation of the data fields
         */
        @Override
        public String toString() {
            return data.toString();
        }
    }
    
    // Data Field
    /** The root of the binary tree */
    protected Node<E> root;

    /** Construct an empty BinaryTree */
    public BinaryTree() {
        root = null;
    }

    /**
     * Construct a BinaryTree with a specified root.
     * Should only be used by subclasses.
     * @param root The node that is the root of the tree.
     */
    protected BinaryTree(Node<E> root) {
        this.root = root;
    }

    /**
     * Constructs a new binary tree with data in its root,leftTree
     * as its left subtree and rightTree as its right subtree.
     */
    public BinaryTree(E data, BinaryTree<E> leftTree,
            BinaryTree<E> rightTree) 
	{
        root = new Node<E>(data);
        if (leftTree != null) {
            root.left = leftTree.root;
        } else {
            root.left = null;
        }
        if (rightTree != null) {
            root.right = rightTree.root;
        } else {
            root.right = null;
        }
    }

    /**
     * Return the left subtree.
     * @return The left subtree or null if either the root or
     * the left subtree is null
     */
    public BinaryTree<E> getLeftSubtree() {
        if (root != null && root.left != null) {
            return new BinaryTree<E>(root.left);
        } else {
            return null;
        }
    }

    /**
     * Return the right sub-tree
     * @return the right sub-tree or
     *         null if either the root or the
     *         right subtree is null.
     */
    public BinaryTree<E> getRightSubtree() 
	 {
        if (root != null && root.right != null) {
            return new BinaryTree<E>(root.right);
        } else {
            return null;
        }
    }

    /**
     * Return the data field of the root
     * @return the data field of the root
     *         or null if the root is null
     */
    public E getData() {
        if (root != null) {
            return root.data;
        } else {
            return null;
        }
    }

    /**
     * Determine whether this tree is a leaf.
     * @return true if the root has no children
     */
    public boolean isLeaf() {
        return (root == null || (root.left == null && root.right == null));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        preorderToString(sb, root);
        return sb.toString();
    }
    
    /**
     * Method to return the preorder traversal of the binary tree
     * as a sequence of strings each separated by a space.
     * @return A preorder traversal as a string
     */
    public String preorderToString() {
        StringBuilder sb = new StringBuilder();
	preorderToString(sb, root);
	return sb.toString();
    }

    private void preorderToString (StringBuilder sb, Node<E> cur) {
        if (cur != null)
            sb.append(cur.data.toString());
	if (cur.left != null)
            preorderToString(sb, cur.left);
	if (cur.right != null)
            preorderToString(sb, cur.right);
    }    
    
	 
    /**
     * Method to return the postorder traversal of the binary tree
     * as a sequence of strings each separated by a space.
     * @return A postorder traversal as a string
     */
     public String postorderToString() {
         StringBuilder sb = new StringBuilder();
	 postorderToString(sb, root);
	 return sb.toString();
     }
 
     private void postorderToString(StringBuilder sb, Node<E> cur) {
         if (cur.left != null)
            postorderToString(sb, cur.left);
         if (cur.right != null)
            postorderToString(sb, cur.right);
         if (cur != null)
            sb.append(cur.data.toString());
     }    
 
 	  /**
      * Method to return the inorder traversal of the binary tree
      * as a sequence of strings each separated by a space.
      * @return an inorder traversal as a string
      */
    public String inorderToString() {
         StringBuilder sb = new StringBuilder();
	 inorderToString(sb, root);
	 return sb.toString();
    }
 
    private void inorderToString(StringBuilder sb, Node<E> cur) {
         if (cur.left != null)
            inorderToString(sb, cur.left);
         if (cur != null)
            sb.append(cur.data.toString());
         if (cur.right != null)
            inorderToString(sb, cur.right);
         }   
     
 	 /**
 	 * Method to return the level-by-level traversal of the binary tree
 	 * as a sequence of strings each separated by a space
 	 * @return levelwise traversal as a string
 	 */
 	 public String levelwiseToString() {
            Node<E> cur;
            StringBuilder sb = new StringBuilder();
            levelQueue.add(root);
            if(root != null) {
                while(!levelQueue.isEmpty()) {
                    cur = levelQueue.poll();
                    sb.append(cur.data.toString());
                    if(cur.left != null)
                        levelQueue.add(cur.left);
                    if(cur.right != null)
                        levelQueue.add(cur.right);
                }
            }
            return sb.toString();
 	 }
 	 
 	 /** 
 	 * Method to count the number of nodes in the tree
 	 * @return the number of nodes contained in the tree
 	 */
 	 public int countNodes() {
            return countNodes(root);
 	 }
 	 
 	 private int countNodes(Node<E> cur) {
            if (cur != null)
                count++;
            if (cur.left != null)
                countNodes(cur.left);
            if (cur.right != null)
                countNodes(cur.right);
            return count;
 	 }
 	 
 	  /** 
 	 * Method to count the height in the tree, a null tree has height 0 
 	 * @return the number of levels of the tree
 	 */
 	 public int getHeight() {
            return height(root);
 	 }
 	 
 	 private int height(Node<E> cur) {
            if (cur == null)
                return 0;
//            if (cur.left != null)
//                height++;
//                height(cur.left);
//            if (cur.right != null)
//                height++;
//                height(cur.right);
            return 1 + Math.max(height(cur.left), height(cur.right));
 	 }
    
}

