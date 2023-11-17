import java.io.*;
class FileReaderDemo{
	public static void main(String[] args){
		try{
		FileReader fr=new FileReader("sample.txt");
		int c;
		int ch=0;
		int lc=0;
		int wc=0;
		while((c=fr.read())!=-1){
			System.out.print((char)c);
			ch++;
			if(c=='\n')
				lc++;
			if(c==' ' || c=='\t')
				wc++;
		}
		System.out.println();
		System.out.println("__________________________________");
		System.out.println("Number of charcters in File is :"+ch);
		System.out.println("Number of lines in file is :"+lc);
		System.out.println("Number of words in file is :"+(wc+lc));
		}catch(Exception e){
			System.out.println(e);
		}
	}
}