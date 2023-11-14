package ba.smoki.four.flow;

import javax.swing.*;

public class SwitchDemo2 {
    public static void main(String[] args) {
        String weekDayName = JOptionPane.showInputDialog("Unesi ime dana u sedmici na Francuskom");
        String weekDayNativeName;
        switch (weekDayName.toLowerCase()){
            case "lundi":
                weekDayNativeName = "Ponedeljak";
                break;
            case "mardi":
                weekDayNativeName = "Utorak";
                break;
            case "mercreudi":
                weekDayNativeName = "Srijeda";
                break;
            case "jeudi":
                weekDayNativeName = "Četvrtak";
                break;
            case "vendredi":
                weekDayNativeName = "Petak";
                break;
            case "samedi":
                weekDayNativeName = "Subota";
                break;
            case "dimanche":
                weekDayNativeName = "Nedelja";
                break;
            default:
                weekDayNativeName = "Ponovite unos";
        }
        JOptionPane.showMessageDialog(null, weekDayNativeName);
    }
}
