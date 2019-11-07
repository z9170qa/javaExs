package main;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialTest {
	
	private Factorial fact = new Factorial();
	
	@Test
	public void outPutIsOneTest1() {
		assertEquals("Did not return 1", 1, fact.reverseFactorial(120));
	}
	
	@Test
	public void outPutisOneTest2() {
		assertEquals("Would never return 1", 1, fact.reverseFactorial(3628800));
	}
	
	@Test
	public void outPutisOneTest3() {
		assertEquals("Would never return 1", 1, fact.reverseFactorial(479001600));
	}
	
	@Test
	public void outPutisOneTest4() {
		assertEquals("Would never return 1", 1, fact.reverseFactorial(6));
	}
	
	@Test
	public void outPutisWrong() {
		assertEquals("Would never return 1", 0, fact.reverseFactorial(18));
	}


}
