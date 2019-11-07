package garage;

import java.util.ArrayList;
import java.util.List;

public class App {

		public static void main(String[] args) {
			Garage g = new Garage();
			g.addVehicle(new Car(4, 5, 2, 4));
			g.addVehicle(new Helicopter(3, 4, 3, 12));
			g.addVehicle(new Motorbike(2, 0, 3, 1));
			g.removeVehiclesByType(Vehicle.class);
			g.printVehicles();
			g.calcBill();
	}

}
