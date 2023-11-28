package ba.smoki.eight.oop;

public class Person {
    private static int counter = 0;

    private String name;
    private String surname;
    private int age;



    //KONSTRUKTOR SA 2 parametra

    /**
     *
     * Dva konstruktora ispod imaju RALIČIT BROJ PARAMETARA:
     * <li>1. DISTINKCIJA/overloading po BROJU PARAMETARA</li>
     */
    public Person(String ime, String prezime){
        //this.name = ime;
       // this.surname = prezime;
        this(ime, prezime, 0);
    }

    public Person(String ime, String prezime, int age){
        this.name = ime;
        this.surname = prezime;
        this.age = age;
        counter++;
    }

    //Person p1 = new Person(23);
    //Person p2 = new Person("Kamunda");
    //Person p3 = new Person("Modeler");

    /**
     * Dva konstruktora ispod imaju isti BROJ parametara:
     * <li>1. DISTINKCIJA/overloadin po tipu</li>
     *
     */

    public Person(int age){
        this("", "", age);
    }

    public Person(String ime){
        this.name = ime;
    }


//    public Person(String prezime){
//        this.surname = prezime;
//    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void konzumirajBrojeve(int[] brojeve){

    }

    public static int getCounter() {
        return counter;
    }
}
