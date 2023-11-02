//10 . Program to add two matrices
class AddMetrics{
	public static void main(String[] args){
		int[][] farr=new int[4][3];
		int[][] sarr=new int[4][3];
		int[][] sum=new int[4][3];
		System.out.println("First array:");
		for(int i=0;i<farr.length;i++){
			
			for(int j=0;j<farr[i].length;j++){
				farr[i][j]=1+(int)(Math.random()*15);
				System.out.print(farr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Second Array:");
		
		for(int i=0;i<sarr.length;i++){
			
			for(int j=0;j<sarr[i].length;j++){
				sarr[i][j]=1+(int)(Math.random()*15);
				System.out.print(sarr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Sum of two arr:");
		for(int i=0;i<sarr.length;i++){
			for(int j=0;j<sarr[i].length;j++){
				sum[i][j]=farr[i][j]+sarr[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}