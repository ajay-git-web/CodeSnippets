/* 6. Create a class named 'Member' having the following members:
   Data members
	1 - Name
	2 - Age
	3 - Phone number
	4 - Address
	5 - Salary
   It also has a method named 'printSalary' which prints the salary of the members. 
   Two classes 'Employee' and 'Manager' inherits the 'Member' class. 
   The 'Employee' and 'Manager' classes have data members'specialization' and 'department' respectively. 
   Now, assign name, age, phone number, address and salary to an employee and 
   a manager by making an object of both of these classes and print the same.
*/

class Member{
	private String name;
	private int age;
	private String phoneNo;
	private String address;
	private double salary;
	
	public Member(String name,int age,String phoneNo,String address,double salary){
		this.name=name;
		this.age=age;
		this.phoneNo=phoneNo;
		this.address=address;
		this.salary=salary;
	}
	public String getName(){
			return name;
		}
		public int getAge(){
			return age;
		}
		public String getPhone(){
			return phoneNo;
		}
		public String getAddress(){
			return address;
		}
		public double getSalary(){
			return salary;
		}
	public void printSalary(){
		System.out.println("Salary of member is: "+salary);
	}
}
class Employee extends Member{
	private String specialization;
	private String department;
	public Employee(String name,int age,String phoneNo,String address,double salary,String specialization,String department){
		super(name,age,phoneNo,address,salary);
		this.specialization=specialization;
		this.department=department;
	}
	public void display(){
		System.out.println("Employee details: ");
		System.out.println("Employee name: "+getName());
		System.out.println("Age :"+getAge());
		System.out.println("Phone no :"+getPhone());
		System.out.println("Address  :"+getAddress());
		System.out.println("Salary :"+getSalary());
		System.out.println("Specialzation :"+specialization);
		System.out.println("Department :"+department);
	}
	
}
class Manager extends Member{
	private String specialization;
	private String department;
	public Manager(String name,int age,String phoneNo,String address,double salary,String specialization,String department){
		super(name,age,phoneNo,address,salary);
		this.specialization=specialization;
		this.department=department;
	}
	public void display(){
		System.out.println("Manager details: ");
		System.out.println("Employee name: "+getName());
		System.out.println("Age :"+getAge());
		System.out.println("Phone no :"+getPhone());
		System.out.println("Address  :"+getAddress());
		System.out.println("Salary :"+getSalary());
		System.out.println("Specialzation :"+specialization);
		System.out.println("Department :"+department);
	}
	
}
public class NewTest{
	public static void main(String[] args){
		Employee e=new Employee("Ajay",23,"88888999","A/P-SATARA,MAHARASHTRA",235000,"JAVA","DEVLOPMENT");
		e.display();
		System.out.println("-----------------");
		Manager m=new Manager("HariKrishna",54,"883334442","Sikadrabad,HYDERABAD-500510",855000,"Design","PM");
		m.display();
	}
}