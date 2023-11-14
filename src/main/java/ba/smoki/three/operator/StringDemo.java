package ba.smoki.three.operator;

import javax.swing.*;

public class StringDemo {
    public static void main(String[] args) {
        String ime = JOptionPane.showInputDialog("Unesite svoje ime: ");
        String prezime = JOptionPane.showInputDialog("Unesite svoje prezime: ");
        String result = ime + prezime;
        String formattedResult = ime+" " +prezime;
        String fullName = prezime+","+ime + " : " +1;
        JOptionPane.showMessageDialog(null, fullName);
    }
}
