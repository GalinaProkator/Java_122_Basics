import java.util.Random;

import javax.swing.JOptionPane;

public class GameHitOrMiss {

	public static void main(String[] args) {
		int difficultyLevel = getValidDifficultyLevel();
		int maxAmountOfGuesses = getAmountOfGuessesByDifficultyLevel(difficultyLevel);
		int computerNumber = generateValidComputerNumber();

		int currentRound = 1;
		boolean isUserWon = false;

		// 1st condition : I didn't run out of guesses
		// 2nd condition : I didn't win
		while (currentRound <= maxAmountOfGuesses && !isUserWon) {
			int userGuess = getValidUserGuess();
			int amountOfHits = calcAmountOfHits(computerNumber, userGuess);

			if (amountOfHits == 4) {
				isUserWon = true;
			} else {
				int amountOfNearHits = calcAmountOfNearHits(computerNumber, userGuess);
				System.out.println("Round:" + currentRound + " Your guess: " + userGuess + " Hits:" + amountOfHits
						+ " Near hits:" + amountOfNearHits);
				currentRound++;
			}
		}

		if (isUserWon) {
			JOptionPane.showMessageDialog(null, "Yay ! you won !!");
		} else {
			JOptionPane.showMessageDialog(null, "It's ok, good luck next time...the num was =" + computerNumber);
		}
	}

	private static int calcAmountOfNearHits(int computerNumber, int userGuess) {
		int[] arrayNum1 = new int[10];
		for (int i = 0; i < arrayNum1.length; i++) {
			arrayNum1[i] = 0;
		}

		int[] arrayNum2 = new int[10];
		for (int a = 0; a < arrayNum2.length; a++) {
			arrayNum2[a] = 0;
		}

		int counter = 0;

		while (computerNumber > 0) {
			int lastDigit1 = computerNumber % 10;
			computerNumber = computerNumber / 10;

			int lastDigit2 = userGuess % 10;
			userGuess = userGuess / 10;

			if (lastDigit1 != lastDigit2) {
				arrayNum1[lastDigit1]++;
				arrayNum2[lastDigit2]++;
			}
		}

		for (int b = 0; b < 10; b++) {
			if (arrayNum1[b] > 0 && arrayNum2[b] > 0) {
				counter++;
			}
		}
		return counter;
	}

	private static int calcAmountOfHits(int computerNumber, int userGuess) {
		int counter = 0;

		while (computerNumber > 0) {
			int lastDigit1 = computerNumber % 10;
			computerNumber = computerNumber / 10;

			int lastDigit2 = userGuess % 10;
			userGuess = userGuess / 10;

			if (lastDigit1 == lastDigit2) {
				counter++;
			}
		}
		return counter;
	}

	private static int getValidUserGuess() {
		String strUserNum = JOptionPane.showInputDialog("Please enter a four-different-digits number");
		int userGuess = Integer.parseInt(strUserNum);

		while (!isDigitsUnique(userGuess) && userGuess>1022) {
			strUserNum = JOptionPane.showInputDialog(
					"The number you've entered isn't valid. Please enter a four-different-digits number");
			userGuess = Integer.parseInt(strUserNum);

		}
		return userGuess;
	}

	private static int generateValidComputerNumber() {
		Random rnd = new Random();
		int computerNum = rnd.nextInt(8854) + 1023;

		while (!isDigitsUnique(computerNum)) {
			computerNum = rnd.nextInt(8854) + 1023;
		}
		return computerNum;
	}

	private static boolean isDigitsUnique(int computerNum) {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = 0;
		}

		while (computerNum > 0) {
			int lastDigit1 = computerNum % 10;
			array[lastDigit1]++;
			computerNum = computerNum / 10;
		}

		int a = 0;
		while (a < array.length && array[a] < 2) {
			a++;
		}

		if (a != array.length) {
			return false;
		}
		return true;
	}

	private static int getAmountOfGuessesByDifficultyLevel(int difficultyLevel) {
		if (difficultyLevel == 1) {
			return 12;
		}
		if (difficultyLevel == 2) {
			return 9;
		}
		return 7;
	}

	private static int getValidDifficultyLevel() {
		String strDifficultyLevel = JOptionPane.showInputDialog("Please choose difficulty level : \n"
				+ "1.Easy - 12 guesses\n" + "2.Medium - 9 guesses\n" + "3.Hard - 7 guesses");
		int difficultyLevel = Integer.parseInt(strDifficultyLevel);

		while (difficultyLevel < 1 || difficultyLevel > 3) {
			strDifficultyLevel = JOptionPane
					.showInputDialog("Invalid number, should be 1-3\n" + "Please choose difficulty level : \n"
							+ "1.Easy - 12 guesses\n" + "2.Medium - 9 guesses\n" + "3.Hard - 7 guesses");
			difficultyLevel = Integer.parseInt(strDifficultyLevel);
		}

		return difficultyLevel;
	}
}
