package LinearDataStructure;

public class Queue {
	private class Node {
		Node next;
		Object data;

		Node(Object ele) {
			data = ele;
		}
	}

	private Node first, last;
	int count;

	public void add(Object ele) {
		if (first == null) {
			first = new Node(ele);
			last = first;
			count++;
			return;
		}
		last.next = new Node(ele);
		last = last.next;
		count++;
	
	}

	int size() {
		return count;

	}

	Object peek() {
		if (first == null)
			System.out.println("underflow state");
		return first.data;
	}

	public Object poll() {
		if (size() == 0) {
			System.out.println("underflow state");
			return null;
		}

		Object d = first.data;
		first = first.next;
		count--;
		
		return d;

	}
}


