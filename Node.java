package LinearDataStructure;

//import LinearDataStructure.DoubleLinkList.Node;

public class Node {
	int data;
	Node next, previous;

	public Node(int data) {
		previous = null;
		this.data = data;
		next = null;
		
	}

	public Node(Node previous, int data, Node next) {
		this.previous = previous;
		this.data = data;
		this.next = next;
	}

	int getData() {
		return data;
	}
}
