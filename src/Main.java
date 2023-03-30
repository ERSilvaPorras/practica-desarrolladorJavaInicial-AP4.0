import solutions.*;
import solutions.IntroduccionPOO.Carrito;
import solutions.IntroduccionPOO.Descuento;
import solutions.IntroduccionPOO.DescuentoXMontoTotal;
import solutions.IntroduccionPOO.DescuentoXTarjetaVIP;
import solutions.IntroduccionPOO.ItemCarrito;
import solutions.IntroduccionPOO.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // introduction to algorithms and java
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

        // Array and String
        ArrayAndString collection = new ArrayAndString();
        System.out.println(collection.numberOccurrencesletterInString("propiedades de java", 'a'));
        System.out.println(collection.totalOfAddingTheGreaterOf(new int[] {1, 4, 5, 6}, 3));
        System.out.println(collection.orderNumbers(21, 56, 20, false));
        System.out.println(collection.encode("hola zeuz como estas", 2));
        System.out.println(collection.decode("jqncbagwabeqñqbguvcu", 2));

    }
}