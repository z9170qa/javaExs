package garage;

public class Car extends Vehicle {
	
	private int bootSpace;
	
	public Car() {
		super();
	}
	
	public Car(int noOfWheels, int noOfDoors, int noOfColours, int bootSpace) {
		super(noOfWheels, noOfDoors, noOfColours);
		this.bootSpace = bootSpace;
	}
	
	public void openBoot() {
		System.out.println("Boot is now open!");
	}
	
	@Override
	public float calcBill() {
		return bootSpace * 11;
	}

	public int getBootSpace() {
		return bootSpace;
	}

	public void setBootSpace(int bootSpace) {
		this.bootSpace = bootSpace;
	}
	
	@Override
	public String toString() {
		return "I am a car";
	}

	@Override
	public void travel() {
		System.out.println("Skrrting down the road!");
		
	}
	
	
}


