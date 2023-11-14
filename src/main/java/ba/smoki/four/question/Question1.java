package ba.smoki.four.question;

import java.util.Scanner;

/**
 * Napraviti program koji će na izlazu prikazati da li je vrijednost promjenljive
 * koju je korisnik unio parna.
 * Takođe treba da bude prikazana unešena vrijednost.
 */
public class Question1 {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        int broj = new Scanner(System.in).nextInt();
        System.out.println("Entered value is = " + broj);
        int ostatak = broj % 2;
        if(ostatak==0){
            System.out.println("Unesena vrijednost je parna");
        }
        if(ostatak==1){
            System.out.println("Unesena vrijednost je neparna");
        }
    }
}
