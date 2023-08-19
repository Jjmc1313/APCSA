package Unit3.Problems;

public class unit3Problem1 {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println(true && false);

        System.out.println("\n" + (false || false));
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println(2 > 1 || 3 > 4);

        System.out.println("\n" + !(false));
        System.out.println(!(true));
        System.out.println(!(4 <= 10));

        System.out.println("\n" + (!(false) || true && false));
        System.out.println(!(5 < 3 && 4 > 2));
        System.out.println(!(7 < 3 || 8 > 2));
        System.out.println(!(5!=5 && 6!=7));
    }
}
