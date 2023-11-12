/*
Write a java program to find duplicate characters and their count in a given string
For example, in a string Better Butter, duplicate characters and their count is t : 4, e : 3, r : 2 and B : 2.
*/
import java.util.Scanner;
class Duplicate{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
		char[] c=str.toCharArray();
		int count;
		for(char ch='a';ch<='z';ch++){
			count=0;
			for(int i=0;i<str.length();i++){	
			if(c[i]==ch){
				count++;
			}
			
		}if(count>1)
			System.out.print(ch+":"+count+",");
			
		}
			for(char ch='A';ch<='Z';ch++){
			count=0;
			for(int i=0;i<str.length();i++){	
			if(c[i]==ch){
				count++;
			}
			
		}if(count>1)
			System.out.print(ch+":"+count+",");
			
		}
		
		
	}
}