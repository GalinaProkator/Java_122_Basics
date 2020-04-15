
public class ArrayBalanced {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 3, 7, 8 };

		boolean isArrayBalanced = isBalanced(array);
		System.out.println(isArrayBalanced);
	}

	private static boolean isBalanced(int[] array) {
		int arraySum = 0;
		int sum1 = 0;
		
		for (int i = 0; i < array.length; i++) {
			arraySum += array[i];
		}
		if (arraySum % 2 != 0) {
			return false;
		} 
		else {
			int halfSum = arraySum / 2;
			int a = 0;

			while (a < array.length && sum1 < halfSum) {
				sum1 += array[a];
				a++;
			}
			if (sum1 == halfSum) {
				return true;
			} else {
				return false;
			}
		}
	}
}
