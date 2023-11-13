import java.util.*;
class NegativeNumberException extends Exception{
	public NegativeNumberException(String message){
		super(message);
	}
}

public class NestedTry{
	public static void checkNumber(int number)throws NegativeNumberException{
			if(number<0)
					throw new NegativeNumberException("Number is negative, Number should be positive");
				else
					System.out.println("Entered number :"+number);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		try{
			int number=sc.nextInt();
			try{
				checkNumber(number);
			}catch(Exception e){
				System.out.println(e);
			}
		}catch(InputMismatchException e){
			System.out.println(e);
		}
		System.out.println("Rest of the code executed");
	}
}