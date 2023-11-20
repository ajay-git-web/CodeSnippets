import java.util.*;

class Student1 {
	private String name;
	private int id;

	Student1(String name, int id) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

}

public class ListSort {
	static Scanner sc = new Scanner(System.in);

	public static void method1() {
		List<Student1> l = new ArrayList<Student1>();
		System.out.println("NUmber of students :");
		int testcase = sc.nextInt();
		while (testcase > 0) {
			System.out.println("Enter student deatils:");
			System.out.println("Enter name:");
			String n = sc.next();
			System.out.println("Enter id");
			int id = sc.nextInt();

			Student1 st = new Student1(n, id);
			l.add(st);

			
			  
			  l.sort(new Comparator<Student1>() { public int compare(Student1 s1,Student1
			  s2) { return s1.getName().toLowerCase().compareTo(s2.getName().toLowerCase()); } });
			 
			testcase--;
		}

		for (Student1 s : l) {
			System.out.println(s.getName());
		}
	}

	public static void method2() {
		List l = new ArrayList();

		l.add(12);
		l.add(23);
		l.add(45);
		l.add(15);
		l.add(5);

		Collections.sort(l);
		System.out.println(l);

		List l1 = new ArrayList();

		l1.add("Rohit");
		l1.add("Ahan");
		l1.add("Ajay");
		l1.add("Yudh");
		l1.add("Clark");

		Collections.sort(l1);
		System.out.println(l1);
	}

	public static void main(String[] args) {
		method1();
		// method2();
	}

}
