package garage;

public class App {
	public static void main(String[] args) {
		Garage g = new Garage();
		g.addVehicle(new Car(1, 2, 3, 4));
		g.addVehicle(new Boat(1, 2, 3, "prop"));
		g.printVehicles();
		/*g.removeVehiclesByType(Vehicle.class);*/
		g.printVehicles();
	}
}