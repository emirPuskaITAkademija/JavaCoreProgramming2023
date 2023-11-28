package ba.smoki.eight.zadaca;

import static javax.swing.JOptionPane.*;

/**
 * <p>
 * Nadograditi zadatak {ContinueWithLabelDemo}
 * na način da ne daje odgovor samo: "Da li se riječ nalazi u rečenici".
 * <p>
 * Odgovor koji trebate dobiti je: "Koliko puta se riječ nalazi u rečenici?"
 * </p>
 * Nadograđeno rješenje zadatka pravi distinkciju između niza znakova "pan" i riječi "pan" u rečenicama.
 * </p>
 */
class TrazenjeRijeciNadogradnja {
    public static void main(String[] args) {
        String  rečenica      = "";
        boolean pogrešanUnos  = true;
        String  prvaRečenica  = "Petar Pan je panično jeo marcipan i zato je Pan Petar";
        String  drugaRečenica = "Petar Pan nije volio marcipan i zato je samo Petar";
        String  trećaRečenica = "Zaboravili smo ko je bio Petar i šta je jeo";

        // Prozor za izbor rečenice koja će se pretraživati
        while (pogrešanUnos) {
            String unos = showInputDialog(null,
                    "\n Unesite redni broj rečenice za pretraživanje \n" + " 1. " + prvaRečenica + "\n 2. " + drugaRečenica + "\n 3. " + trećaRečenica + "\n",
                    "PANTRAŽIVANJE",
                    3);

            if (unos.equals("1")) {
                rečenica     = prvaRečenica;
                pogrešanUnos = false;
            } else if (unos.equals("2")) {
                rečenica     = drugaRečenica;
                pogrešanUnos = false;
            } else if (unos.equals("3")) {
                rečenica     = trećaRečenica;
                pogrešanUnos = false;
            } else { // Ukoliko je unijet broj koji nije u izborniku ili neki drugi znak
                showMessageDialog(null,
                        "Unesite 1 za prvu, 2 za drugu ili 3 za treću rečenicu!",
                        "PANTRAŽIVANJE", // Naslov prozora
                        1); // Ikona prozora
            }
        }

        String  rečenicaFormatirana   = " " + rečenica.toLowerCase() + " ";
        String  znakovi               = "pan";
        String  riječ                 = " " + znakovi + " ";
        int     brojZnakovaURečenici  = 0;
        int     brojRiječiURečenici   = 0;
        boolean riječJesteDioRečenice = false;
        boolean znakJesteDioRečenice  = false;
        int     međaRiječ             = rečenicaFormatirana.length() - riječ.length();
        int     međaZnakovi           = rečenica.length() - znakovi.length();

        MARKERRIJEČ:
        //Provjera broja riječi u zadatoj rečenici
        for (int i = 0; i <= međaRiječ; i++) {
            for (int j = 0; j < riječ.length(); j++) {
                char slovoRečenice = rečenicaFormatirana.charAt(i + j); // Razlaganje rečenice na znakove
                char slovoRiječi   = riječ.charAt(j); // Razlaganje riječi na znakove

                if (slovoRečenice != slovoRiječi) { // Poređenje znaka iz riječi sa znakom u rečenici
                    continue MARKERRIJEČ;
                }
            }

            /* Dvije linije koda ispod će se izvršavati samo i samo ako
             * se nikad nije izvršila linija koda "continue MARKERRIJEČ;"*/
            riječJesteDioRečenice = true;
            brojRiječiURečenici++;

            // Izlaz prije kraja rečenice
            if (i == međaRiječ) {
                break;
            }
        }

        MARKERZNAK:
        // Provjera broja niza znakova u zadatoj rečenici
        for (int k = 0; k <= međaZnakovi; k++) {
            for (int l = 0; l < znakovi.length(); l++) {
                char slovoRečenice   = rečenicaFormatirana.charAt(k + l); // Razlaganje rečenice na znakove
                char znakNizaZnakova = znakovi.charAt(l); // Razlaganje niza na znakove

                if (slovoRečenice != znakNizaZnakova) { // Poređenje znaka iz niza sa znakom u rečenici
                    continue MARKERZNAK;
                }
            }

            /* Dvije linije koda ispod će se izvršavati samo i samo ako
             * se nikad nije izvršila linija koda "continue MARKERZNAK;"*/
            znakJesteDioRečenice = true;
            brojZnakovaURečenici++;

            // Izlaz prije kraja rečenice

            if (k == međaZnakovi) {
                break;
            }
        }
        String zvjezdica = "*";
        // Sadržaj prozora ukoliko je pronađena riječ ili niz znakova
        String pronađena = "U rečenici \"" + rečenica + "\":\n" + zvjezdica.repeat(80) + "\n" + "- riječ \"" + riječ + "\" " + "je pronađena " + brojRiječiURečenici
                + " puta" + "\n";
        String pronađen = "- niz znakova " + "\"" + znakovi + "\"" + " je pronađen " + brojZnakovaURečenici
                + " puta";

        // Sadržaj prozora ukoliko nije pronađena riječ ili niz znakova
        String nijePronađena = "U rečenici \"" + rečenica + "\":\n" + zvjezdica.repeat(80) + "\n" + "- ne postoji riječ " + riječ + "\n";
        String nijePronađen  = "- nije pronađen niz znakova " + "\"" + znakovi + "\"";

        // Provjera statusa pretraživanja koja sortira elemente poruke u prozoru
        String odgovorZnak = znakJesteDioRečenice ? pronađen : nijePronađen;
        String odgovor     = riječJesteDioRečenice ? pronađena : nijePronađena;

        // Prozor sa porukom
        showMessageDialog(null,
                odgovor + odgovorZnak + "\n" + zvjezdica.repeat(80) + "\n",
                "PANTRAŽIVANJE",
                1);
    }
}
