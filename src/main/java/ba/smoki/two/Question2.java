package ba.smoki.two;

import java.math.BigDecimal;

public class Question2 {
    public static void main(String[] args) {
        double doubleNumber = 0.3;
        System.out.println(doubleNumber);
        //EKSPLICITNA
        float floatNumber =(float) doubleNumber;
        //AUTOMATSKA
        double thirdNumber = doubleNumber;

        float floatSampleNumber = 0.0f;

        System.out.println(floatSampleNumber);
        double doubleSampleNumber = 0.0;
        System.out.println(doubleSampleNumber);
        boolean comparisonResult  = doubleSampleNumber==floatSampleNumber;
        System.out.println(comparisonResult);

    }
}
