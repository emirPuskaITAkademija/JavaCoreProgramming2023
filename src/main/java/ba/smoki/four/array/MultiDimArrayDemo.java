package ba.smoki.four.array;

/**
 * int[] numbers = new int[3]
 *
 *      23 1 10
 *      _  _  _
 *      0  1  2
 *
 *
 *      ___  ___  __
 *       0    1    2
 *
 */
public class MultiDimArrayDemo {
    public static void main(String[] args) {
        int[][]  multiDimArray = new int[3][2];
        multiDimArray[0][0] = 23;
        multiDimArray[0][1] = 10;
        multiDimArray[1][0] = 111;
        multiDimArray[1][1] = 243;
        multiDimArray[2][0] = 10;
        multiDimArray[2][1] = 14;

        int[][][][][] nDimension = new int[2][3][2][34][32];
    }
}
