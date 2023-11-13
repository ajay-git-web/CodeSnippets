class InvalidAgeException extends Exception{
	public InvalidAgeException(String message){
		super(message);
	}
}
public class AgeException{
	public void checkAge(int age) throws InvalidAgeException{
		if(age<0 || age>120){
			throw new InvalidAgeException("Age should be between 1 and 119");
		}
		else{
			System.out.println("You are "+age);
		}
	}
	public static void main(String[] args){
		AgeException ae=new AgeException();
		try{
			ae.checkAge(12);
			ae.checkAge(123); //exception will raise here due to given conditon
		}catch(Exception e){
			System.out.println(e);
		}
	}
}