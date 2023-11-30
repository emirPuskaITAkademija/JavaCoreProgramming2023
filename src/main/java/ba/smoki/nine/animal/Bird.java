package ba.smoki.nine.animal;

import ba.smoki.nine.Flyable;

public class Bird extends Animal implements Flyable {
    @Override
    public void playSound() {
        System.out.println("čiju čiju..");
    }

    @Override
    public void fly() {
        System.out.println("Ptica leti...");
    }
}
