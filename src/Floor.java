import java.util.ArrayList;

public class Floor {
	
	Building Building;
	ArrayList<Room> Rooms;
	
	Floor(Building building){
		this.Building=building;
		this.Rooms= new ArrayList<Room>();
	}
	void addRoom(Room room) {
		this.Rooms.add(room);
	}
	int GetArea() {
		int currentitemarea;
		int area=0;
		for(Room room: this.Rooms) {
			currentitemarea=room.GetArea();
			area = area+currentitemarea;
		}
		return area;
	}
}
