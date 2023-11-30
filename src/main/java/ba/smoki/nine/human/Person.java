package ba.smoki.nine.human;

import ba.smoki.nine.animal.Animal;
import ba.smoki.nine.animal.Cat;
import ba.smoki.nine.animal.Dog;
import ba.smoki.nine.animal.Fish;

import java.time.LocalDate;
import java.time.Period;

/**
 * Relacija između Person i name, surname, birthday.
 * <p></p>
 * Svaki Person kreiran po klasi Person p1, p2, p2
 * mora imati name, surname, birthday..
 * <p></p>
 * indexNumber,
 * <p>
 * AKo odgovor nije DA MORA IMATI / HAS A relacija definira kompoziciju
 *
 * <p>
 * CLOSED for MODFICIATION ali je OPEN FOR EXTENSION.
 * </p>
 */
public class Person extends Object {
    private String name;
    private String surname;
    private LocalDate birthday;

    private Animal animal;

    public Person() {

    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        //35 godina 3 mjeseca 2 dana
        Period period = birthday.until(today);
        System.out.println("Years = " + period.getYears());
        System.out.println("Months = " + period.getMonths());
        System.out.println("Days = " + period.getDays());
        return period.getYears();
    }
}
