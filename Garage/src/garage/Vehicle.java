package garage;

public abstract class Vehicle {
	
	private int noOfWheels;
	private int noOfDoors;
	private int noOfColours;
	public Class<?> getClass;
	
	public Vehicle() {
	
	}
	
	public Vehicle(int noOfWheels, int noOfDoors, int noOfColours) {
		super();
		this.noOfWheels = noOfWheels;
		this.noOfDoors = noOfDoors;
		this.noOfColours = noOfColours;
	}
	

	@Override
	public String toString() {
		return "Vehicle [noOfWheels=" + noOfWheels + ", noOfDoors=" + noOfDoors + "noOfcolours=" + noOfColours + "]";
	}
	
	public void start() {
		System.out.println("Vehicle starting!");
	}
	
	public abstract void travel();
	

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public int getNoOfColours() {
		return noOfColours;
	}

	public void setNoOfColours(int noOfColours) {
		this.noOfColours = noOfColours;
	}

	public float calcBill() {
		// TODO Auto-generated method stub
		return noOfWheels*70 + noOfDoors*40 + noOfColours*120;
	}

}
