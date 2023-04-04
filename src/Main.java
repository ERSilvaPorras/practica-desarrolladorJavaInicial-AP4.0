import solutions.*;
// import solutions.IntroduccionPOO.Carrito;
// import solutions.IntroduccionPOO.Descuento;
// import solutions.IntroduccionPOO.DescuentoXMontoTotal;
// import solutions.IntroduccionPOO.DescuentoXTarjetaVIP;
// import solutions.IntroduccionPOO.ItemCarrito;
// import solutions.IntroduccionPOO.Product;

// import java.util.ArrayList;
// import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "UTF-8");

        // introduction to algorithms and java
        // Introduction intro = new Introduction();
        // intro.printInSequence(intro.numbersBetween(1, 10)); // 1-a
        // intro.printInSequence(intro.evenNumbersBetween(4, 20)); // 1-b
        // intro.printInSequence(intro.filterRangeNumbersBy(5, 11, "odd")); // 1-c
        // intro.printInSequence(intro.evenReverseOrderBetween(8, 22)); // 1-d

        // System.out.println(intro.homeBelongsHighIncomeSegment(300000, 2, 2, false));
        // System.out.println(intro.homeBelongsHighIncomeSegment(500000, 2, 2, false));
        // System.out.println(intro.homeBelongsHighIncomeSegment(300000, 3, 2, false));
        // System.out.println(intro.homeBelongsHighIncomeSegment(300000, 2 , 3 , false));
        // System.out.println(intro.homeBelongsHighIncomeSegment(300000, 2, 2, true));
        // System.out.println(intro.homeBelongsHighIncomeSegment(700000, 5, 7, true));

        // // Array and String
        ArrayAndString collection = new ArrayAndString();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("CONTADOR DE OCURRENCIAS DE UNA LETRA EN UN TEXTO");
        System.out.print("Ingrese el texto: ");
        String text = input.nextLine();
        System.out.print("Ingrese la letra: ");
        char letter = input.next().charAt(0);
        System.out.println("Ocurrencias encontradas: " + collection.numberOccurrencesletterInString(text, letter));
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("SUMA TOTAL DE TODOS LOS NUMEROS DE UN ARREGLOS MAS GRANDES QUE UN NUMERO REFERENCIA");
        System.out.print("Ingrese el tamaño del arreglo de numeros: ");
        int lengthArray = input.nextInt();
        int[] arr = new int[lengthArray];
        for(int i=0; i < lengthArray; i++) {
            System.out.print("Valor de la posicion " + i + ": ");
            arr[i] = input.nextInt();
        }
        System.out.print("Ingrese el numero de referencia: ");
        int referenceNumber = input.nextInt();
        input.nextLine();
        System.out.println("Total Obtenido: " + collection.totalOfAddingTheGreaterOf(arr, referenceNumber));
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("ORDENAR 3 NUMEROS ASCENDENTEMENTE O DESCENDENTEMENTE");
        System.out.print("Ingrese el 1er numero: ");
        int firstNumber = input.nextInt();
        System.out.print("Ingrese el 2do numero: ");
        int secondNumber = input.nextInt();
        System.out.print("Ingrese el 3er numero: ");
        int thirdNumber = input.nextInt();
        input.nextLine();
        System.out.print("Tipo de orden, siendo true(descendente) y false(ascendente): ");
        boolean descending = input.nextBoolean();
        System.out.println("Numeros ordenados: " + collection.orderNumbers(firstNumber, secondNumber, thirdNumber, descending));
        System.out.println("----------------------------------------------------------------------------------");
        



        System.out.println("CIFRADO CESAR - ENCRIPTACION");
        System.out.print("Ingrese el texto a cifrar (en minusculas): ");
        String textToEncrypt = input.nextLine();
        System.out.print("Ingrese el desplazamiento a usar: ");
        int displacement = input.nextInt();
        input.nextLine();
        System.out.println("Texto Encriptado: " + collection.encode(textToEncrypt, displacement));
        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("CIFRADO CESAR - DESENCRIPTACION");
        System.out.print("Ingrese el texto a descifrar (en minusculas): ");
        String textToDecrypt = input.nextLine();
        System.out.print("Ingrese el desplazamiento usado: ");
        displacement = input.nextInt();
        System.out.println("Texto Desencriptado: " + collection.decode(textToDecrypt, displacement));
        input.close();
        
    }
}