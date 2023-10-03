package Unit6.Problems;

import java.util.*;

public class unit6Problem4 {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("The ize of the array: " + numbers.length);
        for (int index = 0; index < numbers.length; index++) {
            System.out.print("Enter number " + (index+1) + ": ");
            numbers[index] = scan.nextDouble();
        }
        System.out.println("The numbers in reverse order:");
        for (int index = numbers.length-1; index >= 0; index--) {
            System.out.println(numbers[index] + " ");
        }
        System.out.println();
    }
}
