package com.sample.jcotd;

public class PronicProgram {
	public static boolean isPronic(int n) {
		
		for(int i=0;i<=n;i++) {
			int r=i*(i+1);
			if(r==n) {
			
				return true;
				
			}
		}
		return false;
	}
	public static void main(String[] args) {
		boolean result=isPronic(90);
		if(result) {
			System.out.println("Number is pronic");
		}
		else {
			System.out.println("Number is not pronic");
		}
	}

}
