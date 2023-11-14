package ba.smoki.four.flow;

import javax.swing.*;

/**
 * Zadatak: Imate tastaturu od 7 brojeva.
 * Vaš malac/ćerkica mogu stisnuti 1 od tih 7 brojeva.
 * 1 2 3 4 5 6 7
 * Kada god pritisnu broj iskoči naziv dana u sedmici.
 * example:
 * 3 -> "Mittwoch"
 * 4 -> "Donnerstag"
 * <p>
 * 6 -> "Samstag"
 * 7 -> "Sonntag"
 */
public class SwitchDemo {
    public static void main(String[] args) {
        String unos = JOptionPane.showInputDialog("Unesi redni broj dana u sedmici");
        int weekDayNumber = Integer.parseInt(unos);
        String weekDayName;

        switch (weekDayNumber){
            case 1:
                weekDayName = "Lundi";
                break;
            case 2:
                weekDayName = "Mardi";
                break;
            case 3:
                weekDayName = "Mercredi";
                break;
            case 4:
                weekDayName = "Jeudi";
                break;
            case 5:
                weekDayName = "Vendredi";
                break;
            case 6:
                weekDayName = "Samedi";
                break;
            case 7:
                weekDayName = "Dimanche";
                break;
            default:
                weekDayName = "Non trouver";
        }
        JOptionPane.showMessageDialog(null, weekDayName);
    }
}
