import java.util.Scanner;
class GuessNumber{
	public static void main(String[] args){
		int randnum=1+(int)(Math.random()*100);
		
		System.out.println("Number generated: "+randnum);
		Scanner in=new Scanner(System.in);
		int number;
		
		do{
			System.out.println("Guess again: ");
			number=in.nextInt();
			
			if(randnum==number){
				System.out.println("Congrats You won!!!");
			}
			else if(number<randnum){
				System.out.println("Number is to low ");
			}
			else{
				System.out.println("Number is to high");
			}
		}while(number!=randnum);
	}
}
