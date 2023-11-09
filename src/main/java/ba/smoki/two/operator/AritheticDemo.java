package ba.smoki.two.operator;

import java.util.Scanner;

public class AritheticDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvi broj:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj:");
        int number2 = new Scanner(System.in).nextInt();
        int result = number1 + number2;
        System.out.println("Suma = " + result);
        result = number1 - number2;
        System.out.println("Razlika = " + result);
        result = number1 * number2;
        System.out.println("Produkt = " + result);
        result = number1/number2;
        System.out.println("Količnik = " + result);
        result = number1 % number2; // 24 /12 = 2 ostatak 0
        System.out.println("Modulo = " +result);

    }
}
