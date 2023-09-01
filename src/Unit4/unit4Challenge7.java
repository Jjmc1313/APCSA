package Unit4;

import java.util.*;

public class unit4Challenge7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many assignments: ");
        int classes = scan.nextInt();

        float totalAch = 0F;
        float  totalMax = 0F;

        String[] grades = new String[classes];

        for (int i = 0; i < classes; i++) {
            System.out.print("Points: ");
            float gradeIn = scan.nextFloat();

            System.out.print("Total: ");
            float totalPoints = scan.nextFloat();

            totalAch += gradeIn;
            totalMax += totalPoints;
            float assignmentScore = gradeIn/totalPoints;

            if (assignmentScore >= 1F) {
                grades[i] = "A+";
            } else if (assignmentScore >= 0.9F) {
                grades[i] = "A";
            } else if (assignmentScore >= 0.8F) {
                grades[i] = "B";
            } else if (assignmentScore >= 0.7F) {
                grades[i] = "C";
            } else if (assignmentScore >= 0.6F) {
                grades[i] = "D";
            } else if (assignmentScore < 0.6F) {
                grades[i] = "F";
            }

            System.out.println();
        }

        System.out.println("Total Points: " + totalAch + "/" + totalMax);

        System.out.println("Total Grade: " + (Math.round((totalAch/totalMax) * 100)) +"%");

        for (int i = 0; i < classes; i++) {
            System.out.println("Assignment #" + i + ": " + grades[i]);
        }
    }
}
