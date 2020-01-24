import javax.swing.JOptionPane;

public class NumberInArrayHowManyTimes {

	public static void main(String[] args) {
		int[] array = { 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 9, 10, 11, 12, 12 };

		String strUserNum = JOptionPane.showInputDialog("Please enter a number");
		int userNum = Integer.parseInt(strUserNum);

		System.out.println(howManyTimes(array, userNum));

	}

	private static String howManyTimes(int[] array, int userNum) {
		String howManyTimes;
		if (leftBorder(array, userNum) < 0) {
			return howManyTimes = "The number is not present in the array";
		}
		int numberOfTimes = rightBorder(array, userNum) - leftBorder(array, userNum) + 1;
		howManyTimes = "The number is present in the array " + numberOfTimes + " times";

		return howManyTimes;
	}

	private static int rightBorder(int[] array, int userNum) {
		int rightBorder = leftBorder(array, userNum);
		if (array[array.length - 1]==userNum) {
			return rightBorder = array.length - 1;
		}
		else {
			int start = leftBorder(array, userNum);
			int last = array.length - 2;

			while (start <= last) {
				int middle = (start + last) / 2;

				if (array[middle]==userNum && array[middle+1]!=userNum) {
					return rightBorder = middle;
				} else if (userNum >= array[middle]) {
					start = middle + 1;
				} else {
					last = middle - 1;
				}
			}
		}
		return rightBorder;
	}


	private static int leftBorder(int[] array, int userNum) {
		int leftBorder;

		if (array[0]==userNum) {
			return leftBorder = 0;
		}
		int start = 1;
		int last = array.length - 1;

		while (start <= last) {
			int middle = (start + last) / 2;

			if (array[middle]==userNum && array[middle-1]!=userNum) {
				return leftBorder = middle;
			} else if (userNum > array[middle]) {
				start = middle + 1;
			} else {
				last = middle - 1;
			}
		}
		return leftBorder=-1;
	}
}