package ba.smoki.eight.oop;

/**
 * Ograničenje  nizova:
 * <li>1. svi moraju biti istog tipa unutar istog niza</li>
 * <li>2. niz je fiksne dužine</li>
 */
public class Main {
    public static void main(String[] args) {

        int number = 23;
        number = 34;
        System.out.println(number);
        //Objektnom ili složenom
        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 34;
        numbers[2] = 21;
        System.out.println(numbers[0]+"  a da je " + numbers[1]);
        Movie movie1 = new Movie();
        movie1.setDirector("Quentin Tarantino");
        movie1.setTitle("Good Fellas");
        movie1.setDuration(146);
        movie1.setRating(90);
        System.out.println(movie1.getTitle() +" je ocijenjen ocjenom " + movie1.getRating());
        Movie movie2 = new Movie();
        movie2.setTitle("Štrik");
        movie2.setDirector("Pjer Žalica");
        movie2.setTitle("Štrik");
        movie2.setDuration(123);
        movie2.setRating(-10);
        System.out.println(movie2.getTitle() +" je ocijenjen ocjenom " + movie2.getRating());

    }
}
