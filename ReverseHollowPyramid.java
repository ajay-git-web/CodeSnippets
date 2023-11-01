
import java.util.Scanner;
class ReverseHollowPyramid{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter anumber of rows u want: ");
		int number=sc.nextInt();
		int x=1;
		for(int i=number;i>=1;i--){
			for(int k=1;k<=x;k++)
				System.out.print(" ");
			for(int j=1;j<=2*i-1;j++){
				if(j==1||j==2*i-1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}System.out.println();
			x=x+1;
		}
	}
}