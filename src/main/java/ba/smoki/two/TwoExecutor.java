package ba.smoki.two;

/**
 *   <p>Goruće teme danas:
 *      <ol>
 *          <li>
 *              Tipovi podataka
 *          </li>
 *          <li>
 *              Varijabla ili promjenljiva
 *          </li>
 *      </ol>
       e
 *   </p>
 */
public class TwoExecutor {
    public static void main(String[] args) {
        //Deklaracije varijable
        int number1, number2;
        int number3;
        int number4;
        //Dodjele vrijednosti varijabli
        number2 = 32;
        number1 = 23;
        number3 = 23;
        number4 = 23;
        int number5 = 23;

        /*
        CIJELI BROJEVI
         */
        //Promjenljive  -128  ... 0  ... 127
        byte byteNumber = -128;
        //16 bit
        short maxShortNumber = 32767;//compile error
        short minShortNumber = -32768;
        // 32 bit...DEFAULT CIJELI BROJ TIP
        int number = 100;
        // 64 bit
        long longNumber = 10l;
        /**
         * DECIMALNI BROJEVI
         */
        //32 bit
        float floatNumber = 23.03f;
        //64 bit
        double doubleNumber = 23.03;
        /**
         * CHARACTERS
         */
        char slovo = '!';
        System.out.println("Provjera: " + slovo);
        slovo = 65;
        System.out.println("Provjera:" + slovo);
        slovo = 'A';
        int slovoNumber = slovo;
        System.out.println("Broj: " + slovoNumber);

        /**
         * BOOLEAN
         *
         */
        boolean condition = true;

    }
}
