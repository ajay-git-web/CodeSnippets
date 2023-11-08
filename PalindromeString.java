//Palindrome String
import java.util.Scanner;
class PalindromeString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		
		System.out.println("Entered String : "+str);
		//Using Stringbuilder reverse method
		StringBuilder sb=new StringBuilder(str);
		if (str.equals(sb.reverse().toString())) {
    System.out.println("String is palindrome");
} else {
    System.out.println("String is not palindrome");
}
	}
}