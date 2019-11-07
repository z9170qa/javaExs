package main;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DoggoTest {
	
	private Doggo dog = new Doggo();

	
	@Test
	public void incorrectPlace() {
		assertEquals("Dog is placed incorrectly", 0, dog.competitionPlace(100));
	}
	
	@Test
	public void moreThanOneHundredPlaces() {
		assertEquals("Not 99 entries", 0, dog.competitionPlace(102));
	}
	
}
