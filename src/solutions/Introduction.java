package solutions;

import java.util.List;
import java.util.ArrayList;

public class Introduction {
    public List<Integer> numbersBetween(int start, int end) { // punto 1-a
        int i = start;
        List<Integer> numbers = new ArrayList<Integer>();
        while (i <= end) {
            numbers.add(i);
            i++;
        }
        return numbers;
    }

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

    // Funcion Auxiliar  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
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
