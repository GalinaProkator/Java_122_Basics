import javax.swing.JOptionPane;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		String strUserNum = JOptionPane.showInputDialog("Please enter a number");
		int userNum = Integer.parseInt(strUserNum);

		boolean presentInArray = isPresentInArray(array, userNum);

		if (presentInArray) {
			System.out.println("The number is present in the array");
		} else {
			System.out.println("The number is not in the array");
		}

	}

	private static boolean isPresentInArray(int[] array, int userNum) {
		int start = 0;
		int last = array.length - 1;

		while (start <= last) {
			int middle = (start + last) / 2;

			if (userNum == array[middle]) {
				return true;
			} else if (userNum > array[middle]) {
				start = middle + 1;
			} else {
				last = middle - 1;
			}
		}
		return false;
	}

}
