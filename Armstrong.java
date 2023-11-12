import java.util.*;
class Armstrong{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check is it Armstrong:");
		int number=sc.nextInt();
		int temp=number;
		int tnum=number;
		int sum=0;
		int cnt=0;
		while(temp>0){
			int rem=temp%10;
			cnt++;
			temp=temp/10;
		}
		//System.out.println(cnt);
		int d=cnt;
		while(cnt>0){
			int rem=number%10;
			sum=sum+(int)Math.pow(rem,d); //Math.pow return double need to type cast in int
			number=number/10;
			cnt--;
		}
		if(tnum==sum)
			System.out.println(tnum +" is Armstrong number");
		else
			System.out.println(tnum +" is not Armstrong number");
	}
}