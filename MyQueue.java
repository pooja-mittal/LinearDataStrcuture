package LinearDataStructure;

public class MyQueue {
	
		public static void main(String[] args) {
			Queue d=new Queue();
			d.add("pooja");
			d.add("sachin");
			//d.add("vipin");
			//d.add("kaku");
			//d.add("vicky");
			for(int i=0; i<d.size(); i++) {
				String n=(String)d.poll();
				System.out.print(n  + " ");
			}
			
				
		}
	
}
