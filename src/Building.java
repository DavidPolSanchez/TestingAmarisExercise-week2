import java.util.ArrayList;

public class Building {
	String BuildingName;
	ArrayList<Floor> Floors;
	
	Building(String name){
		this.BuildingName=name;
		this.Floors=new ArrayList<Floor>();
	}
	void addFloor(Floor floor){
		this.Floors.add(floor);
	}
	int GetTotalArea () {
		int area=0;
		int currentitemarea;
		for(Floor floor: this.Floors) {
			currentitemarea=floor.GetArea();
			area = area+currentitemarea;
		}
		return area;
	}
}
