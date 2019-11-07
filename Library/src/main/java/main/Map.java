package main;

public class Map extends Item {
	
	private String region;
	
	public Map() {
		super();
	}
	
	public Map(String type, String name, int iD, boolean available, String region) {
		super(type, name, iD, available);
		this.region = region;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	@Override
	public String toString() {
		return "Item [Type: " + type + ", Title: " + title + ", Region: " + region + ", ID: " + iD + ", Available?: " + available + "]";
	}
	
}
