//check equality of two arrays:

class EqualityArray{
	public static void main(String[] args){
		int[] arr1=new int[]{1,2,3,4,5};
		int[] arr2=new int[]{1,2,2,3,4};
		System.out.println("First array:");
		for(int i:arr1)
			System.out.print(i+" ");
		System.out.println("\nSecond array:");
		for(int j:arr2)
			System.out.print(j+" ");
		System.out.println();
		int cnt=0;
		if(arr1.length==arr2.length){	
			for(int i=0;i<arr1.length;i++){
				for(int j=0;j<arr2.length;j++){
					if(arr1[i]==arr2[j]){
					cnt++;
				}
				}
			}
			if(cnt==arr1.length){
					System.out.println("Equal");
				}
				else{
					System.out.println("Not Equal");
				}
		}
		else{
			System.out.println("Array is not Equal");
		}
		
	}
}