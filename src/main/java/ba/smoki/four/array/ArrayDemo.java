package ba.smoki.four.array;

public class ArrayDemo {
    public static void main(String[] args) {
        int broj = 23;
        System.out.println(broj);
        broj = 1;
        System.out.println(broj);
        broj = 10;
        System.out.println(broj);

        //Prvi složeni tip podataka je niz
        /*
        1. opcija..zauzmem memorije koliko mi treba
        Koliko polja u toj varijabli ja treba ili koliko brojeva ću skladištiti
        u nizu.

        brojevi -> u njoj mogu biti skladištena 3 broja int tipa
        23  1   10
        _   _   _
        0   1   2
         */
        int[] brojevi = new int[3];
        brojevi[0] = 23;
        brojevi[1] = 1;
        brojevi[2] = 10;
        brojevi[2] = 'f';
        System.out.println("Element na indeksu 0 = " + brojevi[0]);
        System.out.println("Element na indeksu 1 = " + brojevi[1]);
        System.out.println("Elemnt na indeksu 2 = " + brojevi[2]);
        //System.out.println("Element na indeksu 3 = " + brojevi[3]);


        /**
         * 2. način
         *
         */
        int[] numbers = {23, 1, 10};
    }
}
