package ba.smoki.five;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] brojevi = new int[3];
        brojevi[0] = 23;
        brojevi[1] = 1;
        brojevi[2] = 10;
        brojevi[2] = 'f';
        //231
        System.out.println(brojevi[0]  +""+ brojevi[1]);
        System.out.format("%s%s%n", brojevi[0], brojevi[1]);
    }
}
