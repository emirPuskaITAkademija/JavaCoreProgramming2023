package ba.smoki.three.question;

public class Question {
    public static void main(String[] args) {
        int broj1 = 1;
        int broj2 = 2;
        System.out.println(broj1);
        int result = broj1++ + ++broj2;//4  5
        System.out.println(result);
        System.out.println(result);
    }
}
