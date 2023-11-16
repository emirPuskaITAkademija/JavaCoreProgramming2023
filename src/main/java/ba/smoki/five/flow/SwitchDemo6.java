package ba.smoki.five.flow;

import java.util.Scanner;

/**
 * switch - spojeni case
 * <p>
 * jedan blok koda -> jednom case
 * </p>
 * <p>
 * jedank bloka -> case 1 case 3 case 5
 * drugi blok koda -> case 12 case 2
 * </p>
 * <p>
 * ZADATAK:
 * Korisnik treba da unese broj mjesec monthNumber i broj godine yearNumber.
 * Program treba uzme parametre koje je korisnik unio:
 * <li>1. monthNumber</li>
 * <li>2. yearNumber</li>
 * <p>
 * numberOfDaysInMonth = ?
 * 30, 31, 28
 * <p>
 * 30, 31,
 * Februar -> 28, 29
 * </p>
 */
public class SwitchDemo6 {
    public static void main(String[] args) {
        System.out.println("Unesite redni broj mjeseca");
        int monthNumber = new Scanner(System.in).nextInt();
        System.out.println("Unesi redni broj godine");
        int yearNumber = new Scanner(System.in).nextInt();
        int numberOfDaysInMonth = 0;
        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDaysInMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDaysInMonth = 30;
                break;
            case 2:
                if ((yearNumber % 4 == 0 && yearNumber % 100 != 0) || yearNumber % 400 == 0) {
                    numberOfDaysInMonth = 29;
                } else {
                    numberOfDaysInMonth = 28;
                }
                break;

        }
        System.out.println("Broj dana u mjesecu " + monthNumber + " i godini " + yearNumber + " jednak " + numberOfDaysInMonth);
    }
}
