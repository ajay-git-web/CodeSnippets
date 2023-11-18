package com.simple.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
	//	t1.start();
		
		Thread2 t2=new Thread2();
		Thread t=new Thread(t2);
		//t.start();
		
		Thread3 t3=new Thread3();
		//t3.start();
		Thread4 t4=new Thread4();
		t4.start();
	}

}
