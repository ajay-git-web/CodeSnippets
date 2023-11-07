//Prove this

class Sample2{
	Sample2(){
		System.out.println(this);
	}
	public void prove(){
		System.out.println(this);
	}

	public static void main(String[] args){
		Sample2 s=new Sample2();
		s.prove();
		System.out.println(s);
}
}