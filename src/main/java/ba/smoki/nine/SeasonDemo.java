package ba.smoki.nine;

import ba.smoki.nine.human.Person;

public class SeasonDemo {
    public static void main(String[] args) {
        Season ljeto = Season.SUMMER;
        Season ljeto2 = Season.SUMMER;
        Season ljeto3 = Season.SUMMER;
        System.out.println(ljeto2.hashCode());
        System.out.println(ljeto.hashCode());
        System.out.println(ljeto3.hashCode());
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
