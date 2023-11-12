import java.util.*;
class AnagramWithMethod{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first string:");
		String str1=sc.nextLine();
		System.out.println("Enter a second string:");
		String str2=sc.nextLine();
		String str3=str1.replaceAll("\\s","");
		String str4=str2.replaceAll("\\s","");
		char[] c1=str3.toLowerCase().toCharArray();
		char[] c2=str4.toLowerCase().toCharArray();
		if(c1.length==c2.length){
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1,c2)){
				System.out.println("String is anagram");
			}
			else{
				System.out.println("String is not anagram");
			}
		}
		else{
			System.out.println("String is not anagram");
		}
		
	}
}