
public class QueenCountingVariantTwo {

	public static void main(String[] args) {
		final int AMOUNT_OF_MEN = 100;
		final int STEP = 7;

		int [] pretenders = new int [AMOUNT_OF_MEN];
		
		pretenders [AMOUNT_OF_MEN - 1] = 0;
		
		for (int i=0; i < AMOUNT_OF_MEN -1; i++) {
			pretenders[i]=i+1;
		}
		
		int previousMan = -1;
		int goToManNumber = 0;
		int pretendersCounter = AMOUNT_OF_MEN;
		
		while (pretendersCounter >1) {
			for(int i=0; i<STEP-1; i++) {
				previousMan = goToManNumber;
				goToManNumber = pretenders[goToManNumber];
			}
			pretenders[previousMan]=pretenders[goToManNumber];
			goToManNumber = pretenders[goToManNumber];
			pretendersCounter--;
		}
		System.out.println(goToManNumber);

	}

}
