package ba.smoki.four.flow;

import javax.swing.*;

/**
 * <p>
 * Zadatak:
 * Vaš omiljeni profesor pregleda zadatke i fokusira se
 * na to da vam da precizno odgovarajući broj poena na ispitu.
 * Kako greškom ne bih oštetio vas i dao vam 8 iako ste ostvarili
 * broj poena za 7 vi ćete mu olakšati tako što ćete kreirati
 * program koji će mu ponuditi mogućnost da unese ostvareni broj poena
 * a vaš program će reći koja je to ocijena na ispitu.
 * </p>
 */
public class IfElseDemo {
    public static void main(String[] args) {
        String profinUnos = JOptionPane.showInputDialog("Unesite broje poena koje je student ostvario na ispitu");
        int brojPoena = Integer.parseInt(profinUnos);
        // A(10) B(9) C(8) D(7) E(6) F(5)
        char ocjena;
        if (brojPoena >= 90) {
            ocjena = 'A';//10
        } else if (brojPoena >= 80) {
            ocjena = 'B';
        } else if (brojPoena >= 70) {
            ocjena = 'C';
        } else if (brojPoena >= 60) {
            ocjena = 'D';
        } else if (brojPoena >= 50) {
            ocjena = 'E';
        } else {
            ocjena = 'F';
        }
        String message = "Ocjena = " + ocjena;
        JOptionPane.showMessageDialog(null, message);
    }
}
