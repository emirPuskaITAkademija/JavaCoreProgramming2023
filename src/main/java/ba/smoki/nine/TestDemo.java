package ba.smoki.nine;

import ba.smoki.nine.animal.Animal;
import ba.smoki.nine.animal.Cat;
import ba.smoki.nine.animal.Dog;
import ba.smoki.nine.animal.Fish;
import ba.smoki.nine.human.*;

public class TestDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Duck duck = new Duck();
        Penzioner penzioner = new Penzioner();
        penzioner.setAnimal(duck);
                int number = 23;
        //dog je tipa Dog, Animal
        Dog dog = new Dog();
        penzioner.setAnimal(dog);
        Cat cat = new Cat();
        penzioner.setAnimal(cat);
        Employee employee = new Employee();
        Cat cat2 = new Cat();
        employee.setAnimal(cat2);
        Student student = new Student();
        Rabbit rabbit = new Rabbit();
        student.setAnimal(rabbit);
        penzioner.setAnimal(rabbit);
    }
}
