package main;

public class Factorial {
	
	
	public int reverseFactorial(int a) {
		for(int i = 2; a != 1; i++) {
			System.out.println("Current int is: " + a);
			a = a / i;
			if(a == 1) {
				System.out.println("Successfully found dividing factorial: " + i);
				return a;
			}
			
			if (a == 0) {
				System.out.println("NONE");
				return a;
				
			}
		}
		return 0;
	}
}
