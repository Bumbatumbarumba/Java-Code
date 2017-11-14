/* Created by Bartosz Kosakowski
* A binary tree data structure which follows the rule of left child < parent,
* right child > parent. This tree will self balance by sinking/swimming node
* values accordingly.
*/
import java.util.Random;

public class BinaryTree{
	private static Node root = null;

	public static void main (String [] args){
		System.out.println("\n\tSelf-Balancing Binary Tree\n");
		addNode(new Node(3));
		addNode(new Node(4));
		addNode(new Node(2));

		System.out.println("parent: " + root.getVal());
		System.out.println("left: " + root.getLeft().getVal());
		System.out.println("right: " + root.getRight().getVal());
	}//end of main

	public static void addNode(Node newNode){
		//first we check if there is a root; if not, we make the
		//new node the root
		if (root == null){
			root = newNode;
		}
		else{
			//then we check if there is a left root; if no, we set the new node to
			//be the left root and check if we need to swap parent and child vals
			if (!root.hasLeft()){
				root.setLeft(newNode);
				swapWithLeft(root, root.getLeft());
			}
			//if there is a left, but no right, we put it in the right child,
			//then swap values if need be
			else if (!root.hasRight()){
				root.setRight(newNode);
				swapWithRight(root, root.getRight());
				swapWithLeft(root, root.getLeft());
			}
			else{

			}
		}
	}//end of addNode

	//since the root is a special case in a sense, we have to interact with
	//it separately from the other nodes; this manipulates the rest of them
	private static void traverseRest(Node current, Node newNode){

	}//end of traverseRest

	private static void swapWithLeft(Node parentNode, Node childNode){
		if (childNode.getVal() > parentNode.getVal()){
			int temp = 0;
			temp = parentNode.getVal();
			parentNode.setVal(childNode.getVal());
			childNode.setVal(temp);
		}
	}//end of swapWithLeft

	private static void swapWithRight(Node parentNode, Node childNode){
		if (childNode.getVal() < parentNode.getVal()){
			int temp = 0;
			temp = parentNode.getVal();
			parentNode.setVal(childNode.getVal());
			childNode.setVal(temp);
		}
	}//end of swapWithRight
}//end of BinaryTree class

class Node{
	private int val;
	private Node left;
	private Node right;

	public Node(int val){
		this.val = val;
		this.left = null;
		this.right = null;
	}//end of constructor

	public int getVal(){
		return this.val;
	}//end of getVal

	public Node getLeft(){
		return this.left;
	}//end of getLeft

	public Node getRight(){
		return this.right;
	}//end of getRight

	public void setVal(int val){
		this.val = val;
	}//end of setVal

	public void setLeft(Node node){
		this.left = node;
	}//end of setLeft

	public void setRight(Node node){
		this.right = node;
	}//end of setRight

	public boolean hasLeft(){
		return this.left != null;
	}//end of hasLeft

	public boolean hasRight(){
		return this.right != null;
	}//end of hasRight
}//end of Node class