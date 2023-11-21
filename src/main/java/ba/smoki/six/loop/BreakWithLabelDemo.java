package ba.smoki.six.loop;

import java.util.Scanner;

public class BreakWithLabelDemo {
    public static void main(String[] args) {
        int[][] dvoDimenzionalniNiz = {
                {32, 87, 3, 589},
                {12, 1076, 2000, 8},
                {622, 127, 77, 955}
        };
        // length = 3 -> int i = 0, 1, 2
        System.out.println("Unesi broj i okušaj sreću");
        int uneseniBroj = new Scanner(System.in).nextInt();
        //3 prolaska kroz petlju
        boolean nasao = false;
        UCIONICA:
        for (int i = 0; i < dvoDimenzionalniNiz.length; i++) {
            int[] niz = dvoDimenzionalniNiz[i];// {12, 1076, 2000, 8}
            //4 prolaska kroz petlju
            for (int j = 0; j < niz.length; j++) {
                int brojIzNiza = niz[j];
                if (brojIzNiza == uneseniBroj) {
                    nasao = true;
                    break UCIONICA;
                }
            }
        }
        //String message = nasao ? "SREĆKO": "NESREĆKO";
        System.out.println(nasao ? "SREĆKO": "NESREĆKO");
    }
}
