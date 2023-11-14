package ba.smoki.four.array;

import java.util.Arrays;

public class ArrayCopyOfDemo {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 't', 'i', 'n', 'e', 'r'};
        //char[] copyTo = new char[8];
        //System.arraycopy(copyFrom, 2, copyTo, 0, copyTo.length);
        char[] copyTo = Arrays.copyOfRange(copyFrom, 2, 10);
        System.out.println(copyTo);
    }
}
