package main;

public class Dissertation extends Item {

	private String uni;
	
	public Dissertation() {
		super();
	}
	
	public Dissertation(String type, String title, int iD, boolean available, String uni) {
		super(type, title, iD, available);
		this.uni = uni;
	}

	public String getUni() {
		return uni;
	}

	public void setUni(String uni) {
		this.uni = uni;
	}
	
	@Override
	public String toString() {
		return "Item [Type: " + type + ", Title: " + title + ", University: " + uni + ", ID: " + iD + ", Available?: " + available + "]";
	}
	
}
