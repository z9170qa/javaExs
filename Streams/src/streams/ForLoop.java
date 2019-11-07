package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForLoop {
	


	public int max(List<Integer> nums) {
		int max = Integer.MIN_VALUE;
		for (int i : nums) {
			max = Math.max(max, i);
		} 
		return max;
	} 
	
	public int min(List<Integer> nums) {
		int min = Integer.MAX_VALUE;
		for (int i : nums) {
			min = Math.min(min, i);
		} 
		return min;
	}
	
	public List<Integer> evenRemoval(List<Integer> nums) {
		List<Integer> odds = new ArrayList<>();
		for (int i : nums) {
			if (i % 2 != 0) {
				odds.add(i);
			}
		}
		return odds;
		
	}
	
	public List<Integer> oddRemoval(List<Integer> nums) {
		List<Integer> evens = new ArrayList<>();
		for (int i : nums) {
			if (i % 2 == 0) {
				evens.add(i);
			}
		}
		return evens;
		
	}
	
	public int sum(List<Integer> nums) {
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		return sum;
	}
	
	public List<Integer> square(List<Integer> nums) {
		List<Integer> squares = new ArrayList<>();
		for (int i : nums) {
			squares.add(i*i);
		}
		return squares;
	}
	
	public List<Integer> squareOdds(List<Integer> squares) {
		List<Integer> squareodd = new ArrayList<>();
		for (int i : squares) {
			if (i % 2 != 0) {
				squareodd.add(i*i);
			}
		}
		return squareodd;
	}
	
	
}
