
public class Student {
	private String name;
	private int rollNo;
	public Student(String name,int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
	}
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student Detail: Name - "+name+" Roll Number -"+rollNo;
	}
	
	
}
