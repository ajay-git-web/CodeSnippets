import java.util.*;
public class ListUserObjDemo {
	public static void listMethodWithUserDefinedObj() {
		List<Student>l=new ArrayList<Student>();
		l.add(new Student("Ajay",007));
		l.add(new Student("Sanjay",107));
		l.add(new Student("Vijay",207));
		l.add(new Student("Sujay",307));
		
		Iterator<Student> itr=l.iterator();
		while(itr.hasNext()) {
			//System.out.println(itr.next()); //output will get like Student Detail: Name - Ajay Roll Number -7
			Student s=(Student)itr.next();
			System.out.println(s.getName()+" "+s.getRollNo());
		
			
		}
	}
	public static void main(String[] args) {
		listMethodWithUserDefinedObj();
	}

}
