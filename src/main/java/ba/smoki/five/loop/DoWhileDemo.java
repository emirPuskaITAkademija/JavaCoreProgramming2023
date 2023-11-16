package ba.smoki.five.loop;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        /**
         * PETLJA: blok koda koji se izvršava dok je zadovoljen uslov petlje
         */
        int i = new Scanner(System.in).nextInt();
        do{
            System.out.println("Broj = " + i);
            i++;
        }while (i<=10);
    }
}
