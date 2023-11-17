package com.sample.array;

public class ArrayMain {
	
	public static void main(String[] args) {
		int[] arr= {10,23,40,15,25,50};
		int size=arr.length;
		int key=15;
		ArrayMethodClass.printArray(arr);
		ArrayMethodClass.printArrayWithSize(arr,size);
		ArrayMethodClass.getMax(arr, size);
		ArrayMethodClass.getMin(arr, size);
		ArrayMethodClass.getMax1(arr, size);
		ArrayMethodClass.getMin1(arr, size);
		ArrayMethodClass.sumOfArray(arr, size);
		
		boolean result=ArrayMethodClass.isKeyPresent(arr, size, key);
		System.out.println("Element "+key+" present ?---> "+result);
		
	}

}
