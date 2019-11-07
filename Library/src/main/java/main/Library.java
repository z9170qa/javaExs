package main;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Item> items = new ArrayList<Item>();
	private List<Person> people = new ArrayList<Person>();

	public Library() {
		super();
	}

	public boolean addItem(Item item) {
		return this.items.add(item);
	}

	public void removeItemsByID(int itemID) {
		List<Item> toRemoveItem = new ArrayList<Item>();
		for (Item i : items) {
			if (i.getiD() == itemID) {
				toRemoveItem.add(i);
			}
		}
		items.removeAll(toRemoveItem);
	}

	public void checkOutItem(int itemID) {
		for (Item i : items) {
			if (i.getiD() == itemID & i.available == false) {
				System.out.println(
						"Item ID: " + itemID + " has already been checked out and so cannot be checked out again.");
			}
			if (i.getiD() == itemID & i.available == true) {
				System.out.println("Item ID: " + itemID + " has been successfully checked out.");
				i.setAvailable(false);
			}

		}
	}

	public void checkInItem(int itemID) {
		for (Item i : items) {
			if (i.getiD() == itemID & i.available == true) {
				System.out
						.println("Item ID: " + itemID + "is already in the item inventory and so cannot be checked in");
			}
			if (i.getiD() == itemID & i.available == false) {
				System.out.println("Item ID: " + itemID + " has been checked in.");
				i.setAvailable(true);
			}
		}
	}

	public boolean registerPerson(Person person) {
		return this.people.add(person);
	}

	public void removePeopleByID(int personID) {
		List<Person> toRemovePerson = new ArrayList<Person>();
		for (Person p : people) {
			if (p.getPersonID() == personID) {
				toRemovePerson.add(p);
			}
		}
		people.removeAll(toRemovePerson);
	}

	public void printPeople() {
		for (Person p : people) {
			System.out.println(p);
		}
	}

	public void printItems() {
		for (Item i : items) {
			System.out.println(i);
		}
	}

}
