import java.util.Scanner;
class PascalTriangle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want:");
		int number=sc.nextInt();
		int count;
		for(int i=1;i<=number;i++){
			count=1;
			for(int j=1;j<=i;j++){
				System.out.print(count+" ");
				count=count*(i-j)/j;
			}System.out.println();
		}
	}
}