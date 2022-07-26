package packOne;

import java.util.Random;
import java.util.Scanner;

public class SolveNaNa {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (myGame(sc).equalsIgnoreCase("Y"));
		sc.close();
	}

	public static String myGame(Scanner sc) {
		int num = generateNumber();

		String sing = "try";
		String plur = "tries";

		System.out.println("Guess The Number I'm Thinking Of ...");

		for (int i = 0; i < 5; i++) {
			String temp = sc.nextLine();
			int guess = Integer.parseInt(temp);

			if (guess > num)
				System.out.println("Your answer is too  big!!");

			if (guess < num)
				System.out.println("Your answer is too small!!");

			if (guess == num) {
				System.out.println("Hurray!!!!! You are right.");

				String attempts = i == 0 ? sing : plur;
				System.out.println("You got the correct answer in " + (i + 1) + " " + attempts + ".");
				break;
			}

			if (i == 4)
				System.out.println("You have exhusted all your tries");
		}

		System.out.println("Would you like to play again? Y for Yes");

		String returnValue = sc.nextLine();

		return returnValue;
	}

	public static int generateNumber() {
		int x = 1 + new Random().nextInt(19);
		return x;
	}

}
