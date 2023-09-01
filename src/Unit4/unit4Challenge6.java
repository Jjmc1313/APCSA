package unit4;
import java.util.Scanner;

public class unit4Challenge6 {
    public static void main(String[] args) {
        float total = 0;
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("How many classes do you have?");
        int classes = scan.nextInt();

        String[] grade = new String[classes];

        for (int i = 0; i < classes; i++) {
            System.out.print("Grade: ");
            grade[i] = input.next();

            if (grade[i].equalsIgnoreCase("A+")) {
                total += 4.0F;
            } else if (grade[i].equalsIgnoreCase("A")) {
                total += 4.0F;
            } else if (grade[i].equalsIgnoreCase("A-")) {
                total += 3.7F;
            } else if (grade[i].equalsIgnoreCase("B+")) {
                total += 3.3F;
            } else if (grade[i].equalsIgnoreCase("B")) {
                total += 3.0F;
            } else if (grade[i].equalsIgnoreCase("B-")) {
                total += 2.7F;
            } else if (grade[i].equalsIgnoreCase("C+")) {
                total += 2.3F;
            } else if (grade[i].equalsIgnoreCase("C")) {
                total += 2.0F;
            } else if (grade[i].equalsIgnoreCase("C-")) {
                total += 1.7F;
            } else if (grade[i].equalsIgnoreCase("D+")) {
                total += 1.3F;
            } else if (grade[i].equalsIgnoreCase("D")) {
                total += 1.0F;
            } else if (grade[i].equalsIgnoreCase("F")) {
                total += 0F;
            }
        }
        System.out.println("GPA:" + (double)(Math.round((total/classes)) * 100) / 100);
    }
}
