package ba.smoki.five.flow;


import javax.swing.*;

/**
 * Unesemo ime dana u sedmici na NATIVNOM jeziku.
 * Program uzme ime na naški i prebaci na DRUGI JEZIK.
 */
public class SwitchDemo3 {
    public static void main(String[] args) {
        //ALT+ENTER
        String weekDayName = JOptionPane.showInputDialog("Unesi ime dana u sedmici:");
        String weekDayNameLowerCase = weekDayName.toLowerCase();
        String translatedWeekDayName;
        //switch konstrukcija prima -> int, enum,  String 1.7
        //INPUT -> OUTPUT
        switch (weekDayNameLowerCase){
            case "ponedeljak":
                translatedWeekDayName = "Ponedeljnik";
                break;
            case "utorak":
                translatedWeekDayName = "Vtornik";
                break;
            case "srijeda":
                translatedWeekDayName = "Sreda";
                break;
            case "četvrtak":
                translatedWeekDayName = "Četverk";
                break;
            case "petak":
                translatedWeekDayName = "Pjatnik";
                break;
            case "subota":
                translatedWeekDayName = "Sabbota";
                break;
            case "nedelja":
                translatedWeekDayName = "Voskresenije";
                break;
            default:
                translatedWeekDayName ="X";
        }
        System.out.println(translatedWeekDayName);
    }
}
