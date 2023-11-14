package ba.smoki.three.operator;

import java.util.Scanner;

/**
 * && -> USLOVNI AND
 * || -> ILI uslovni OR
 */
public class ConditionalDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvi broj: ");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj: ");
        int number2 = new Scanner(System.in).nextInt();
        if ((number1 == 1) && (++number2 == 23)) {
            System.out.println("Broj 1 je 1 a uneseni broj 2 je sigurno 23");
        }
        System.out.println("Uvećan za jedan number2 : " + number2);
        if ((number1 == 23) || (number2++ == 23)) {
            System.out.println("Jedan od dvojice je Michael Jordan");
        }
        System.out.println("Uvećan za jedan number2 : " + number2);
    }
}
