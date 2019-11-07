package calc;

public class Calculator {

	public int add(int a, int b) {
	return a + b;
	}
	public int multiply(int a, int b) {
	return a * b;
	}
	public int subtract(int a, int b) {
	return a - b;
	}
	public double divide(double a, double b) {
		if (a > b) {
			return a/b;
		} else {
			System.out.println("This division cannot be performed");
			 return 0;
		}	
	}

}
	