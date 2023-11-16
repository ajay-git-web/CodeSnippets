import java.util.*;
public class StackDemo {
	
	public static void stackMethod() {
		Stack s=new Stack();
		s.add(12);
		s.add(23);
		s.add(34);
		
		System.out.println(s);
		
		Stack<Integer> s1=new Stack<Integer>();
		s1.push(12);
		s1.push(45);
		s1.push(null);
		s1.push(89);
		s1.add(42);
		System.out.println(s1);
		
		//remove an element from stack
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		
		//top element of stack s1
		System.out.println(s1.peek());
	}
	public static void main(String[] args) {
		stackMethod();
	}

}
