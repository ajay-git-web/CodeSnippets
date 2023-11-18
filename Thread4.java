package com.simple.thread;

import java.util.*;

public class Thread4 extends Thread{
	List l1=new ArrayList();
	List l2=new ArrayList();
	public void printPrimeNumber(int n) {
		System.out.println("Prime number between 1 to "+n);
		int cnt;
		for(int i=2;i<=n;i++) {
			cnt=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			if(cnt==2) {
				System.out.print(i+" ");
				l1.add(i);
			}
		}
	}
	public void printFibbo(int n) {
		System.out.println("Fibbonacci number series "+n);
		int n1=0;
		int n2=1;
		int sum=0;
		while(n>0) {
			sum=n1+n2;
			System.out.print(n1+" ");
			l2.add(n1);
			n1=n2;
			n2=sum;
			n--;
		}
	}
	
	public void printCommon() {
		System.out.println("Common elements between printPrimenumber and printFibbonacci");
		l1.retainAll(l2);
		Iterator itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}
	public void run() {
		printPrimeNumber(20);
		System.out.println();
		printFibbo(10);
		System.out.println();
		printCommon();
	}
}
