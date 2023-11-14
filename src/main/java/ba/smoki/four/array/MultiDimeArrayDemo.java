package ba.smoki.four.array;

public class MultiDimeArrayDemo {
    public static void main(String[] args) {
        //Dužina niza nameSurnameArray = 2
        // Dužina prvog elementa na indeksu 0 koji je ponovno niz dužine = 3
        // Dužina drugo elementa na indeksu 1 koji je ponovno niz dužine = 2
        String[][] nameSurnameArray = {
                { "Mr.", "Mrs.", "Ms."},
                {  "Smith", "Jones"}
        };
        //nameSurnameArray = new String[3][3];
        // Mr. Smith
        System.out.println(nameSurnameArray[0][0]+" " + nameSurnameArray[1][0]);
        //Mrs. Jones
        System.out.println(nameSurnameArray[0][1]+" " + nameSurnameArray[1][1]);
    }
}
