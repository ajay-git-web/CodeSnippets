import java.util.*;

public class LinkedListDemo {
	public static void llDemo1() {
		List l=new LinkedList<>();
		l.add(12);
		l.add(23);
		l.add(34);
		l.add(56);
		
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext()) {
			System.out.print(ltr.next()+" ");
		}
		System.out.println();
		while(ltr.hasPrevious()) {
			System.out.print(ltr.previous()+" ");
		}
	System.out.println();
	}
	public static void llDemo2() {
	List<String> l=new LinkedList<>();
	l.add("12");
	l.add("23");
	l.add("34");
	l.add("56");
	
	Iterator itr=l.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
	public static void reverseList() {
		List<Integer> l=new LinkedList<Integer>();
		l.add(45);
		l.add(18);
		l.add(96);
		l.add(63);
		l.add(23);
		System.out.println(l);
		System.out.println("Size on list: "+l.size());
		
		//reverse List using for loop
		/*
		 * for(int i=l.size()-1;i>=0;i--) { System.out.print(l.get(i)+ " "); }
		 */
		//reverse List using list iterator hasprevious
		
		ListIterator<Integer> ltr=l.listIterator();
		while(ltr.hasNext()) {
			ltr.next();
		}
		while(ltr.hasPrevious()) {
			System.out.print(ltr.previous()+" ");
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//llDemo1();
		//llDemo2();
		reverseList();

}
}
