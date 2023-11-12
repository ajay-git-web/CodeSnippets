//Anagram program eg.  str1=Mother In Law and str2=Hithler Woman are anagrams eg keep-peek, School master - the classroom
//need some improvement inbelow pgm
import java.util.Scanner;
class Anagram{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first string:");
		String str1=sc.nextLine();
		System.out.println("Enter a second string:");
		String str2=sc.nextLine();
		char[] c1=str1.toLowerCase().toCharArray();
		char[] c2=str2.toLowerCase().toCharArray();
		int count=0;
		for(int j=0;j<c1.length;j++){
			for(int i=0;i<c2.length;i++){
				if(c1[j]==c2[i]){
					count++;
					break;
				}
			}
		}
		System.out.println(count+" "+c1.length+" "+c2.length);
		if(count==c2.length && count==c1.length){
			System.out.println("String is anagram");
		}else{
			System.out.println("String is not anagram");
		}
		
	}
}