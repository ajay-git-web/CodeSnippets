import java.io.*;
class FWDemo{
	public static void main(String[] args)throws IOException{
		FileWriter fw=new FileWriter("abc.txt",true);
		String str="\nWelocme to IO sample\nHappy Diwali\nWelcome to Java";
		fw.write(str);
		fw.close();
	}
}