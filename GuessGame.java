import java.util.Random;

import javax.swing.JOptionPane;

public class GuessGame {
	private static final int AMOUNT_OF_TRIES = 5;

	public static void main(String[] args) {
		Random rnd = new Random();
		int compNum = rnd.nextInt(101);

		int counter = 0;
		boolean guess = false;

		while (guess == false && counter < AMOUNT_OF_TRIES) {
			String strUserNum = JOptionPane.showInputDialog("Please enter a number between 1 and 100");
			int userNum = Integer.parseInt(strUserNum) ;
			counter++;

			if (userNum == compNum) {
				guess = true;
			}
			else if (userNum > compNum) {
				JOptionPane.showMessageDialog(null, "The number you have entered is bigger than you need. Amount of tries left is " + (AMOUNT_OF_TRIES - counter));

			}
			else {
				JOptionPane.showMessageDialog(null, "The number you have entered is smaller than you need. Amount of tries left is " + (AMOUNT_OF_TRIES - counter));
			}
		}
		if (guess == true) {
			JOptionPane.showMessageDialog(null, "Good job! You guessed it right! The number is " + compNum + " It took you " + counter + " tries");
		}
		else {
			JOptionPane.showMessageDialog(null, "Too bad :( The number was " + compNum);
		}
	}

}
