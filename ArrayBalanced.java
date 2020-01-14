
public class ArrayBalanced {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,3,7,9};

		int arraySum = 0;

		int sum1 = 0;

		for (int i=0; i < array.length; i++) {
			arraySum = arraySum + array[i];
		}
		if (arraySum % 2 != 0) {
			System.out.println("The array is not balanced");
		}
		else {
			int halfSum = arraySum / 2;
			int a = 0;

			while (a < array.length && sum1 < halfSum) {
				sum1 = sum1 + array[a];
				a++;
			}
			if (sum1 == halfSum) {
				System.out.println("The array is balanced");
			}
			else {
				System.out.println("The array is balanced");
			}
		}
	}
}
