import java.util.*;

public class ArrayListDemo {
	public static void reverseList(List l) {
		for(int i=l.size()-1;i>=0;i--) {
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
	}
		public static void main(String[] args) {
		List al=new ArrayList();
		al.add("Ajay");
		al.add("Vishal");
		al.add("Abhi");
		al.add("Raj");
		al.add(123);
		al.add(23.45);
		
		
		List<Integer> al1=new ArrayList<Integer>();
		//al1.add("Ajay");  will get CE , will accept only integer
		al1.add(12);
		al1.add(23);
		al1.add(34);
		al1.add(55);
		al1.add(64);
		al1.add(78);
		//Collections.sort(al);
		//Collections.reverse(al);
		System.out.println(al);
		reverseList(al);
		System.out.println(al1);
		reverseList(al1);
		
		// we can traverse element using iterator
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
