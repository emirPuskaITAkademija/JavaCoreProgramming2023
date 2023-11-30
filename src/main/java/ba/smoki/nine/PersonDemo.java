package ba.smoki.nine;

import ba.smoki.nine.human.Person;

import java.time.LocalDate;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ismet");
        person.setSurname("Omerović");
        LocalDate birthday = LocalDate.of(1988, 8, 3);
        person.setBirthday(birthday);
        System.out.println("Ova person se zove " + person.getName()+" i ima " + person.getAge());
    }
}
