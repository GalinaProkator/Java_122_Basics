
public class ArrayMergeSameLength {

	public static void main(String[] args) {
		int[] array1 = { 1, 3, 5, 7, 10 };
		int[] array2 = { -1, 2, 4, 7, 11 };
		
		int length = array1.length;
		int[] arrayNew = new int[length*2];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < length || j < length) {
			int nextArrayElement;
			
			if (i == length) {
				nextArrayElement = array2[j];
				j++;
			}
			else if (j == length) {
				nextArrayElement = array1[i];
				i++;
			}

			else if (array1[i] < array2[j]) {
				nextArrayElement = array1[i];
				i++;
			} 
			else {
				nextArrayElement = array2[j];
				j++;
			}
			arrayNew[k] = nextArrayElement;
			k++;
		}
		
		for (int l = 0; l < arrayNew.length; l++) {
			System.out.print(arrayNew[l] + " ");
		}


	}

}
