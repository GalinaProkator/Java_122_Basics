import javax.swing.JOptionPane;

public class DigitsOnTheSamePlace {

	public static void main(String[] args) {
		String strNum1 = JOptionPane.showInputDialog("Please enter first number");
		int num1 = Integer.parseInt(strNum1);

		String strNum2 = JOptionPane.showInputDialog("Please enter second number");
		int num2 = Integer.parseInt(strNum2);

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
		System.out.println(counter);

	}

}
