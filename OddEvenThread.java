package com.sample.jcotd;

public class OddEvenThread implements Runnable {
	synchronized public void run() {
		if(Thread.currentThread().getName().equals("Even")) {
		for(int i=0;i<=20;i+=2) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		}else {
		for(int i=1;i<=20;i+=2) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		}
	}
	public static void main(String[] args) {
		
		OddEvenThread ot=new OddEvenThread();
		Thread t=new Thread(ot);
		t.setName("Even");
		t.start();
		//OddEvenThread ot1=new OddEvenThread();
		Thread t1=new Thread(ot);
		t1.setName("Odd");
		t1.start();
	}

}

