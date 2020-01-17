
public class ArrayMergeHigherComplexity {

	public static void main(String[] args) {
		int[] array1 = { 1, 3, 5, 7, 12, 14 };
		int[] array2 = { -1, 2, 4, 6, 8 };

		int[] arrayNew = arrayMerge(array1, array2);

		// for (int i = 0; i < length; i++) {
		// System.out.print(arrayNew[i] + " ");
		// }

		bubbleSortOfArray(arrayNew);

		for (int i = 0; i < arrayNew.length; i++) {
			System.out.print(arrayNew[i] + " ");
		}

	}

	private static int[] arrayMerge(int[] array1, int[] array2) {
		int length = array1.length + array2.length;
		int[] arrayNew = new int[length];

		int position = 0;
		for (position = 0; position < array1.length; position++) {
			arrayNew[position] = array1[position];
		}

		for (int i = 0; i < array2.length; i++) {
			arrayNew[position] = array2[i];
			position++;
		}
		return arrayNew;
	}

	private static void bubbleSortOfArray(int[] arrayNew) {
		int length = arrayNew.length;
		for (int index = 0; index < length - 1; index++) {
			for (int i = 1; i < length - index; i++) {
				if (arrayNew[i - 1] > arrayNew[i]) {
					int temp = arrayNew[i];
					arrayNew[i] = arrayNew[i - 1];
					arrayNew[i - 1] = temp;
				}
			}

		}
	}

}
