package ba.smoki.eight.oop;
//PersonDemo pd1 = new PersonDemo();
//pd1.main(..)
public class PersonDemo {
    public static void main(String[] args) {
        int counter = Person.getCounter();
        System.out.println("Counter = " + counter);//Counter = 0
        Person person1 = new Person("Ismet", "Omerović", 35);
        System.out.println("Counter = "+ person1.getCounter());//Counter = 1
        //this -> person1
        person1.setSurname("Ženino");
        Person person2 = new Person("Mile", "Vukajlović", 27);
        System.out.println("Counter = "+ person1.getCounter());//Counter = 2
        System.out.println("Counter = "+ person2.getCounter());//Counter = 2---- 1,3
        Person person3 = new Person("Nejra", "Kadrić");
        System.out.println("Counter = "+ Person.getCounter());//Counter = 3
        System.out.println("Counter = "+ Person.getCounter());//Counter = 3
        System.out.println("Counter = "+ Person.getCounter());//Counter = 3
        System.out.println("Counter = "+ Person.getCounter());//Counter = 3
        Person person4 = new Person("Kanita", "Berbić");
        System.out.println(person1.getName()+" "+ person1.getSurname()+" " + person1.getAge());
        System.out.println(person2.getName()+" "+ person2.getSurname()+" " + person2.getAge());
        System.out.println(person3.getName()+" "+ person3.getSurname()+" " + person3.getAge());
        System.out.println(person4.getName()+" "+ person4.getSurname()+" " + person3.getAge());
    }
}
