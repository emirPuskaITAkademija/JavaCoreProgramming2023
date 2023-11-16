package ba.smoki.five.flow;


import javax.swing.*;

/**
 * TIP    ime_varijable = VRIJEDNOST;
 *
 * Unesemo ime dana u sedmici na NATIVNOM jeziku.
 * Program uzme ime na naški i prebaci na DRUGI JEZIK.
 */
public class SwitchDemo4 {
    public static void main(String[] args) {
        int number = 23;
        String text = """
                s,lf,dlf,
                d,sld,ls
                smfksmflssdsmkslkf slkdsldmslkdmsklf
                sdmskmdskd l 45 787898989 9897 %s+number
                """;


        //ALT+ENTER
        String weekDayName = JOptionPane.showInputDialog("Unesi ime dana u sedmici:");
        String weekDayNameLowerCase = weekDayName.toLowerCase();

        //switch konstrukcija prima -> int, enum,  String 1.7
        //INPUT -> OUTPUT
        String translatedWeekDayName = switch (weekDayNameLowerCase) {
            case "ponedeljak" -> "Ponedeljnik";
            case "utorak" -> "Vtornik";
            case "srijeda" -> "Sreda";
            case "četvrtak" -> "Četverk";
            case "petak" -> "Pjatnik";
            case "subota" -> "Sabbota";
            case "nedelja" -> "Voskresenije";
            default -> "X";
        };
        /*switch (weekDayNameLowerCase){
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
        }*/
        System.out.println(translatedWeekDayName);
    }
}
