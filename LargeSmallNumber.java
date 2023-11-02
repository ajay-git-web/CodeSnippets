//8. Program to find nth largest / smallest element in array
class LargeSmallNumber{
	public static void main(String[] args){
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=1+(int)(Math.random()*100);
		}
		for(int x:arr)
			System.out.print(x+" ");   
		System.out.println();
		
		//Sorting array elements
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		
		for(int x:arr)
			System.out.print(x+" "); //printed sorted array
		System.out.println();
		int number=(int)(Math.random()*10);
		System.out.println("The "+(number+1)+" th smallest element is "+arr[number]);
		System.out.println("The "+(number+1)+" th largest element is "+arr[arr.length-1-number]);
		
		
	}
}