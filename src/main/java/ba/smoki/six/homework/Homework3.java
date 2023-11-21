package ba.smoki.six.homework;

import java.util.stream.Stream;

public class Homework3 {
    public static void main(String[] args) {
        int[] numbers = {23, 34, 53, 465, 65757, 76, 7, 767, 5, 34, 43, 23, 23, 23, 23, 123, 345, 123244};
        int sum = 0;
        //ENHANCED for loop
       /* for(int number : numbers){
            sum = sum + number;
        }*/
       /* for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            sum = sum + number;
        }*/
        System.out.println("Suma = " + sum);
    }
}
