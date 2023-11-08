//Reverse String
import java.util.Scanner;
class ReverseString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		
		// Using loop
		char[] ch=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(ch[i]);
		}
		System.out.println();
		
		//Using Stringbuilder reverse method
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());
	}
}