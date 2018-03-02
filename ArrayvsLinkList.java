package LinearDataStructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayvsLinkList {
	public static void main(String[ ] args) {
		LinkedList l=new LinkedList();
		ArrayList a=new ArrayList();
		
		long start=System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			l.add(0,i);
		}
		
		long end=System.currentTimeMillis();
		System.out.println("time required for linkedlist " + (end-start));
		
		start=System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			a.add(0,i);
		}
		
		end=System.currentTimeMillis();
		System.out.println("time required for arraylist " + (end-start));
	}

}
