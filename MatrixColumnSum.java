import javax.swing.JOptionPane;

public class MatrixColumnSum {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 13, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 19, 22, 23, 24, 25 } };

		String strUserNum = JOptionPane.showInputDialog("Please enter a number");
		int userNum = Integer.parseInt(strUserNum);

		System.out.println(isUserNumIsColumnSum(matrix, userNum));

	}

	public static boolean isUserNumIsColumnSum(int[][] matrix, int userNum) {
		for (int column = 0; column < matrix.length; column++) {
			int sum = matrix[0][column];
			for (int row = 1; row < matrix.length; row++) {
				sum = sum + matrix[row][column];
			}
			if (sum == userNum) {
				return true;
			}
		}
		return false;
	}

}

