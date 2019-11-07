package garage;

public class Motorbike extends Vehicle {
	
	private int noOfHandlebars;
	
	public Motorbike() {
		super();
	}
	
	public Motorbike(int noOfWheels, int noOfDoors, int noOfColours, int noOfHandlebars) {
		super(noOfWheels, noOfDoors, noOfColours);
		this.noOfHandlebars = noOfHandlebars;
	}
	
	public void wheelie() {
		System.out.println("You absolute madman!");
	}

	@Override
	public float calcBill() {
		return noOfHandlebars * 10;
	}
	
	public int getNoOfHandlebars() {
		return noOfHandlebars;
	}

	public void setNoOfHandlebars(int noOfHandlebars) {
		this.noOfHandlebars = noOfHandlebars;
	}
		
	@Override
	public String toString() {
		return "I am a bike";
	}

	@Override
	public void travel() {
		System.out.println("Dodging through traffic like a boss!");
		
	}
	
	
}
