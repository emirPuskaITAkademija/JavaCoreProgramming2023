package ba.smoki.three.operator;

/**
 * <p>
 * Unarni operatori:
 * <li>+ </li>
 * <li>- </li>
 * <li>++ </li> pre i post
 * <li>-- </li>
 * <li> ! logički komplement operator</li>
 * </p>
 */
public class UnaryDemo {
    public static void main(String[] args) {
        int number = +23;
        System.out.println(number);
        number = -23;
        System.out.println(number);
        number++;//POST increment
        System.out.println(number);//
        number = 23;
        number++;//PRE increment
        System.out.println(number);
        number = 23;
        System.out.println(number++);//23  -> šalje u konzolu number  a onda uveća za 1
        System.out.println(number);// 24

        boolean success = false;
        System.out.println(!success);
    }
}
