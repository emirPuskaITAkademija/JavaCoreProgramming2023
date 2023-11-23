package ba.smoki.seven.oop;

public class FilmDemo {
    public static void main(String[] args) {
        Film film1 = new Film();
        film1.naslov = "Prohujalo s vihorom";
        film1.režiser = "Kevin Spacey";
        film1.trajanje = 238;
       // film1.recenzija = 10;

        Film film2 = new Film();
        film2.naslov = "Notebook";
        film2.režiser = "";
        film2.trajanje = 123;
       // film2.recenzija = 9;

        Film film3 = new Film();
        film3.naslov = "Return of the king";
        film3.trajanje = 90;
        film3.režiser = "Peter Jackson";
        //film3.recenzija = 100;
    }
}
