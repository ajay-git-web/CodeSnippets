import java.util.Scanner;
class Magic{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=sc.nextInt();
		result(number);
		
	}
	static int sum(int n){
		int s=0;
		while(n>0){
			int rem=n%10;
			s=s+rem;
			n=n/10;
		}
		return s;
	}
	static int rev(int n){
		int r=0;
		while(n>0){
			int rem=n%10;
			r=r*10+rem;
			n=n/10;
		}
		return r;	
	}
	
	static void result(int number){
		int n1=sum(number);
		int n2=rev(n1);
		int re=n1*n2;
		if(re==number){
			System.out.println(number+" is magic number");
		}else{
			System.out.println(number+" is not magic number");
		}
	}
}