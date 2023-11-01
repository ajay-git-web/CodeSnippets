class ArraySample{
	public static void main(String[] args){
		//int[] arr=new int[-5]; //program will compile u will get negativearraysize exception
		int[] arr=new int[5];
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[5]); // get ArrayIndexOutOfBoundException
	}
	}
}