//Write a program to determine if two strings are anagrams of each other (contain the same characters in a different order).
import java.util.Scanner;
class AngramString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first string :");
		String st1=sc.nextLine();
		System.out.println("Entered String1: "+st1);
		System.out.println("Enter a second string :");
		String st2=sc.nextLine();
		System.out.println("Entered String2: "+st2);
		
		char[] c1=st1.toLowerCase().toCharArray();
		char[] c2=st2.toLowerCase().toCharArray();
		int ct1=0;
		int ct2=0;
		for(char c='a';c<='z';c++){
			for(int i=0;i<c1.length;i++){
				if(c==c1[i]){
					ct1++;
					break;
				}
			}
		}
		for(char c='a';c<='z';c++){
			for(int i=0;i<c2.length;i++){
				if(c==c2[i]){
					ct2++;
					break;
				}
			}
		}
		
		if(ct1==ct2){
			System.out.println("String is an anagram");
		}else{
			System.out.println("String is not an anagram");
		}
}
}