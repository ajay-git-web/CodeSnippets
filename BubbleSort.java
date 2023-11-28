package com.sample.jcotd;

public class BubbleSort {
	
	public static int[] bsort(int[] arr,int n) {
		System.out.println("Array elements before sorting:");
		for(int a:arr)
			System.out.print(a+" ");
		System.out.println("\nElements after bubble sort: ");
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		return arr;
	}
	public static void main(String[] args) {
		int[] arr=new int[] {23,34,21,12,45,62,16};
		int size=arr.length;
		int[] sortarr=bsort(arr, size);
		for(int a:sortarr)
			System.out.println(a);
	}

}
