package main;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class LibraryTest {
	
	private Library l = new Library();
	@Test
    public void testAddItem() {
        assertEquals("Item was not added correctly", "Item [Type: Book, Title: Chicken Run, Author: Jesus, ID: 12133, Available?: true]" , l.addItem(new Book("Book", "Chicken Run", 12133, true, "Jesus")));
    }
    @Test
    public void testCheckOutItem() {
        assertEquals("Checking out did not work correctly",  l.checkOutItem(12133));
    }
    @Test
    public void testCheckInItem() {
        assertEquals("Checking in did not work correctly", "boop", l.checkInItem(12133));
    }
    @Test
    public void testUpdateItem() {
        assertEquals("Item was updated incorrectly", "boop", l.updateItem());
    }
    @Test
    public void testInterfaceSystem() {
        assertEquals("Interface did not correctly catch Exception", "boop", l.checkOutItem());
    }
    @Test
    public void testRemoveItemByID() {
        assertEquals("Item was not removed correctly", "boop", l.removeItemByID());
    }
    @Test
    public void testRegisterPerson() {
        assertEquals("Person was registered incorrectly", "boop", l.registerPerson());
    }
    @Test
    public void testUpdatePerson() {
        assertEquals("Person was updated incorrectly", "boop", l.updatePerson());
    }
    @Test
    public void testDeletePersonByID() {
        assertEquals("Person was deleted incorrectly", "boop", l.deletePersonByID());
    }
    
    
}
