import java.io.*;
class FileWriterDemo{
	public static void main(String[] args){
		try{
		FileWriter fw=new FileWriter("sample.txt",true);
		String str="\nHi\nHello\nHow are you\nI am Fine\nHappy Diwali\nEnjoy Festival";
		fw.write(str);
		System.out.println("File written successfully.");
		fw.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}