package com.simple.thread;

public class Thread3 extends Thread{
	public void printEvenNumber(int n) {
		for(int i=0;i<=n;i+=2) {
			System.out.print(i+" ");
		}
	}
	public void printOddNumber(int n) {
		for(int i=1;i<=n;i+=2) {
			System.out.print(i+" ");
		}
	}
	public void run() {
		printEvenNumber(20);
		printOddNumber(20);
	}
}
