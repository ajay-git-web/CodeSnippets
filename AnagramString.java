//Anagram String
import java.util.Scanner;
class AnagramString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String st=sc.nextLine();
		System.out.println("Entered String : "+st);
		//Using loops
		char[] str=st.toLowerCase().toCharArray();
		int count=0;
		for(char c='a';c<='z';c++){
			for(int j=0;j<str.length;j++){
				if(c==str[j]){
					count++;
					break;
				}
			}
		}
		if(count==26){
			System.out.println("String is an anagram");
		}else{
			System.out.println("String is not an anagram");
		}
}
}