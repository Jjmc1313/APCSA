package Unit3.Problems;

import java.util.Scanner;

public class unit3Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = scan.nextDouble();
        System.out.println();

        if (number > 0) {
            System.out.println("Number is positive");
            System.out.println("A positive number can be written with a + " + number + " symbol in front of it, or just as a number: " + number);
        } else if (number < 0) {
            System.out.println("Number is negative.");
            System.out.println("When you multiply two negative numbers, the product is always positive: " + "-3 x " + number + "=" + (-3 * number));
        } else {
            System.out.println("Number is 0.");
            System.out.println("It is the only integer and, in fact, the only real number that is neither negative nor positive.");
        }
    }
}
