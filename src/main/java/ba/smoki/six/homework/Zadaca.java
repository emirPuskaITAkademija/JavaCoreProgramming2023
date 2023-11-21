package ba.smoki.six.homework;

import java.util.Random;

public class Zadaca {
    public static void main(String[] args) {
        /**
         * Ideja je da uradite upgrade na zadatak {@link ba.smoki.six.loop.BreakDemo3}.
         * Element niza numbers trebate generisati na način da se uvijek generišu random elementi niza.
         * Niz numbers treba da uvijek 11 generisanih brojeva.
         * Brojevi treba da budu u range od 0 do 1000;
         */
        int[] numbers = {32, 87, 3, 589, 13, 23, 107876, 2000, 8, 6222, 12};
        //TRIK koji će vam pomoći da po slučajnom uzorku generišete brojeve od 0-1000
        Random random = new Random();
        int number = random.nextInt(0, 1001);
        System.out.println(number);

    }
}
