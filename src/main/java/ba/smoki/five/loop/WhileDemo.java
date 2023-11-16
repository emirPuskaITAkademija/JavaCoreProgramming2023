package ba.smoki.five.loop;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        /**
         * PETLJA: blok koda koji se izvršava dok je zadovoljen uslov petlje
         */
        int i = new Scanner(System.in).nextInt();
        while (i<=10){
            System.out.println("Broj: " + i);
            i++;
        }
    }
}
