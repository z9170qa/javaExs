package main;

import java.util.Random;

import java.util.Scanner;

public class RockPaperScissors {

	public void playerWin() {

		Scanner sc = new Scanner(System.in);
		boolean playAgain = true;
		int totPlays = 0;
		int totLoss=0;
		int totWin=0;
		int totDraw=0;

		while (playAgain == true) {

			System.out.println("choose your fighter");
			String choice = sc.nextLine();

			System.out.println("you chose " + choice);

			String[] rpsArray = { "rock", "paper", "scissors" };
			Random aiChoice = new Random();
			int randomNumber = aiChoice.nextInt(rpsArray.length);
			String ai = (rpsArray[randomNumber]);
			System.out.println("computer chose " + ai);

			if ((choice.contains("rock") && ai.contains("scissors")) | (choice.contains("paper") && ai.contains("rock"))
					| (choice.contains("scissors") && ai.contains("paper"))) {
				System.out.println("Congrats, you have won");
				totWin++;
			} else if ((ai.contains("rock") && choice.contains("scissors"))
					| (ai.contains("paper") && choice.contains("rock"))
					| (ai.contains("scissors") && choice.contains("paper"))) {
				System.out.println("You Lose!");
				totLoss++;
			} else if((ai.contains("rock") && choice.contains("rock"))
					| (ai.contains("paper") && choice.contains("paper"))
					| (ai.contains("scissors") && choice.contains("scissors"))) {
				System.out.println("You Drew");
				totDraw++;
			}
			totPlays++;
			System.out.println("you've played " + totPlays);
			System.out.println("you've won " + totWin);
			System.out.println("you've lost " + totLoss);
			System.out.println("you've drawn " + totDraw);
			System.out.println("play again? ");
			String again=sc.nextLine();
			if(again.contains("no")) {
				playAgain=false;
			}
			
		}
		sc.close();
	}
}
