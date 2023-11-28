package ba.smoki.eight.oop.inheritance;


//Employee IS A Person
public class Employee extends Person {
    private double salary;


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
