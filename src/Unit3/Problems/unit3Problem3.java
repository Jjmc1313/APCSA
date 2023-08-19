package Unit3.Problems;

import java.text.NumberFormat;
import java.util.Scanner;

public class unit3Problem3 {
    public static void main(String[] args) {
        final double RATE = 8.00;
        final int STANDARD = 40;
        double pay = 0.0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of hours worked: ");
        int hours = scan.nextInt();
        System.out.println();

        if (hours > STANDARD) {
            pay = (STANDARD * RATE + (hours - STANDARD) * RATE * 2);
        } else {
            pay = hours * RATE;
        }
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.print("Total Pay " + fmt.format(pay));
    }
}
