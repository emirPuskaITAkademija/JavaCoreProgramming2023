package ba.smoki.seven.homework;

import javax.swing.*;
import java.util.Random;

/**
 * Ideja je da uradite upgrade na zadatak {@link ba.smoki.six.loop.BreakDemo3}.
 * Element niza numbers trebate generisati na način da se uvijek generišu random elementi niza.
 * Niz numbers treba da uvijek 11 generisanih brojeva.
 * Brojevi treba da budu u range od 0 do 1000;
 *
 * <p>
 * Ideja zadace je bila da imamo isti rezultat prikazan korisniku kada
 * on pogodi broj unutar niza.
 * example: "Pogodio si iz n-tog pokušaja.Uneseni broj 'xy' je tvoj sretni broj."
 * </p>
 */
public class Zadaca {
    public static void main(String[] args) {

        int[] numbers = new int[11];
        Random generatorBroja = new Random();
        for (int i = 0; i < 11; i++) {
            numbers[i] = generatorBroja.nextInt( 50);
            System.out.println(numbers[i]);
        }
        int redniBrojPokusaja = 0;
        int korisnickiBroj;
        LABELA:
        while (true) {
            String korisnickiUnos = JOptionPane.showInputDialog("Unesi broj i okušaj sreću");
            korisnickiBroj = Integer.parseInt(korisnickiUnos);
            redniBrojPokusaja++;
            for (int i = 0; i < numbers.length; i++) {
                int number = numbers[i];
                if (number == korisnickiBroj) {
                    break LABELA;
                }
            }
        }

    }
}
