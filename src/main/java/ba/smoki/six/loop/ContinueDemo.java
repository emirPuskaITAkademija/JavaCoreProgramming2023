package ba.smoki.six.loop;

import java.util.Scanner;

/**
 * Zadatak:
 * <p>
 * Izbrojati koliko se u nekoj rečenici javlja neko slovo.
 * Korisnik može unijeti rečenicu.
 * Zbog pojednostavljenog pristupa reći ćemo da slovo 'p'
 * pretražujemo u korisničkoj rečenici.
 * </p>
 */
public class ContinueDemo {
    public static void main(String[] args) {
        //String -> niz karaktera
        System.out.println("Unesi rečenicu");
        String rečenica = new Scanner(System.in).nextLine();
        char slovo = 'p';
        //String <-> char[]
        char[] nizSlovaRečenice = rečenica.toCharArray();
        int brojPonavljanja = 0;
        for (int i = 0; i < nizSlovaRečenice.length; i++) {
            char slovoRecenice = nizSlovaRečenice[i];
            if (slovo != slovoRecenice) {
                continue;
            }
            brojPonavljanja++;
        }
        System.out.println("Broj ponavljanja slova 'p' u rečenici: - " + rečenica+" -  je jednak " + brojPonavljanja);
    }
}
