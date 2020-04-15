public class PhraseCheck {
    public static void main(String[] args) throws Exception {
        String string = "())";
        if (isPhraseCorrect(string)){
            System.out.println("The phrase is correct");
        }
    }

    private static boolean isPhraseCorrect(String string) throws Exception {
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '('){
                count++;
            }
            else{
                count--;
                if (count < 0){
                    int braceNumber = i+1;
                    throw new Exception("The phrase is incorrect. The brace # " + braceNumber + " is odd");
                }
            }
        }
        if (count > 0) {
            throw new Exception("The phrase is incorrect. There are " + count + " unclosed opening braces");
        }
        else {
            return true;
        }
    }
}
