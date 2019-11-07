package main;

public class Doggo {

	public int competitionPlace(int a) {
		if (a <= 100) {
			for (int i = 1; i <= 100; i++) {
				if (i == a) {
				} else if (i == 1) {
					System.out.print(i + "st, ");
				} else if (i % 10 == 0) {
					System.out.println(i + "th, ");
				} else if (i % 10 == 1 && i != 11) {
					System.out.print(i + "st, ");
					if (i == 11)
						System.out.print(i + "th, ");
				} else if (i == 2) {
					System.out.print(i + "nd, ");
				} else if (i % 10 == 2 && i != 12) {
					System.out.print(i + "nd, ");
					if (i == 12)
						System.out.print(i + "th, ");
				} else if (i == 3) {
					System.out.print(i + "rd, ");
				} else if (i % 10 == 3 && i != 13) {
					System.out.print(i + "rd, ");
					if (i == 13)
						System.out.print(i + "th, ");
				} else if (i < 100) {
					System.out.print(i + "th, ");
				} else {
					System.out.print(i + "th");
					return a;
				}
			}
		}
		return 0;
	}
}
