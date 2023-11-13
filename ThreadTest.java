class Test{
	public synchronized void printable(int n){
		//System.out.println("Thread")
		for(int i=1;i<=n;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public synchronized void even(int n){
		for(int i=0;i<=n;i+=2){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public synchronized void odd(int n){
		for(int i=1;i<=n;i+=2){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

class Thread1 extends Thread{
	Test test;
	public Thread1(Test test){
		this.test=test;
	}
	public void run(){
		test.even(15);
	}
}
class Thread2 extends Thread{
	Test test;
	public Thread2(Test test){
		this.test=test;
	}
	public void run(){
		test.odd(15);
	}
}
class Thread3 extends Thread{
	Test test;
	public Thread3(Test test){
		this.test=test;
	}
	public void run(){
		test.printable(15);
	}
}
public class ThreadTest{
	public static void main(String[] args){
		Test t=new Test();
		Thread1 t1=new Thread1(t);
		Thread2 t2=new Thread2(t);
		Thread3 t3=new Thread3(t);
		t1.start();
		t2.start();
		t3.start();
	}
}