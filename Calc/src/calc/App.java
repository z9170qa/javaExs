package calc;

public class App {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("1 + 4 = " + calc.add(1, 4));
		System.out.println("1 * 4 = " + calc.multiply(1, 4));
		System.out.println("1 - 4 = " + calc.subtract(1, 4));
		System.out.println("1 / 4 = " + calc.divide(1, 4));

	}

}
