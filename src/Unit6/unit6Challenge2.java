package Unit6;

import java.util.Scanner;

public class unit6Challenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an array to store the counts for integers from 0 to 50
        int[] counts = new int[51];

        // Read integers from the user until they enter a non-integer value
        System.out.println("Integer: (non-integer to stop)");
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();

            // Check if the entered integer is within the range
            if (num >= 0 && num <= 50) {
                // Increment the count for the entered integer
                counts[num]++;
            } else {
                System.out.println("Invalid input.");
            }
        }

        // Print values that were entered one or more times
        System.out.println("Occurrences: ");
        for (int i = 0; i <= 50; i++) {
            if (counts[i] > 0) {
                System.out.println(i + ": " + counts[i] + " occurrences");
            }
        }

        scanner.close();
    }
}
