package main;

public class Book extends Item {

	private String author;

	public Book() {
		super();
	}

	public Book(String type, String title, int iD, boolean available, String author) {
		super(type, title, iD, available);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Item [Type: " + type + ", Title: " + title + ", Author: " + author + ", ID: " + iD + ", Available?: " + available + "]";
	}

}
