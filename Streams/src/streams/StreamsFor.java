package streams;

import java.util.Arrays;
import java.util.List;

public class StreamsFor {
	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	
	
	ForLoop calc = new ForLoop();
	System.out.println("Max:" + calc.max(nums));
	System.out.println("Min:" + calc.min(nums));
	System.out.println("odds:" + calc.evenRemoval(nums));
	System.out.println("evens:" + calc.oddRemoval(nums));
	System.out.println("sum:" + calc.sum(nums));
	System.out.println("squares:" + calc.square(nums));
	System.out.println("squareodd:" + calc.squareOdds(nums));
	}
	

	
	
	
	

}
