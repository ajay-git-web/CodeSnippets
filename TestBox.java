//1. Create class box and box3d. box3d is extended class of box. The above two classes going to pull fill following requirement. 
//Include constructor.set value of length, breadth, height. Find out area and volume. 

class Box{
	private int length;
	private int breadth;
	private int height;
	
	public void setLength(int length){
		this.length=length;
	}
	public int getLength(){
		return length;
	}
	public void setBreadth(int breadth){
		this.breadth=breadth;
	}
	public int getBreadth(){
		return breadth;
	}
	public void setHeight(int height){
		this.height=height;
	}
	public int getHeight(){
		return height;
	}
	public void area(){
		int result=length*breadth*height;
		System.out.println("Area of Box is: "+result);
	}
	public void volume(){
		int result=2*length*breadth +2*length*height+2*breadth*height;
		System.out.println("Volume of Box is: "+result);
	}
}

class Box3 extends Box{
	@Override
	public void area(){
		int result=getLength()*getBreadth()*getHeight();
		System.out.println("Area of Box3 is: "+result);
	}
	
	@Override
	public void volume(){
		int result=2*getLength()*getBreadth() +2*getLength()*getHeight()+2*getBreadth()*getHeight();
		System.out.println("Volume of Box3 is: "+result);
	}
}

public class TestBox{
	public static void main(String[] args){
		Box b=new Box();
		b.setBreadth(5);
		b.setHeight(7);
		b.setLength(4);
		b.area();
		b.volume();
		System.out.println("............");
		Box3 b3=new Box3();
		b3.setBreadth(1);
		b3.setHeight(7);
		b3.setLength(3);
		b3.area();
		b3.volume();
	}
}