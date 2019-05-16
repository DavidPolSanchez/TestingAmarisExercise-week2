
public class App {

	public static void main(String[] args) {
		Room room1 = new Room(5,10,12);
		Building Edificio1 = new Building("Carlos");
		Floor floor1 = new Floor(Edificio1);
		Floor floor2 = new Floor(Edificio1);
		
		floor2.addRoom(room1);
		floor1.addRoom(room1);
		int areafloor=floor1.GetArea();
		System.out.println("el area es:"+areafloor);
		
		
		Edificio1.addFloor(floor1);
		Edificio1.addFloor(floor2);
		int totalarea=Edificio1.GetTotalArea();
		System.out.println("el area de "+Edificio1.BuildingName+" es :"+totalarea);

	}

}
