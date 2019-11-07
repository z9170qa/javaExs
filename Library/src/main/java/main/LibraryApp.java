package main;

public class LibraryApp {

	public static void main(String[] args) {

		Library l = new Library();
		l.addItem(new Book("Book", "The Martian", 12234, true, "Some Guy"));
		l.addItem(new Dissertation("Dissertation", "Meeps", 12334, true, "UCLan"));
		l.printItems();
		System.out.println("=========================");
		l.checkOutItem(12334);
		l.printItems();
		System.out.println("=========================");
		l.checkInItem(12334);
		l.printItems();
		Database db = new ProxyDatabase();
		try{
			db.processRequest(1234567);
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
