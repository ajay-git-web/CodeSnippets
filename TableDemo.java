class Table{
	public synchronized void printTable(int n){
		for(int i=1;i<=10;i++){
			System.out.println(n+" * "+i+" = "+(n*i)+" "+Thread.currentThread().getName());
				try{
				Thread.sleep(500);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	
	}
}
public class TableDemo {
    public static void main(String[] args) {      
        Table t = new Table();
        
         new Thread() {
            public void run() {
                t.printTable(13);
            }
        }.start();
        
        new Thread() {
            public void run() {
                t.printTable(21);
            }
        }.start();
        
         new Thread() {
            public void run() {
                t.printTable(11);
            }
        }.start();
    }
}
