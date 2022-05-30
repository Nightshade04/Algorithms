package utils;

/*
 * Queue implementation using a Linked-List
 * Creates a Queue of values of 'Node' type
 * 
 * I have created Chunk as a separate class here for each part of the Linked_list
 * because, JAVA implicitly creates shallow copies of referenced DataTypes. So any 
 * changes to any Object of 'Node' class inside 'Queue' class would be reflected in 
 * the original Object of 'Node' class, thus ruining the Binary tree.
 */

class Chunk {
	
	private Node value;
	private Chunk next;
	
	public Chunk(Node val) {
		this.value = val;
		this.next = null;
	}
	
	public Node getVal() {
		return this.value;
	}
	
	public void setNext(Chunk chunk) {
		this.next = chunk;
	}
	public Chunk getNext() {
		return this.next;
	}
	
}

public class Queue {
	
	Chunk head;
	Chunk tail;
	
	public Queue enQueue(Queue Q, Node node) {
		Chunk newNode = new Chunk(node);
		if(head == tail && tail == null) {
			head = tail = newNode;
		}
		else {
			tail.setNext(newNode);
			tail = tail.getNext();
		}
		return Q;
	}
	
	public Node deQueue() {
		Node removedNode = null;
		if(head == tail && tail != null) {
			removedNode = tail.getVal();
			head = tail = null;
		}
		else {
			removedNode = head.getVal();
			Chunk currentHead = head.getNext();
			head.setNext(null);
			head = currentHead;
		}	
		return removedNode;
	}
	
	public void printQueue() {
		Chunk ptr = head;
		String output = "";
		while(ptr != null) {
			output += ptr.getVal().getValue() + " -> " ;
			ptr = ptr.getNext();
		}
		if(output.length() > 1) {
			output = output.substring(0, output.lastIndexOf('-'));
			System.out.println(output.trim());
		}
		else {
			System.out.println("Empty Queue");
		}
	}

	
	public boolean isEmpty() {
		if(head == tail && tail == null) {
			return true;
		}
		return false;
	}
	
//	public static void main(String[] args) {
//		Queue Q = new Queue();
//		Node n = new Node(1);
//		Q.enQueue(Q, n);
//		n = new Node(2);
//		Q.enQueue(Q, n);
//		Q.printQueue();
//		Q.deQueue();
//		Q.printQueue();
//		Q.deQueue();
//		Q.printQueue();	
//		
//	}
}
