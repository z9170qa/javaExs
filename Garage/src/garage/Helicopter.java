package garage;

public class Helicopter extends Vehicle {
	
	private int noOfRotors;
	
	public Helicopter() {
		super();
	}
	
	public Helicopter(int noOfWheels, int noOfDoors, int noOfColours, int noOfRotors) {
		super(noOfWheels, noOfDoors, noOfColours);
		this.noOfRotors = noOfRotors;
	}
	
	public void spinRotors() {
		System.out.println("Rotors spinning!");
	}

	@Override
	public float calcBill() {
		return noOfRotors * 20;
	}
	
	public int getNoOfRotors() {
		return noOfRotors;
	}

	public void setNoOfRotors(int noOfRotors) {
		this.noOfRotors = noOfRotors;
	}
	
	@Override
	public String toString() {
		return "I am a helicopter!";
	}

	@Override
	public void travel() {
		System.out.println("Chuff-chuff-chuff-chuff-chuff");
		
	}
	
	
}
