import solutions.Introduction;
public class Main {
    public static void main(String[] args) {
        Introduction intro = new Introduction();
        intro.printInSequence(intro.numbersBetween(1, 10)); // 1-a
        intro.printInSequence(intro.evenNumbersBetween(4, 20)); // 1-b
    }
}