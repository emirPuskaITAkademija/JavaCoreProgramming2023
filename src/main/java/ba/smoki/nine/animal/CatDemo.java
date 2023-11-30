package ba.smoki.nine.animal;

import ba.smoki.nine.human.Person;

import java.time.LocalDate;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        int n1 = 23;// mem_lokaciju
        int n2 = 27;
        swap(n1, n2);
        System.out.println("Van funkcije = "+n1);//23
        Person p1 = new Person();
        p1.setName("Ismet");
        p1.setSurname("Omerović");
        p1.setBirthday(LocalDate.of(1988, 1, 1));
        Person p2 = new Person();
        p2.setName("Ismeta");
        p2.setSurname("Omerović");
        p2.setBirthday(LocalDate.of(1988, 1, 1));
        //pass by value of reference
        swap(p1, p2);
        System.out.println(p1.getName());//Ismet ili Ismeta

    }

    //Kad Java radi sa primitivni
    static void swap(int number1 , int number2 ){
        System.out.println("Unutar funkcije = " + number1);//23
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("Unutar funkcije nakon swap = " + number1);//23
    }

    static void swap(Person p1, Person p2){
        Person temp = new Person();
        temp.setName(p1.getName());
        temp.setSurname(p1.getSurname());
        temp.setBirthday(p1.getBirthday());
        p1.setName(p2.getName());
        p1.setSurname(p2.getSurname());
        p1.setBirthday(p2.getBirthday());
        p2.setName(temp.getName());
        p2.setSurname(temp.getSurname());
        p2.setBirthday(temp.getBirthday());
    }
}
