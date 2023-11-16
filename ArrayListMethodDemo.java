import java.util.*;
public class ArrayListMethodDemo {
	public static void arrayListRetain() {
		List<String> l=new ArrayList<String>();
		l.add("ASd");
		l.add("Raj");
		l.add("Tushar");
		l.add("Rohan");
		l.add(null);
		System.out.println(l);
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		System.out.println(li);
		
		List<String> l1=new ArrayList<String>();
		l1.add("Ajay");
		l1.add("JAckson");
		l1.add("Shobhit");
		l1.add(null);
		System.out.println(l1);
		
		/*
		 * l.retainAll(l1); System.out.println(l);  //print common element 
		 */
		
		l.addAll(l1);
		System.out.println(l);
	}
	public static void main(String[] args) {
		arrayListRetain();
	}

}
