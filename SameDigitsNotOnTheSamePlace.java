import javax.swing.JOptionPane;

public class SameDigitsNotOnTheSamePlace {

	public static void main(String[] args) {
		String strNum1 = JOptionPane.showInputDialog("Please enter first number");
		int num1 = Integer.parseInt(strNum1);

		String strNum2 = JOptionPane.showInputDialog("Please enter second number");
		int num2 = Integer.parseInt(strNum2);

		System.out.println(amountOfSameDigitsNotOnTheSamePlace(num1, num2));

	}

	private static int amountOfSameDigitsNotOnTheSamePlace(int num1, int num2) {
		int[] arrayNum1 = new int[10];
		for (int i = 0; i < arrayNum1.length; i++) {
			arrayNum1[i] = 0;
		}

		int[] arrayNum2 = new int[10];
		for (int a = 0; a < arrayNum2.length; a++) {
			arrayNum2[a] = 0;
		}

		int counter = 0;

		while (num1 > 0) {
			int lastDigit1 = num1 % 10;
			num1 = num1 / 10;

			int lastDigit2 = num2 % 10;
			num2 = num2 / 10;

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
}
