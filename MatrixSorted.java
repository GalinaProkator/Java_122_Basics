import java.util.Random;

public class MatrixSorted {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 5 }, 
						   { 6, 7, 8, 9, 10 }, 
						   { 11, 13, 13, 14, 15 }, 
						   { 16, 17, 18, 19, 20 },
						   { 19, 22, 23, 24, 25 } };

		System.out.println(isMatrixSorted(matrix));		
		
	}

	public static boolean isMatrixSorted(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix.length - 1; column++) {
				if (matrix[row][column] > matrix[row][column + 1]) {
					return false;
				}
			}
		}
		
		for (int i = 0; i < matrix.length - 1; i++) {
			if (matrix [i][matrix.length - 1] > matrix [i+1][0]) {
				return false;
			}
		}
		return true;
	}

}
