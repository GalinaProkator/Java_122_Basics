import javax.swing.JOptionPane;

public class PalindromeArray {
	private static final int LENGHT_OF_ARRAY = 8;

	public static void main(String[] args) {
		int[] array = new int[LENGHT_OF_ARRAY];
		for (int i = 0; i < array.length; i++) {
			String strNum = JOptionPane.showInputDialog("Please enter the number");
			array[i] = Integer.parseInt(strNum);
			System.out.print(array[i] + " ");	
		}
		boolean palindrome = true;
		int i = 0;
		int middle = (array.length - 1) / 2;
		int end = array.length - 1;

		while (palindrome == true && i <= middle) {
			if (array[i] == array[end]) {
				palindrome = true;
				i++;
				end--;
			}
			else {
				palindrome = false;
			}
		}
		if (palindrome == true) {
			System.out.println("The array is a palindrome");
		}
		else {
			System.out.println("The array is not a palindrome");
		}

	}

}
