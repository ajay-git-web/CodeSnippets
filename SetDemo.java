import java.util.*;
public class SetDemo {
	public static void hashsetDemo() {
		Set<Integer> s=new HashSet();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(20);
		s.add(null);
		s.add(null);
		
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(20);
		s1.add(null);
		s1.add(null);
		
		Iterator<Integer> itr1=s1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		
		}
		
	}
	
	public static void linkedHashsetDemo() {
		Set s=new LinkedHashSet();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(20);
		s.add(null);
		s.add(null);
		
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	public static void treesetDemo() {
		TreeSet t=new TreeSet();
		t.add(10);
		t.add(30);
		t.add(40);
		t.add(20);
		
		//t.add("Ajay");// will get ClassCastException
		//t.add(null);   //will get NUllPointer Exception
		System.out.println(t);  //will get bydefault natural sorting order
		
		TreeSet<Student> ts=new TreeSet<Student>(new StudentCompByName());
		ts.add(new Student("Ajay",107));
		ts.add(new Student("Sanjay",207));
		ts.add(new Student("Vijay",507));
		ts.add(new Student("jay",407));
		ts.add(new Student("Rohit",307));
		
		System.out.println("Sorting By Name: ");
		Iterator<Student> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		TreeSet<Student> ts1=new TreeSet<Student>(new StudentCompByRollNo());
		ts1.add(new Student("Ajay",107));
		ts1.add(new Student("Sanjay",207));
		ts1.add(new Student("Vijay",507));
		ts1.add(new Student("jay",407));
		ts1.add(new Student("Rohit",307));
		System.out.println("Sorting By Roll Number: ");
		Iterator<Student> itr1=ts1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
	
	public static void main(String[] args) {
		//hashsetDemo();
		//linkedHashsetDemo();
		treesetDemo();
	}

}

class StudentCompByName implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}

class StudentCompByRollNo implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getRollNo() > o2.getRollNo())
			return 1;
		else
			return -1;
	}
}
