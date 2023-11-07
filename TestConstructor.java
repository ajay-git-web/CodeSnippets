/* 4. Demonstrate calling the constructor of the base class from the constructor of the derived class. 
   Create objects of person and employee classes to show the order of invocation of constructors. */
 class Person1{
	private String name;
	private int age;
	Person1(){
	System.out.println("Person1 default constructor");
	}
	Person1(String name,int age){
		System.out.println("Person1 parameter constructor");
		this.name=name;
		this.age=age;
	}
 } 
 
 class Employee extends Person1{
		private String dept;
		Employee(){
			System.out.println("Employee default constructor");
		}
		Employee(String dept){
			System.out.println("Employee parameter constructor");
			this.dept=dept;
		}
 }
 
public class TestConstructor{
	public static void main(String[] args){
		Person1 p=new Person1();
		Person1 p1=new Person1("Ajay",23);
		Employee e=new Employee();
		Employee e1=new Employee("HR");
		
	}
}