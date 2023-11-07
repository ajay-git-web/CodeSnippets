//3. Write a program to give example for multiple inheritance in Java.
// In java we can achieve multiple inheritance using interface 
interface Printable{
	void print();
}
interface Showable{
	void show();
}
public class TestMultInheritance implements Printable,Showable{
	public void print(){
		System.out.println("Printing implementation....");
	}
	
	public void show(){
		System.out.println("Show implementation....");
	}
	public static void main(String[] args){
		TestMultInheritance t=new TestMultInheritance();
		t.print();
		t.show();
	}
}