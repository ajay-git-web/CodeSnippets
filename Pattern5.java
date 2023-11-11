import java.util.Scanner;
class Pattern5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows: ");
		int number=sc.nextInt();
		for(int i=number;i>=1;i--){
			for(int k=1;k<i;k++)
				System.out.print("  ");
			for(int j=i;j<number;j++){
				System.out.print(j+" ");
			}
			for(int m=number;m>=i;m--){
				System.out.print(m+" ");
			}
			System.out.println();
			
		}
	}
}