package utils;

/* Node class for Tree, Graphs, Linked-Lists Structure
 * For Linked-Lists only left pointer is being used.
 */
public class Node{

	private int val;
	private Node left;
	private Node right;
	
	public Node(int val) {
		setVal(val);
		setLeft(null);
		setRight(null);
	}
	
	public Node getLeft() {
		return this.left;
	}
	
	public Node getRight() {
		return this.right;
	}
	
	public int getValue() {
		return this.val;
	}
	
	public void  setLeft(Node left) {
		this.left = left;
	}
	
	public void setRight(Node right) {
		this.right = right;
	}
	
	public void setVal(int val) {
		this.val = val;
	}

}
