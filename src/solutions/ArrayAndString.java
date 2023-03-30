package solutions;

public class ArrayAndString {
    public int numberOccurrencesletterInString (String string, char letter) { // 1.a
        int numberOccurrences = 0;
        for(int i=0; i < string.length(); i++) {
            if(string.charAt(i) == letter) {numberOccurrences++;}
        }
        return numberOccurrences;
    }

    public String orderNumbers(int a, int b, int c, boolean descending) { // 1.b
        int min, medium, max;
        String result = "";
        if (isLessThan(a, b) && isLessThan(a, c)) { 
            min = a;
            if(isLessThan(b, c)){
                medium = b;
                max = c;
            }
            else {
                medium = c;
                max = b;
            }
        }
        else if (isLessThan(b, a) && isLessThan(b, c)) { 
            min = b;
            if(isLessThan(a, c)) {
                medium = a;
                max = c;
            } 
            else {
                medium = c;
                max = a;
            }
        }
        else { 
            min = c;
            if(isLessThan(a, b)){
                medium = a;
                max = b;
            }
            else {
                medium = b;
                max = a;
            }
        }
        if(descending) {
            result = max + ", " + medium + ", " + min;
        } else {
            result = min + ", " + medium + ", " + max;
        }
        return result;
    }

    public boolean isLessThan (int a, int b) {
        return a < b;
    }

    public int totalOfAddingTheGreaterOf(int[] numbers, int referenceNumber) { // 1.c
        int totalSum = 0;
        for(int i=0; i < numbers.length; i++) {
            if(numbers[i] > referenceNumber) {totalSum += numbers[i];}
        }
        return totalSum;
    }

    public String encode(String text, int displacement) { // 2
        String alphabet = "abcdefghijklmnñopqrstuvwxyz ";
        char replacementChar;
        String encryptText = "";
        for(int i = 0; i < text.length(); i++) {
            int indexInAlphabet = alphabet.indexOf(text.charAt(i));
            int indexAlphabetWithDisplacement = indexInAlphabet + displacement;
            int indexAfterExceeding = indexAlphabetWithDisplacement - alphabet.length();
            if(indexAfterExceeding >= 0) { 
                replacementChar = alphabet.charAt(indexAfterExceeding);
            } else {
                replacementChar = alphabet.charAt(indexAlphabetWithDisplacement);
            }
            encryptText += replacementChar;
        }
        return encryptText;
    }

    public String decode(String text, int displacement) { // 2
        String alphabet = "abcdefghijklmnñopqrstuvwxyz ";
        char replacementChar;
        String encryptText = "";
        for(int i = 0; i < text.length(); i++) {
            int indexInAlphabet = alphabet.indexOf(text.charAt(i));
            int indexAlphabetWithDisplacement = indexInAlphabet - displacement;
            int indexAfterExceeding = indexAlphabetWithDisplacement + alphabet.length();
            if(indexAfterExceeding < alphabet.length()) {
                replacementChar = alphabet.charAt(indexAfterExceeding);
            } else {
                replacementChar = alphabet.charAt(indexAlphabetWithDisplacement);
            }
            encryptText += replacementChar;
        }
        return encryptText;
    }
}
