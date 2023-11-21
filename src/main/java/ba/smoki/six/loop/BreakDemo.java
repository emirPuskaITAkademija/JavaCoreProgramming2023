package ba.smoki.six.loop;

import javax.swing.*;

/**
 * <p>
 *     Zadatak:
 *     Imate ponuđen niz brojeva 32, 87, 3, 589, 13, 23, 107876, 2000, 8, 6222, 12.
 *     Treba da dopustite korisniku da unese neki broj i da okuša sreću.
 *     Ukoliko je navedeni broj pronađen da mu saopćite da je srećko.
 *     Ukoliko nije pronađen navedeni broj saopćite da nema sreće.
 * </p>
 */
public class BreakDemo {
    public static void main(String[] args) {
        int[] numbers = {32, 87, 3, 589, 13, 23, 107876, 2000, 8, 6222, 12};
        String korisnickiUnos = JOptionPane.showInputDialog("Unesi cijeli broj i okušaj sreću");
        int enteredNumber = Integer.parseInt(korisnickiUnos);
        boolean sretan = false;
        for(int i=0; i<numbers.length; i++) {
            if (numbers[i] == enteredNumber) {
                sretan = true;
                break;
            }
        }
        String message = sretan ? "Srećko":"Nesrećko";
        /*if(sretan){
            message="Srećko";
        }else{
            message="Nesrećko";
        }*/
        System.out.println(message);
    }
}
