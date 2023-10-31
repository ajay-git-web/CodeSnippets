//Read a character and find weather it's vowel oe consonent using switch stmt
import java.util.*;
class CharacterSwitchDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a charcter: ");
		char ch=sc.next().charAt(0);
		System.out.println("Entered character :"+ch);
		switch(Character.toLowerCase(ch)){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("It's vowel");
				break;
			default:
				System.out.println("It's consonent");
		}
	}
}