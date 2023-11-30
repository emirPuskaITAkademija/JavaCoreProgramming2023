package ba.smoki.nine;

import ba.smoki.nine.human.Movie;
import ba.smoki.nine.human.Person;

import java.time.LocalDate;

/**
 * <li>1. poređenje niza i klase</li>
 */
public class Demo {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Kanita";
        names[1] = "Nejra";
        names[2] = "Mile";
        Person person = new Person();
        person.setName("Ismet");
        person.setSurname("Omerović");
        LocalDate birthday = LocalDate.of(1988, 8, 3);
        person.setBirthday(birthday);
        System.out.println("Ova person se zove " + person.getName()+" i ima " + person.getAge());
        Movie movie = new Movie();
        movie.setDirector("Quentin Tarantino");
        movie.setTitle("Good Felas");
        movie.setDuration(120);
        movie.setRate(23);

        //Parsiranje teksta, parsiranje String, Person
        String tekst = "Neki tekst";
        Person person1 = new Person();
    }

    public static void run(){
        System.out.println("Ja trčim....");
        run();
    }
}
