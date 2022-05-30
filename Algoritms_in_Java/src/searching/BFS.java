package searching;

import utils.Node;
import utils.Queue;

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
 *  	curr_node = Node currently being visited in the tree
 *  	Q = Queue used for BFS traversal
 *  	val = value being searched in the tree/graph
 *  
 *  for node implementation check utils.Node
 *  for queue implementation check utils.Queue
 *  
 *  Algorithm: 
 *  
 *  initialize an empty queue Q
 *  
 *  place root in the queue and mark it as visited -
 *  while Q is not empty : 
 *  	dequeue a node from Q at curr_node
 *  	Check if the value at curr_node = val
 *  		return if the value is found
 *  	enque all the connected nodes from the curr_node in the Q (i.e. curr_node.left, curr_node.right)
 *  
 *  
 *  Time Complexity :- O(E + V) worst case where E = Cardinality of Edges, V = Cardinality of vertices
 *  
 *  Trivia: Is used to find connections in a tree / graph
 *  
 */

public class BFS {

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

	public void searchBreadthFirst(char find) {
		Queue Q = new Queue();
		boolean findFlag= false;
		Q.enQueue(Q, root);
		while (!Q.isEmpty()) {
			Node currNode = Q.deQueue();
			if((char)currNode.getValue() == find) {
				findFlag = true;
				break;
			}
			if(currNode.getLeft() != null) {
				Q.enQueue(Q, currNode.getLeft());				
			}
			if(currNode.getRight() != null) {
				Q.enQueue(Q, currNode.getRight());				
			}
		}
		if(findFlag) {
			System.out.println(find + " is present in the tree!");
		}
		else {
			System.out.println(find + " is not present in the tree!");
		}

	}
	
	//dummy method for in-order traversal of the tree at 'root'
	public void treeTraverse(Node root) {
		if (root != null) {
			treeTraverse(root.getLeft());
			System.out.print((char) root.getValue() + " ");
			treeTraverse(root.getRight());
		}
	}

	public static void main(String[] args) {
		BFS bfs = new BFS();
		bfs.treeTraverse(bfs.root);
		bfs.searchBreadthFirst('M');

	}

}
