package Unit6;

import java.util.Scanner;

public class unit6Challenge3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rangeCounts = new int[10];

        System.out.println("Enter integers in the range 1 to 100 (non-integer to stop):");

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();

            if (num >= 1 && num <= 100) {

                int rangeIndex = (num - 1) / 10;

                rangeCounts[rangeIndex]++;
            } else {
                System.out.println("Invalid input. Please enter an integer between 1 and 100.");
            }
        }

        for (int i = 0; i < rangeCounts.length; i++) {
            int lowerBound = i * 10 + 1;
            int upperBound = (i + 1) * 10;
            System.out.print(lowerBound + "-" + upperBound + ": ");

            for (int j = 0; j < rangeCounts[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
