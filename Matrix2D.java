import java.util.Random;

public class Matrix2D {

	public static void main(String[] args) {
		int [][] matrix = new int [2][2];

		for (int row = 0; row < 2; row++) {
			for (int column = 0; column < 2; column++) {
				Random rnd = new Random();
				matrix[row][column] = rnd.nextInt(100);
			}
		}

		for (int row = 0; row < 2; row++) {
			for (int column = 0; column < 2; column++) {
				System.out.print(matrix[row][column]+" ");
			}
		}
	}
}
