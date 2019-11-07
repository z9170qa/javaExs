package its;

import java.util.Random;
import java.util.Scanner;

public class ITS {

	public void array() {
		int[][] grid = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } };
		int a = grid[0][4];
		int b = grid[1][4];
		System.out.println("You find yourself in the midst of an unfamiliar jungle with no understanding "
				+ "of how you got here, only that this is your current situation. ");
		System.out.println("Dangling from your neck appears to be a "
				+ "compass engraved with arcane runes that appears to be pointing in an obscure direction. GO EXPLORE!");
		System.out.println(
				"This game takes place on a 10 x 10 board that will display your coordinates every step of the way.");
		System.out.println("Current starting position: " + "(" + a + ", " + b + ")");
		System.out
				.println("==========================================================================================");

	}

	public void move() {
		int[][] jungleGrid = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } };
		int x = jungleGrid[0][4];
		int y = jungleGrid[1][4];
		System.out.println("Current position: " + "(" + x + ", " + y + ")");
		Scanner scan = new Scanner(System.in);
		Random randint = new Random();

		int ruinx = 0;
		int ruiny = 0;
		int templex = 0;
		int templey = 0;
		int badgersx = 0;
		int badgersy = 0;
		int treasurex = 0;
		int treasurey = 0;

		while (ruinx == templex | ruinx == badgersx | ruinx == treasurex | templex == badgersx | templex == treasurex
				| badgersx == treasurex | ruiny == templey | ruiny == badgersy | ruiny == treasurey
				| templey == badgersy | templey == treasurey | badgersy == treasurey) {

			ruinx = (randint.nextInt(10) + 1);
			ruiny = (randint.nextInt(10) + 1);
			templex = (randint.nextInt(10) + 1);
			templey = (randint.nextInt(10) + 1);
			badgersx = (randint.nextInt(10) + 1);
			badgersy = (randint.nextInt(10) + 1);
			treasurex = (randint.nextInt(10 + 1));
			treasurey = (randint.nextInt(10 + 1));
		}

		// System.out.println("ruin: " + ruinx + "," + ruiny);
		// System.out.println("temple: " + templex + "," + templey); JUST ADDED TO BE
		// ABLE TO TEST RANDOM POSITIONS
		// System.out.println("badgers: " + badgersx + "," + badgersy);
		// System.out.println("treasure: " + treasurex + "," + treasurey);

		boolean onMap = true;
		while (onMap) {
			if ((x > 10 | y > 10)) {
				System.out.println(
						"You have left the jungle into the void. Here, you are at the mercy of the Voidlings!");
				System.out.println("Try again, but DO NOT LEAVE THE JUNGLE!!!");
				onMap = false;
				break;
			}
			boolean treasureNotFound = true;
			while (treasureNotFound) {
				System.out.println("Choose your direction (use N, E, S, W): ");
				String direction = scan.nextLine();

				if (direction.equals("N")) {
					y = y + 1;
					System.out.println("You moved North 1 mile!");
					System.out.println("Current position: " + "(" + x + ", " + y + ")");
					System.out.println(
							"==========================================================================================");
				}

				else if (direction.equals("E")) {
					x = x + 1;
					System.out.println("You moved East 1 mile!");
					System.out.println("Current position: " + "(" + x + ", " + y + ")");
					System.out.println(
							"==========================================================================================");
				}

				else if (direction.equals("S")) {
					y = y - 1;
					System.out.println("You moved South 1 mile!");
					System.out.println("Current position: " + "(" + x + ", " + y + ")");
					System.out.println(
							"==========================================================================================");
				}

				else if (direction.equals("W")) {
					x = x - 1;
					System.out.println("You moved West 1 mile!");
					System.out.println("Current position: " + "(" + x + ", " + y + ")");
					System.out.println(
							"==========================================================================================");
				}

				if ((x - ruinx < x - templex) && (x - ruinx < x - badgersx) && (x - ruinx < x - treasurex)
						&& (y - ruiny < y - templey) && (y - ruiny < x - badgersy) && (y - ruiny < y - treasurey)) {

					if (x == ruinx && y == ruiny) {
						System.out.println(
								"You have stumbled upon some sort of ruin. You find some old broken ornaments and get really dusty. Go you!");
						System.out.println(
								"==========================================================================================");
					} else {
						if (x == ruinx && y != ruiny) {
							if (y < ruiny) {
								System.out.println("Compass points North, maybe there is something closeby");
							} else if (y > ruiny) {
								System.out.println("Compass points South, maybe there is something closeby");
							}
						} else if (y == ruiny && x != ruinx) {
							if (x < ruinx) {
								System.out.println("Compass points East, maybe there is something closeby");
							} else if (x > ruinx) {
								System.out.println("Compass points West, maybe there is something closeby");
							}
						}

						if (((x - ruinx) <= (y - ruiny)) && (x < ruinx)) {
							System.out.println("Compass points East, maybe there is something closeby");
						} else if (((x - ruinx) <= (y - ruiny)) && (x > ruinx)) {
							System.out.println("Compass points West, maybe there is something closeby");
						} else if (((y - ruiny) <= (x - ruinx)) && (y < ruiny)) {
							System.out.println("Compass points North, maybe there is something closeby");
						} else if (((y - ruiny) <= (x - ruinx)) && (y > ruiny)) {
							System.out.println("Compass points South, maybe there is something closeby");
						}

					}
				}

				if ((x - templex < x - ruinx) && (x - templex < x - badgersx) && (x - templex < x - treasurex)
						&& (y - templey < y - ruiny) && (y - templey < x - badgersy) && (y - templey < y - treasurey)) {
					if (x == templex && y == templey) {
						System.out.println(
								"You have stumbled upon a temple. The arcane symbols scrawled across the temple walls match those engraved in the compass. "
										+ "Inside you find carvings of bipedal badgers being attacked by creatures of void. "
										+ "Only a partial message can be deciphered: BEWA|E |HE |OI|LINGS!");
						System.out.println(
								"==========================================================================================");
					} else {
						if (x == templex && y != templey) {
							if (y < templey) {
								System.out.println("Compass points North, maybe there is something closeby");
							} else if (y > templey) {
								System.out.println("Compass points South, maybe there is something closeby");
							}
						} else if (y == templey && x != templex) {
							if (x < templex) {
								System.out.println("Compass points East, maybe there is something closeby");
							} else if (x > templex) {
								System.out.println("Compass points West, maybe there is something closeby");
							}
						}

						if (((x - templex) <= (y - templey)) && (x < templex)) {
							System.out.println("Compass points East, maybe there is something closeby");
						} else if (((x - templex) <= (y - templey)) && (x > templex)) {
							System.out.println("Compass points West, maybe there is something closeby");
						} else if (((y - templey) <= (x - templex)) && (y < templey)) {
							System.out.println("Compass points North, maybe there is something closeby");
						} else if (((y - templey) <= (x - templex)) && (y > templey)) {
							System.out.println("Compass points South, maybe there is something closeby");
						}
					}
				}

				if ((x - badgersx < x - templex) && (x - badgersx < x - ruinx) && (x - badgersx < x - treasurex)
						&& (y - badgersy < y - templey) && (y - badgersy < x - ruiny)
						&& (y - badgersy < y - treasurey)) {
					if (x == badgersx && y == badgersy) {
						System.out.println(
								"You have stumbled upon a sentient badger tribe. You show them the compass and they gesticulate wildly in excitement.");
						System.out.println(
								"==========================================================================================");
					} else {
						if (x == badgersx && y != badgersy) {
							if (y < badgersy) {
								System.out.println("Compass points North, maybe there is something closeby");
							} else if (y > badgersy) {
								System.out.println("Compass points South, maybe there is something closeby");
							}
						} else if (y == badgersy && x != badgersx) {
							if (x < badgersx) {
								System.out.println("Compass points East, maybe there is something closeby");
							} else if (x > badgersx) {
								System.out.println("Compass points West, maybe there is something closeby");
							}
						}

						if (((x - badgersx) <= (y - badgersy)) && (x < badgersx)) {
							System.out.println("Compass points East, maybe there is something closeby");
						} else if (((x - badgersx) <= (y - badgersx)) && (x > badgersx)) {
							System.out.println("Compass points West, maybe there is something closeby");
						} else if (((y - badgersy) <= (x - badgersx)) && (y < badgersy)) {
							System.out.println("Compass points North, maybe there is something closeby");
						} else if (((y - badgersy) <= (x - badgersx)) && (y > badgersy)) {
							System.out.println("Compass points South, maybe there is something closeby");
						}
					}
				}

				if ((x - treasurex < x - templex) && (x - treasurex < x - badgersx) && (x - treasurex < x - ruinx)
						&& (y - treasurey < y - templey) && (y - treasurey < x - badgersy)
						&& (y - treasurey < y - ruiny)) {
					if (x == treasurex && y == treasurey) {
						System.out.println("Congrats, you have found the treasure!");
						System.out.println(
								"==========================================================================================");
						treasureNotFound = false;
					} else {
						if (x == treasurex && y != treasurey) {
							if (y < treasurey) {
								System.out.println("Compass points North, maybe there is something closeby");
							} else if (y > treasurey) {
								System.out.println("Compass points South, maybe there is something closeby");
							}
						} else if (y == treasurey && x != treasurex) {
							if (x < treasurex) {
								System.out.println("Compass points East, maybe there is something closeby");
							} else if (x > treasurex) {
								System.out.println("Compass points West, maybe there is something closeby");
							}
						}

						if (((x - treasurex) <= (y - treasurey)) && (x < treasurex)) {
							System.out.println("Compass points East, maybe there is something closeby");
						} else if (((x - treasurex) <= (y - treasurey)) && (x > treasurex)) {
							System.out.println("Compass points West, maybe there is something closeby");
						} else if (((y - treasurey) <= (x - treasurex)) && (y < treasurey)) {
							System.out.println("Compass points North, maybe there is something closeby");
						} else if (((y - treasurey) <= (x - treasurex)) && (y > treasurey)) {
							System.out.println("Compass points South, maybe there is something closeby");
						}

					}
				}
			}
			scan.close();
		}
	}
}
