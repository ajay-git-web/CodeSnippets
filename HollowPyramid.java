import java.util.Scanner;
class HollowPyramid{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number of rows u want: ");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++){
			for(int k=i;k<=number;k++)
				System.out.print("#");
			for(int j=1;j<=2*i-1;j++){
				if(j==1 ||j==2*i-1){
					System.out.print("*");
				}
				else{
					System.out.print("-");
				}
			}System.out.println();
		}
	}
}