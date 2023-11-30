package ba.smoki.eight.oop.inheritance;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(){}


    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
