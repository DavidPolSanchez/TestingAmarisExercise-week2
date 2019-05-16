

public class Room {
	
	int width;
	int length;
	int height;
	
	Room(int width,int length,int heigth){
		this.height=heigth;
		this.length=length;
		this.width=width;
	}
	int GetArea() {
		int area=this.height*this.length*this.width;
		return area;
	}
	

}
