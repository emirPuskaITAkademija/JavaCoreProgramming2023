package ba.smoki.five.question;
//Objekat klase Card
//
public class Question2 {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        int number = 2;
        switch (number){
            case 1:

                break;
            case 2:
                //Greška: 1. runtime error i 2. compile error
                numbers[2] = 32;
                break;
            case 3:

                break;

        }

        System.out.println("Nešto se ispisuje");
    }
}
