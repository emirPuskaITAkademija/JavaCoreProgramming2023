package ba.smoki.five.question;

/**
 * Imamo : String weekDayName = JOptionPane.showInputDialog("Unesi ime dan..");
 * Kako izgleda kontrola ovog inputa ?
 */
public class Question3 {
    public static void main(String[] args) {
        String datum = "01/01/2023";
        switch (datum){
            case "01/01/2023":
                System.out.println("Prvi dan u 2023toj godini");
                break;
            default:
                System.out.println("Nepoznat datum");
        }
    }
}
