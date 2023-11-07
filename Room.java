/* 7. Write a program to create a room class, the attributes of this class is roomno, roomtype, roomarea and   ACmachine. In this class the member
   functions are setdata and displaydata.
*/

public class Room{
	private int roomNo;
	private String roomType;
	private double roomarea;
	
	public void setData(int roomNo,String roomType,double roomarea){
		this.roomNo=roomNo;
		this.roomType=roomType;
		this.roomarea=roomarea;
	}
	public void displaydata(){
		System.out.println("Room Details: ---------");
			System.out.println("Room Number :"+roomNo+"\nRoom Type :"+roomType+"\nRoom Area allocated :"+roomarea);
	}
	public static void main(String[] args){
		Room r=new Room();
		r.setData(203,"Hall",79);
		r.displaydata();
		Room r1=new Room();
		r1.setData(502,"Kitchen",40);
		r1.displaydata();
	}
}