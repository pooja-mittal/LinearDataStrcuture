package LinearDataStructure;

public class DoubleLinkList {
	Node head;
	int count;

	public DoubleLinkList() {
		head = null;
		count = 0;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void add(int data) {
		if (head == null) {
			head = new Node(null, data, null);

		} else {
			Node p = new Node(null, data, head.previous);
			p.next = head.previous;
			head = p;

		}
		count++;
	}

	public int size() {
		
		return count;
	}

	public void print() {
		Node current = head;
		while (current!= null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		DoubleLinkList le = new DoubleLinkList();
		le.add(10);
		le.add(20);
		le.add(30);
		le.print();
		le.size();

	}
}
