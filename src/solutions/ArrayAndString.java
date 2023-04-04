package solutions;

public class ArrayAndString {
    
    /**
    * Returns the number of times a given character appears within a given string.
    * @param string string of characters indicating the text to be parsed.
    * @param letter character to search for in string.
    * @return returns the number of occurrences of the character within the character string.
    */
    public int numberOccurrencesletterInString (String string, char letter) { // 1.a
        int numberOccurrences = 0;
        for(int i=0; i < string.length(); i++) {
            if(string.charAt(i) == letter) {numberOccurrences++;}
        }
        return numberOccurrences;
    }

    /**
    * Returns a string containing three integers ordered in ascending order.
    * @param a integer indicating the first value to sort.
    * @param b integer indicating the second value to sort.
    * @param c integer indicating the third value to sort.
    * @param descending boolean specifying whether to sort ascending if true or descending if false.
    * @return returns a string containing the three given integers sorted in the specified order.
    */
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

    /**
     * Returns a boolean value indicating whether the first entered value is less than the second.
     * @param a integer indicating the first value to compare.
     * @param b integer indicating the second value to compare.
     * @return Returns a boolean value resulting from querying if a is less than b.
    */
    public boolean isLessThan (int a, int b) {
        return a < b;
    }

    /**
     * Returns an integer, the result of adding the integers of a given list that are greater than a reference integer used to perform the comparison.
     * @param numbers array of integers containing the values ​​to evaluate.
     * @param referenceNumber integer that indicates the value to take as reference when comparing.
     * @return Returns an integer that is the result of adding the integers of the array given that they are greater than the integer given as reference.
     */
    public int totalOfAddingTheGreaterOf(int[] numbers, int referenceNumber) { // 1.c
        int totalSum = 0;
        for(int i=0; i < numbers.length; i++) {
            if(numbers[i] > referenceNumber) {totalSum += numbers[i];}
        }
        return totalSum;
    }

    /**
     * Returns a string resulting from encrypting a given string using the cesar cipher specifying an offset.
     * @param text text string to encrypt.
     * @param displacement integer specifying the offset to use in the encryption
     * @return Returns a string resulting from encrypting a text string using cesar cipher with a given offset.
     */
    public String encode(String text, int displacement) { // 2
        String alphabet = "abcdefghijklmnñopqrstuvwxyz ";
        char replacementChar;
        String encryptText = "";
        for(int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i); // ñ
            int indexInAlphabet = alphabet.indexOf(currentChar); // -1
            if(indexInAlphabet == -1 ) {}
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

    /**
     * Returns a string resulting from decrypting the cesar cipher with a given offset.
     * @param text ciphertext in cipher cease to decrypt
     * @param displacement integer indicating the offset used in the encryption
     * @return Returns a text string resulting from decrypting a given encrypted string, additionally indicating the offset used in the cesar encryption.
     */
    public String decode(String text, int displacement) { // 2
        String alphabet = "abcdefghijklmnñopqrstuvwxyz ";
        char replacementChar;
        String encryptText = "";
        for(int i = 0; i < text.length(); i++) {
            int indexInAlphabet = alphabet.indexOf(text.charAt(i)); // 14
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
