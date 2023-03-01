import solutions.Introduction;
public class Main {
    public static void main(String[] args) {
        Introduction intro = new Introduction();
        intro.printInSequence(intro.numbersBetween(1, 10)); // 1-a
        intro.printInSequence(intro.evenNumbersBetween(4, 20)); // 1-b
        intro.printInSequence(intro.filterRangeNumbersBy(5, 11, "odd")); // 1-c
        intro.printInSequence(intro.evenReverseOrderBetween(8, 22)); // 1-d

        System.out.println(intro.homeBelongsHighIncomeSegment(300000, 2, 2, false));
        System.out.println(intro.homeBelongsHighIncomeSegment(500000, 2, 2, false));
        System.out.println(intro.homeBelongsHighIncomeSegment(300000, 3, 2, false));
        System.out.println(intro.homeBelongsHighIncomeSegment(300000, 2 , 3 , false));
        System.out.println(intro.homeBelongsHighIncomeSegment(300000, 2, 2, true));
        System.out.println(intro.homeBelongsHighIncomeSegment(700000, 5, 7, true));
    }
}