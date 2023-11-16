package ba.smoki.five.flow;

import java.util.Scanner;

/**
 * Zadatak:
 * Unesite broj zadnjeg dana u sedmici kojeg ste naučili na Njemačkom.
 * Program treba da ispiše sve dane poslije tog dana:
 * <p>
 * Primjer:
 * Korisnik unese 3 - srijeda
 * Program ispisuje: "Donnerstag, Freitag, Samstag, Sonntag"
 * </p>
 * <p>
 * Primjer:
 * Korisnik unese 1 - ponedeljak
 * Program ispisuje: "Dienstag, Mittowoch, Donnerstag, Freitag, Samstag, Sonntag"
 * </p>
 */
public class SwitchDemo5 {
    public static void main(String[] args) {
        System.out.println("Unesi zadnji dan u sedmici kojeg si naučio:");
        int weekDayNumber = new Scanner(System.in).nextInt();

        String weekDayNames = "";
        switch (weekDayNumber) {
            case 1:
                weekDayNames = weekDayNames + "Montag";
            case 2:
                weekDayNames = weekDayNames + ", Dienstag";
            case 3:
                weekDayNames = weekDayNames + ", Mittwoch";
            case 4:
                weekDayNames = weekDayNames + ", Donnerstag";
            case 5:
                weekDayNames = weekDayNames + ", Freitag";
            case 6:
                weekDayNames = weekDayNames + ", Samstag";
            case 7:
                weekDayNames = weekDayNames + ", Sonntag";
            default:

        }
        System.out.println("Dane koje još ne znam: " + weekDayNames);
    }
}
