import java.util.Scanner;
class MagicNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check is it magic number or not : ");
		int number=sc.nextInt();
		int temp=number;
		int sum=0;
		while(number>0){
			int rem=number%10;
			sum=sum+rem;
			number=number/10;
		}
		System.out.println("Initial sum= "+sum);
		int tempsum=sum;
		int total=0;
		while(sum>0){
			int rem=sum%10;
			total=total*10+rem;
			sum=sum/10;
		}
		System.out.println("Sum's sum= "+total);
		int result=tempsum*total;
	//	System.out.println(temp+"   "+result);
		if(result==temp){
			System.out.println(temp+" is magic number");
		}
		else{
			System.out.println(temp+" is not magic number");
		}
	}
}