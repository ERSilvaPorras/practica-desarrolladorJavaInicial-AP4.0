package solutions;

import java.util.List;
import java.util.ArrayList;

public class Introduction {

    /**
     * Returns a list of integers within an interval, including endpoints.
     * @param start integer indicating the start of the interval.
     * @param end integer indicating the end of the interval.
     * @return returns a list of integers within an interval defined by start and end.
     */
    public List<Integer> numbersBetween(int start, int end) { // punto 1-a
        int i = start;
        List<Integer> numbers = new ArrayList<Integer>();
        while (i <= end) {
            numbers.add(i);
            i++;
        }
        return numbers;
    }

    /**
     * Returns a list of even integers within a range, including endpoints.
     * @param start integer indicating the start of the interval.
     * @param end integer indicating the end of the interval.
     * @return returns a list of even integers within an interval defined by start and end.
     */
    public List<Integer> evenNumbersBetween(int start, int end) { // punto 1.b
        List<Integer> numbers = numbersBetween(start, end);
        List<Integer> pairs = new ArrayList<Integer>();
        int index = 0;
        int length = numbers.size() - 1;
        while (index <= length) {
            if (numbers.get(index) % 2 == 0)
                pairs.add(numbers.get(index));
            index++;
        }
        return pairs;
    }

    /**
     * Returns a list of odd integers within a range, including endpoints.
     * @param start integer indicating the start of the interval.
     * @param end integer indicating the end of the interval.
     * @return returns a list of odd integers within an interval defined by start and end.
     */
    public List<Integer> oddNumbersBetween(int start, int end) {
        List<Integer> numbers = numbersBetween(start, end);
        List<Integer> pairs = evenNumbersBetween(start, end);
        numbers.removeAll(pairs);
        return numbers;
    }

    /**
     * Returns a list of odd or even integers within a defined range, additionally requires specifying the parity to use.
     * @param start integer indicating the start of the interval.
     * @param end integer indicating the end of the interval.
     * @param parity boolean value indicating the parity to use, being true for even and false for odd.
     * @return Returns a list of odd or even integers within an interval defined by start and end with a parity given by parity
     */
    public List<Integer> filterRangeNumbersBy(int start, int end, String parity) { // punto 1.c
        List<Integer> filteredList = new ArrayList<Integer>();
        if(parity == "even") {
            filteredList = evenNumbersBetween(start, end);
        } else {
            filteredList = oddNumbersBetween(start, end);
        }
        return filteredList;
    }

    /**
     * Returns a list of even integers in reverse order within a range, including endpoints.
     * @param start integer indicating the start of the interval.
     * @param end integer indicating the end of the interval.
     * @return Returns a list of even integers in reverse order within a range defined by start and end.
     */
    public List<Integer> evenReverseOrderBetween(int start, int end) { // punto 1.d
        List<Integer> numbers = numbersBetween(start, end);
        List<Integer> even = new ArrayList<Integer>();
        int length = numbers.size() - 1;
        for (int i=length; 0 <= i; i--)
            if(numbers.get(i) % 2 == 0) { even.add(numbers.get(i)); }
        return even;
    }
    // Funcion Auxiliar  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    /**
     * Prints a sequence of integers in string format given a list of numbers.
     * @param numbers list of integers to be formatted
     */
    public void printInSequence(List<Integer> numbers) { // reutilizable
        int length = numbers.size() - 1;
        int index = 0;
        String result = "";
        while (index <= length) {
            result += String.valueOf(numbers.get(index));
            if (index != length) {result += ", ";}
            index++;
        }
        System.out.println(result);
    }
}
