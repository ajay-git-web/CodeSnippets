import java.util.Scanner;
class DivideByZeroException{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers: ");
		try{
			int number1=sc.nextInt();
			int number2=sc.nextInt();
			int result=number1/number2;
			System.out.println("Result is :"+result);
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Rest of the code is executed");
		
	}
}