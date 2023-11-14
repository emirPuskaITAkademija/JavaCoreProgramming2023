package ba.smoki.four.question;

import java.util.stream.Stream;

public class Question2 {
    public static void main(String[] args) {
        String[] niz1 = {"ime", "Pera", "Mika"};
        String[] niz2 = {"prezime", "Peric", "Mikic"};
        // Kako bi povezali ta 2 niza sa trećim nizom
        String[] niz3 = new String[3];
        niz3[0] = niz1[0]+  "   " + niz2[0];
        niz3[1] = niz1[1] + "   " +  niz2[1];
        niz3[2] = niz1[2] + "   " +niz2[2];
        Stream.of(niz3).forEach(System.out::println);

    }
}
