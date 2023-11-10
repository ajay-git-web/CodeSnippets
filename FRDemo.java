import java.io.*;
class FRDemo{
	public static void main(String[] args) throws IOException{
		FileReader fr=new FileReader("abc.txt");
		int c;
		int lc=0;
		int wc=0;
		while((c=fr.read())!=-1){
			System.out.print((char)c);
			if(c=='\n')
				lc++;
			if(c==' ')
				wc++;
		}
		System.out.println("\nNumber of lines: "+(lc+1));	//number of lines count
		System.out.println("\nNumber of words: "+(wc+lc+1));	//number of words count
		fr.close();
	}
}