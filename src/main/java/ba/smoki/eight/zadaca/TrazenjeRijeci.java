package ba.smoki.eight.zadaca;

/**
 * <p>
 * Nadograditi zadatak {@link ba.smoki.seven.branching.ContinueWithLabelDemo}
 * na način da ne daje odgovor samo: "Da li se riječ nalazi u rečenici".
 * <p>
 * Odgovor koji trebate dobiti je: "Koliko puta se riječ nalazi u rečenici?"
 * </p>
 * </p>
 */
class TrazenjeRijeci {
    public static void main(String[] args) {
        String rečenica = "petar pan je pojeo panprike i zato je pan petar";
        String riječ = "pan";
        //Ovo je nova varijabla
        int brojRiječiURečenici = 0;
        boolean riječJesteDioRečenice = false;
        int međa = rečenica.length() - riječ.length();

        MARKER:
        //Ona iterira kroz slova rečenica
        for (int i = 0; i <= međa; i++) {
            //Unutarnja petlja prolazi kroz slova riječi
            for (int j = 0; j < riječ.length(); j++) {
                char slovRečenice = rečenica.charAt(i + j);
                char slovoRiječi = riječ.charAt(j);
                if (slovRečenice != slovoRiječi) {
                    continue MARKER;//
                }
            }

            /*
             * Dvije linije koda ispod će se izvršavati samo i samo ako
             * se nikad nije izvršila linija koda "continue KOLEGA;"
             */
            riječJesteDioRečenice = true;
            brojRiječiURečenici++;
        }

        String pronađena = "Niz znakova \"" + riječ + "\" je pronađen " + brojRiječiURečenici + " puta u rečenici \n"
                + "\"" + rečenica + "\"";
        String nijePronađena = "Riječ" + riječ + " ne postoji u rečenici.";
        String message = riječJesteDioRečenice
                ? pronađena
                : nijePronađena;

        System.out.println(message);
    }
}
