package ba.smoki.three.question;
/*
 ==
 */
public class Question3 {
    public static void main(String[] args) {
        char slovo = 'E';
        char drugoSlovo = 69;
        System.out.println(slovo==drugoSlovo);

        String ime1 = new String("Mile");
        String ime2 = "Mile";//String literal
        String ime3 = "Mile";
        System.out.println(ime1 == ime2);//false
        System.out.println(ime2 == ime3);//true
        System.out.println(ime1.equals(ime2));//true
        System.out.println(ime2.equals(ime3));//true
    }
}
