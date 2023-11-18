package com.simple.thread;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<20;i+=2) {
			System.out.print(i+" ");
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			System.out.println(e);
		}
		}
	}

}
