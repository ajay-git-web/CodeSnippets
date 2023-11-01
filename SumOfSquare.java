//Write a java program to populate an array 15 elements and find sum of the squares of odd number

import java.util.Arrays;
class SumOfSquare{
	public static void main(String[] args){
		
		int[] arr=new int[15];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=1+(int)(Math.random()*15);
		}
		Arrays.sort(arr);
		for(int x:arr)
			System.out.print(x+" ");
		System.out.println();
		int sum=0;
		for(int i:arr){
			if(i%2!=0){
				sum=sum+i*i;
			}
		}
		System.out.println("Sum of square of odd number is:"+sum);
		
		
	}
}
