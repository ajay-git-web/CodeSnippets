import java.util.*;

class ArrayIndexBoundOfException{
	public static void main(String[] args){
			int[] arr=new int[10];
			for(int i=0;i<arr.length;i++){
				arr[i]=1+(int)(Math.random()*20);
			}
			
			for(int i:arr)
				System.out.print(i+" ");
			
			System.out.println("\n----------");
			try{
				System.out.println("element found and which is "+arr[1+(int)(Math.random()*25)]);
			}catch(Exception e){
				System.out.println(e);
			}
			
			System.out.println("Rest of the code executed");
			
	}
}