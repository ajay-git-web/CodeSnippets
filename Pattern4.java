import java.util.Scanner;
class Pattern4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows: ");
		int number=sc.nextInt();
		for(int i=number;i>=1;i--){
			for(int k=i;k<number;k++)
				System.out.print("  ");
			for(int j=1;j<i;j++){
				System.out.print(j+" ");
			}
			for(int m=i;m>=1;m--){
				System.out.print(m+" ");
			}
			System.out.println();
			
		}
	}
}