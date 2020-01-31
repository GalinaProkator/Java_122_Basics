
public class MatrixSymmetricMainDiagonal {

	public static void main(String[] args) {
		int[][] matrix = { { 1,  2,  3,  4, 5 }, 
						   { 6,  7,  8,  9, 4 }, 
						   { 11, 13, 13, 8, 3 }, 
						   { 16, 17, 13, 7, 2 },
						   { 19, 16, 11, 6, 1 } };

		System.out.println(isMatrixSymmetricMainDiagonal(matrix));
	}

	public static boolean isMatrixSymmetricMainDiagonal(int[][] matrix) {
		if (matrix.length != matrix[0].length) {
			return false;
		}

		else {
			for (int rowOuter = 0; rowOuter < matrix.length-1; rowOuter++) {
				int columnOuter = matrix.length -1-rowOuter;

				for (int columnInternal = 0; columnInternal < matrix.length - 1 - rowOuter; columnInternal++) {
					int rowInternal = matrix.length - 1 - columnInternal;
					if (matrix[rowOuter][columnInternal] != matrix[rowInternal][columnOuter]) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
