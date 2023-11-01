import java.util.Scanner;
class ReversePyramidPattern{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want: ");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++){
			for(int k=1;k<=i;k++)
				System.out.print(" ");
			for(int j=i;j<=number;j++){
				System.out.print("* ");
			}System.out.println();
		}
	}
}