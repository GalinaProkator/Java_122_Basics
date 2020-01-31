
public class MatrixSymmetricSecondaryDiagonal {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 5 }, 
				{ 2, 5, 6, 7, 8 }, 
				{ 3, 6, 8, 9, 10 }, 
				{ 4, 7, 9, 10,11 },
				{ 5, 8, 10,11,12 } };

	System.out.println(isMatrixSymmetricSacondaryDiagonal(matrix));
}

	public static boolean isMatrixSymmetricSacondaryDiagonal(int[][] matrix) {
		if (matrix.length != matrix[0].length) {
			return false;
		}
		else {
			for (int outerIndex = 0; outerIndex < matrix.length -1; outerIndex++) {
				for (int internalIndex = outerIndex+1; 
						internalIndex < matrix.length; internalIndex++) {
					if(matrix[outerIndex][internalIndex] != matrix[internalIndex][outerIndex]) {
						return false;
					}
				}
			}
		}
		return true;
	}
}