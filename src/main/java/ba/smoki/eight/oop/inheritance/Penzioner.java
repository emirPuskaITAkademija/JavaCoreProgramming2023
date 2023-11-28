package ba.smoki.eight.oop.inheritance;
//RY - Repeat Yourself
//DRY Don't Repeat Yourself
//Penzioner IS A Person
public class Penzioner extends Person{
    private double pensionAmount;


    public void setPensionAmount(double pensionAmount) {
        this.pensionAmount = pensionAmount;
    }

    public double getPensionAmount() {
        return pensionAmount;
    }
}
