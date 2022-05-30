package searching;

import utils.Node;

/*
 *  given tree:
 *  	 A
 *     /   \
 *    B     C
 *   / \   / \
 *  D   E F   G
 *  
 *  Variables:
 *  	root = A (Starting point of the tree and/or graph)
 *  	find = value being searched in the tree/graph
 *  
 *  for node implementation check utils.Node
 *  
 *  Algorithm: 
 *  
 *  Just do a normal recursive tree traversal(in-order in this case)
 *  for each node, check if the current node is the node being searched for.
 *  	if yes, print the appropriate message
 *  	if no, continue traversal.
 *  
 *  Time Complexity :- O(n) worst case
 *  
 *  Trivia: Is used to find connections in a tree / graph. Can be implemented
 *  using a trivial stack. JAVA normally uses stack in the in-order native traversal.
 *  
 */

public class DFS {
	
	private Node root = createtree();

	public Node createtree() {
		// Used ASCII values to be able to print the Char representation
		Node root = new Node(65);
		root.setLeft(new Node(66));
		root.setRight(new Node(67));

		Node left = root.getLeft();
		Node right = root.getRight();

		left.setLeft(new Node(68));
		left.setRight(new Node(69));

		right.setLeft(new Node(70));
		right.setRight(new Node(71));
		return root;
	}

	public void searchDepthFirst(Node root, char find) {
		if(root == null) {
			System.out.println(find + " is not present in the tree!");
			return;
		}
		else {
			if((char)root.getValue() == find) {
				System.out.println(find + " is present in the tree!");
			}
			else {
				searchDepthFirst(root.getLeft(), find);
				searchDepthFirst(root.getRight(), find);
			}
		}
	}
	
	public static void main(String[] args) {
		DFS d = new DFS();
		d.searchDepthFirst(d.root, 'G');
	}
}
