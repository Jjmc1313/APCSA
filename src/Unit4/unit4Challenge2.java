package Unit4;

import java.util.Scanner;
import java.lang.Math;

public class unit4Challenge2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many integers: ");
        int integers = scan.nextInt();

        for (int i = 1; i <= integers; i ++) {
            System.out.println(i + "^2 = " + (Math.pow(i, 2)));
            System.out.println(i + "^3 = " + (Math.pow(i, 3)));
            System.out.println();
        }
    }
}
