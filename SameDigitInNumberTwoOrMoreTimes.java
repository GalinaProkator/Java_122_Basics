import javax.swing.JOptionPane;

public class SameDigitInNumberTwoOrMoreTimes {

	public static void main(String[] args) {
		String strUserNum = JOptionPane.showInputDialog("Please enter a number");
		int userNum = Integer.parseInt(strUserNum);

		if (isSameDigitTwoOrMoreTimes(userNum)) {
			System.out.println("YES");
		} 
		else {
			System.out.println("NO");
		}

	}

	private static boolean isSameDigitTwoOrMoreTimes(int userNum) {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = 0;
		}

		while (userNum > 0) {
			int lastDigit1 = userNum % 10;
			array[lastDigit1]++;
			userNum = userNum / 10;
		}

		int a = 0;
		while (a < array.length && array[a] < 2) {
			a++;
		}

		if (a != array.length) {
			return true;
		}
		return false;
	}

}
