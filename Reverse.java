//Reverse String

class Reverse{
	public static void main(String[] args){
		String str="All men are good in their own way";
		System.out.println("Original String: "+str);
		//StringBuilder sb=new StringBuilder(str);
		//System.out.println(sb.reverse());
		
		char ch[]=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(ch[i]);
		}
		
	}
}