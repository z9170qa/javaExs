package person;

import java.util.ArrayList;
import java.util.List;

public class OutputPerson {
	
	public static String search = "Jerry";
	

	public static void main(String[] args) {
		Person person1 = new Person ("Zak", 22, "IT Consultant");
		Person person2 = new Person ("Dave", 27, "Chicken Tamer");
		Person person3 = new Person ("Jerry", 36, "Professional Bumblebee");
		

		List <Person> people = new ArrayList<>();
		people.add(person1);
		people.add(person2);
		people.add(person3);
		
		for (Person p : people ) {
			System.out.println("Database - Name:" + p.getName() + " Age:" + p.getAge() + " Job Title:" + p.getJobTitle());
		}
		for (Person j : people) {
		if (search == j.getName()) {
		System.out.println("Search - Name:" + j.getName() + " Age:" + j.getAge() + " Job Title:" + j.getJobTitle());
		}	
	}
	}
}

