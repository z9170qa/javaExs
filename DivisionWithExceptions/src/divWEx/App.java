package divWEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Divide newSum = new Divide();

		try {
			System.out.println("Enter first number: ");
			int num1 = scan.nextInt();
			System.out.println("Enter second number to divide by: ");
			int num2 = scan.nextInt();
			System.out.println(newSum.divide(num1, num2));
		} catch (InputMismatchException ime) {
			System.out.println(ime.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}scan.close();

	}

}
