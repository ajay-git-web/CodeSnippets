class InsuffiecientBalanceException extends Exception{
	InsuffiecientBalanceException(String message){
		super(message);
	}
}

class CustomerExceptionDemo{
	private double balance;
	CustomerExceptionDemo(double balance){
		this.balance=balance;
	}
	public void withdraw(double amt)throws InsuffiecientBalanceException{
		if(amt>balance){
			throw new InsuffiecientBalanceException("Insufficient balance....");
		}else{
			balance=balance-amt;
			System.out.println("Withdraw successfully!!!");
			System.out.println("After withdraw remaining balance "+balance);
		}
	}
	
	public static void main(String[] args){
		CustomerExceptionDemo ced=new CustomerExceptionDemo(20000);
		try{
			ced.withdraw(10000);
			ced.withdraw(25000);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}