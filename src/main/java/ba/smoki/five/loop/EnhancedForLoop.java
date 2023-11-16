package ba.smoki.five.loop;

import java.util.stream.Stream;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {23, 34, 53, 465, 65757, 76, 7, 767, 5, 34, 43, 23, 23, 23, 23, 123, 345, 123244};
        for(int i = 0; i<numbers.length; i++){
            System.out.println("Broj na indeksu " + i +" ima vrijednost " + numbers[i]);
        }
        //ENHANCED
        for(int vrijednost: numbers){
            System.out.println(vrijednost+" <---");
        }

        /*System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println(numbers[6]);
        System.out.println(numbers[7]);
        System.out.println(numbers[8]);
        System.out.println(numbers[9]);
        System.out.println(numbers[10]);
        System.out.println(numbers[11]);
        System.out.println(numbers[12]);
        System.out.println(numbers[13]);
        System.out.println(numbers[14]);
        System.out.println(numbers[15]);
        System.out.println(numbers[16]);*/
    }
}
