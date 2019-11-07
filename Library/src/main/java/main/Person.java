package main;

public class Person {

	public String name;
	public int personID;
	
	public Person(String name, int personID) {
		this.name = name;
		this.personID = personID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPersonID() {
		return personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}
	
	@Override
	public String toString() {
		return "Person [Name: " + name + ", personID: " + personID + "]";
	}
	
	
}
