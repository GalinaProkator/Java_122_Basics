
public class QueenCountingOutGame {

	public static void main(String[] args) {
		final int AMOUNT_OF_MEN = 100;
		final int STEP = 7;

		boolean [] pretenders = new boolean[AMOUNT_OF_MEN];

		for (int i=0; i<AMOUNT_OF_MEN; i++) {
			pretenders[i]=true;
		}

		int currentCell = -1;
		int amountMenLeft = AMOUNT_OF_MEN;

		while (amountMenLeft > 0) {
			int stepCount = 0;
			while (stepCount < STEP) {
				currentCell++;
				if (currentCell == AMOUNT_OF_MEN) {
					currentCell = 0;
				}
				if (pretenders[currentCell]) {
					stepCount++;
				}
			}
			pretenders[currentCell]=false;
			amountMenLeft--;
		}
		System.out.println(currentCell);
	}
}
