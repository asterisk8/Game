

	import java.util.Scanner;

	/**
	 * Created by asterisk on 11/24/2014.
	 */
	public class Game {

		String computerChoice;
		String userChoice;

		void promptUserChoice() {
			Scanner in = new Scanner(System.in);

			System.out.println("Let's play rock, paper or scissors?");
			boolean choiceIsCorrect = false;
			while (!choiceIsCorrect) {
				System.out.println("What is your choice? : ");
				userChoice = in.nextLine();

				if (!(userChoice.equals("rock") || userChoice.equals("paper") || userChoice
						.equals("scissors"))) {
					System.err
							.println("Please choose one from rock, paper or scissors");
				} else {
					choiceIsCorrect = true;
				}
			}

			in.close();
		}

		void generateComputerChoice() {
			int x = (int) (Math.random() * 3);

			if (x == 0) {
				computerChoice = "rock";
			} else if (x == 1) {
				computerChoice = "paper";
			} else {
				computerChoice = "scissors";
			}
		}

		String compare() {
			String result = "";
			String choice1 = userChoice;
			String choice2 = computerChoice;

			if (choice1.equals(choice2)) {
				result = "The result is tie";
			} else if (choice1.equals("rock")) {
				if (choice2.equals("scissors")) {
					result = "You won!!";
				} else {
					result = "Computer won!!";
				}
			} else if (choice1.equals("paper")) {
				if (choice2.equals("rock")) {
					result = "You won!!";
				} else {
					result = "Computer won!!";
				}
			}
			return result;
		}

		void printGameResult() {
			String msg = compare();
			System.out.println(msg);
			System.out.println("Your choice was:\t" + userChoice);
			System.out.println("Computer choice was:\t" + computerChoice);

		};

	}
