/*2. Define a base class person and a derived class employee with single inheritance. 
  -Define SetData() member functions in each of the class with different signatures to set the data members and
   demonstrate overloading of member functions. 
  -Define GetData() member functions in each of the class with same signatures to display data and 
   demonstrate overriding of member functions. */
   
class Person{
	private String name;
	private int age;
	public void setData(String name,int age){
		this.name=name;
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public void getData(){
		System.out.println("Name: "+name+"\tAge :"+age);
	}
}

class Employee extends Person{
	private int salary;
	public void setData(String name,int age,int salary){
		super.setData(name,age);
		this.salary=salary;
	}
	@Override
	public void getData(){
		System.out.println("Name: "+getName()+"\tAge :"+getAge()+"\tSalary:"+salary);
	}
	
}
public class Test{
	public static void main(String[] args){
	Person p=new Person();
	p.setData("Ajay",21);
	p.getData();
	Employee e=new Employee();
	e.setData("A",23,40000);
	e.getData();
	}
}