import javax.swing.JOptionPane;

public class SameDigitsOnTheSamePlace {

	public static void main(String[] args) {
		String strNum1 = JOptionPane.showInputDialog("Please enter first number");
		int num1 = Integer.parseInt(strNum1);

		String strNum2 = JOptionPane.showInputDialog("Please enter second number");
		int num2 = Integer.parseInt(strNum2);

		System.out.println(amountOfSameDigitsOnTheSamePlace(num1, num2));

	}

	private static int amountOfSameDigitsOnTheSamePlace(int num1, int num2) {
		int counter = 0;

		while (num1 > 0) {
			int lastDigit1 = num1 % 10;
			num1 = num1 / 10;

			int lastDigit2 = num2 % 10;
			num2 = num2 / 10;

			if (lastDigit1 == lastDigit2) {
				counter++;
			}
		}
		return counter;
	}

}
