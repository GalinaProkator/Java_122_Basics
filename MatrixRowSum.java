import javax.swing.JOptionPane;

public class MatrixRowSum {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 5 }, 
				   { 6, 7, 8, 9, 10 }, 
				   { 11, 13, 13, 14, 15 }, 
				   { 16, 17, 18, 19, 20 },
				   { 19, 22, 23, 24, 25 } };
		
		String strUserNum = JOptionPane.showInputDialog("Please enter a number");
		int userNum = Integer.parseInt(strUserNum);
		
		System.out.println(isUserNumIsRowSum(matrix, userNum));
		


	}

	public static boolean isUserNumIsRowSum(int[][] matrix, int userNum) {
		for (int row = 0; row < matrix.length; row++) {
			int sum = matrix[row][0];
			for (int column = 1; column < matrix.length; column++) {
				sum = sum + matrix[row][column]; 
			}
			if (sum == userNum) {
				return true;
			}
		}
		return false;
	}

}
