class Display{
	public synchronized void dispLowerCase(){
		for(int i=97;i<=122;i++){
			System.out.print((char)i+" ");
		}
		System.out.println();
	}
	
	public synchronized void dispUpperCase(){
		for(int i=65;i<=90;i++){
			System.out.print((char)i+" ");
		}
		System.out.println();
	}
	
	public synchronized void dispNumber(){
		for(int i=1;i<=26;i++){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
public class DisplayDemo{
	public static void main(String[] args){
		Display d=new Display();
		new Thread(){
			public void run(){
				d.dispLowerCase();
			}
		}.start();
		
		new Thread(){
			public void run(){
				d.dispUpperCase();
			}
		}.start();
		
		new Thread(){
			public void run(){
				d.dispNumber();
			}
		}.start();
		
	}
}