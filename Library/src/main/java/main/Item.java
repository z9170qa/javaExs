package main;

public abstract class Item {
	
	public String type;
	public String title;
	public int iD;
	public boolean available;
	
	
	public Item() {	
	}
	
	public Item(String type, String title, int iD, boolean available) {
		super();
		this.type = type;
		this.title = title;
		this.iD = iD;
		this.available = available;
		
	}
	
	public boolean getAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}
	
	@Override
	public String toString() {
		return "Item [Type: " + type + ", Title: " + title + ", ID: " + iD + ", Available?: " + available + "]";
	}

	
}
