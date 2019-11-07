package main;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BlackjackTest {
	
	private BlackJack jack = new BlackJack();
	
	@Test
	public void testHighestWins() {
		assertEquals("Highest number did not win", 21, jack.play(16, 21));
		
	}
	
	@Test
	public void testOneBust() {
		assertEquals("Player has bust but still won", 21, jack.play(22, 21));
	}
	
	@Test
	public void testPlayerTwoBust() {
		assertEquals("Player has bust but still won", 21, jack.play(21, 22));
	}
	
	@Test
	public void testBothBust() {
		assertEquals("Both players have bust but 0 was not returned", 0, jack.play(30, 22));
	}
}
