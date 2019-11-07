package paintWizard;

public class Paint {
	private String name;
	private double price;
	private int volume;
	private int coverage;
	private int maxCoverage;

	public Paint() {
		super();
	}

	public Paint(String name, double price, int volume, int coverage, int maxCoverage) {
		super();
		this.name = name;
		this.price = price;
		this.volume = volume;
		this.coverage = coverage;
		this.maxCoverage = maxCoverage;

	}
	public int calcWaste(int roomSize) {
		while (roomSize > maxCoverage) {
			roomSize -= maxCoverage;
		}
		return maxCoverage - roomSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getMaxCoverage() {
		return maxCoverage;
	}

	public void setMaxCoverage(int maxCoverage) {
		this.maxCoverage = maxCoverage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCoverage() {
		return coverage;
	}

	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}
	
	public double calcPrice(int roomSize) {
		int tins = 1;
		while (roomSize > maxCoverage) {
			roomSize -= maxCoverage;
			tins++;
		}
		return tins * this.price;
	}
	
	@Override 
	public String toString() {
		return "Paint [Name:" + name + ", Price:" + price + ", Coverage:" + coverage + "]";
	}
	
	
}
