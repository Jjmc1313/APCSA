package Unit4;

import java.util.Scanner;

public class unit4Challenge6 {
    public static void main(String[] args) {
        float total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many classes do you have?");
        int classes = scan.nextInt();

        for (int i = 0; i < classes; i++) {
            System.out.print("Class" + i + ":");
            String grade = scan.nextLine();

            if (grade.equalsIgnoreCase("A+")) {
                total += 4.0F;
            } else if (grade.equalsIgnoreCase("A")) {
                total += 4.0F;
            } else if (grade.equalsIgnoreCase("A-")) {
                total += 3.7F;
            } else if (grade.equalsIgnoreCase("B+")) {
                total += 3.3F;
            } else if (grade.equalsIgnoreCase("B")) {
                total += 3.0F;
            } else if (grade.equalsIgnoreCase("B-")) {
                total += 2.7F;
            } else if (grade.equalsIgnoreCase("C+")) {
                total += 2.3F;
            } else if (grade.equalsIgnoreCase("C")) {
                total += 2.0F;
            } else if (grade.equalsIgnoreCase("C-")) {
                total += 1.7F;
            } else if (grade.equalsIgnoreCase("D+")) {
                total += 1.3F;
            } else if (grade.equalsIgnoreCase("D")) {
                total += 1.0F;
            } else if (grade.equalsIgnoreCase("F")) {
                total += 0F;
            }
        }

        System.out.println("GPA:\n" + (Math.round((total/classes)) * 100) / 100);
    }
}
