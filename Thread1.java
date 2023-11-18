package com.simple.thread;

public class Thread1 extends Thread{
		
		public void run() {
			for(int i=0;i<20;i+=2) {
				System.out.print(i+" ");
			}
		}
	
}

