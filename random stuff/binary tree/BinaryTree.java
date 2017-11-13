/* Created by Bartosz Kosakowski
* A binary tree data structure which follows the rule of left child < parent,
* right child > parent. This is a basic tree and does not self-balance.
* In other words, this is more correctly a binary heap but whatever yo.
*/
public class BinaryTree{
	private static Node treeRoot = null;

	public static void main (String [] args){
		System.out.println("\n\tBINARY TREE\n");
		addNode(new Node(7));
		addNode(new Node(12));
		addNode(new Node(5));
		addNode(new Node(2));
		addNode(new Node(6));
		printTree(treeRoot);
	}//end of main method

	//used to add new nodes to the tree
	public static void addNode(Node node){
		if (treeRoot == null){
			treeRoot = node;
		}
		else{
			addRest(treeRoot, node);
		}
	}//end of addNode

	//used to help addNode in adding nodes to the tree
	private static void addRest(Node current, Node node){
		//if the current val < node val, then node goes on the right
		if (node.getVal() > current.getVal()){
			//we check if the current node has a child
			if (!current.hasRight()){
				//if no, we make the new node the current's child
				current.setRightChild(node);
			}
			//if the current node has a right child, we traverse to it and redo
			//the above procedure
			else{
				addRest(current.getRightChild(), node);
			}
		}
		//if the current val > node val, then node goes on the left
		else if (node.getVal() < current.getVal()){
			//we check if the current node has a child
			if (!current.hasLeft()){
				//if no, we make the new node the current's child
				current.setLeftChild(node);
			}
			//if the current node has a left child, we traverse to it and redo
			//the above procedure
			else{
				addRest(current.getLeftChild(), node);
			}
		}
		//the node we wish to add has a value of a node that already exists in the tree
		else{
			System.out.println("Node with value " + node.getVal() + " is already in the tree");
		}
	}//end of addRest

	public static String printTree(Node node){
		String allVals = "" + node.getVal();
		if (node.hasLeft()){
			allVals += " -> " + node.getLeftChild().getVal();
		}
		if (node.hasRight()){
			allVals += " and " + node.getRightChild().getVal();
		}

		System.out.println(allVals); 
		
		if (node.hasLeft()){
			buildStr(node.getLeftChild());
		}
		if (node.hasRight()){
			buildStr(node.getRightChild());
		}
		return allVals;
	}//end of printTree

	private static String buildStr(Node node){
		String allVals = "\n" + node.getVal();
		if (node.hasLeft()){
			allVals += " -> " + node.getLeftChild().getVal();
			buildStr(node.getLeftChild());
		}
		if (node.hasRight()){
			allVals += " and " + node.getRightChild().getVal();
			buildStr(node.getRightChild());
		}
		System.out.println(allVals);
		return allVals;
	}
}//end of BinaryTree class

//node class 
class Node{
	private int val;
	private Node leftChild;
	private Node rightChild;

	//creates a Node instance with a specified value and null children
	public Node(int val){
		this.val = val;
		this.leftChild = null;
		this.rightChild = null;
	}//end of default constructor

	//getters
	public int getVal(){
		return this.val;
	}
	public Node getLeftChild(){
		return this.leftChild;
	}
	public Node getRightChild(){
		return this.rightChild;
	}//end of getters

	//setters
	public void setLeftChild(Node leftChild){
		this.leftChild = leftChild;
	}
	public void setRightChild(Node rightChild){
		this.rightChild = rightChild;
	}//end of setters 

	//check if node has left child
	public boolean hasLeft(){
		return (this.leftChild != null);
	}//end of hasLeft

	//check if node has right child
	public boolean hasRight(){
		return (this.rightChild != null);
	}//end of hasRight
}//end of Node class