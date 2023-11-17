package com.sample.array;

public class ArrayMethodClass {

	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void printArrayWithSize(int[] arr,int size) {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void getMax(int[] arr,int size) {
		int max=arr[0];
		for(int i=0;i<size;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Max element is: "+max);
	}
	public static void getMin(int[] arr,int size) {
		int min=arr[0];
		for(int i=0;i<size;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Max element is: "+min);
	}
	
	public static void getMax1(int[] arr,int size) {
		int maxElement=Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			maxElement=Math.max(maxElement,arr[i]);
		}
		System.out.println("Maximum element is: "+maxElement);
	}
	
	public static void getMin1(int[] arr,int size) {
		int minElement=Integer.MAX_VALUE;
		for(int i=0;i<size;i++) {
			minElement=Math.min(minElement,arr[i]);
		}
		System.out.println("Minimum element is: "+minElement);
	}
	
	public static void sumOfArray(int[] arr,int size) {
		int sum=0;
		for(int i=0;i<size;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of array element is: "+sum);
	}
	
	public static  boolean isKeyPresent(int[] arr,int size,int key) {
		for(int i=0;i<size;i++) {
			if(key==arr[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static void reverseArray(int[] arr,int size) {
		for(int i=size-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//do implementation it's incomplete code
	public static void revArray(int[] arr,int size) {
		for(int i=0;i<size;i++) {
			
			swap(arr[i],arr[size-i-1]);
		}
	}
	public static void swap(int i,int j) {
		int temp=i;
		i=j;
		j=temp;
				
	}
	
	
}
