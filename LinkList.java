package LinearDataStructure;

public class LinkList {
	private class Node {
		Object data;
		Node next;
		
		Node(Object ele) {
			data=ele;
			
		}
	}
	
	private Node first;
	private Node last;
	int count;
	
	public void add(Object ele) {
		if(first==null) {
			first=new Node(ele);
		last=first;
		count++;
		return;
	}
	
	last.next=new Node(ele);
	last=last.next;
	count++;
	}
	
	public int size() {
		return count;
	}
	
	public Object get(int index) {
		if(index>=size())
			throw new  IndexOutOfBoundsException();
		Node p=first;
		for(int i=0; i<=index; i++) {
			p=p.next;
		}
		return p.data;
	}
	
	}


class Demo
{
	public static void main(String[] args) {
		LinkList a=new LinkList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		for(int i=0; i<a.size(); i++) {
			int n=(Integer)a.get(i);
			System.out.print(n + " ");
		}
	}
}