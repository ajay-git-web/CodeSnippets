//Java White Spaces Removal Program
import java.util.Scanner;
class RemoveSpace{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string :");
		String str=sc.nextLine();
		System.out.println("Original string with spaces length :"+str.length());
		//String s1=str.replaceAll("\\s+","");  //replaceAll method used to remove all spaces
		//System.out.println(s1);
		
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]!=' '&& ch[i]!='\t'){
				System.out.print(ch[i]);
			}
		}
	}
}