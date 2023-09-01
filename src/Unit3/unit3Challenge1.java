package Unit3;

import java.text.NumberFormat;
import java.util.Scanner;

public class unit3Challenge1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat fmt = NumberFormat.getPercentInstance();

        System.out.println("Input Student Name: ");
        String name = scan.nextLine();

        System.out.println("Input Score: ");
        double score = scan.nextDouble();

        System.out.println("Input Total: ");
        double total = scan.nextDouble();

        String percent = fmt.format((score / total));
        if ((score / total) >= 1.00) {
            System.out.println("Name: " + name + "\nScore: " + percent + "\nGrade: A+");
        } else if ((score / total) >= 0.90) {
            System.out.println("Name: " + name + "\nScore: " + percent + "\nGrade: A");
        } else if ((score / total) >= 0.80) {
            System.out.println("Name: " + name + "\nScore: " + percent + "\nGrade: B");
        } else if ((score / total) >= 0.70) {
            System.out.println("Name: " + name + "\nScore: " + percent + "\nGrade: C");
        } else if ((score / total) >= 0.60) {
            System.out.println("Name: " + name + "\nScore: " + percent + "\nGrade: D");
        } else if ((score / total) <= 0.59) {
            System.out.println("Name: " + name + "\nScore: " + percent + "\nGrade: F");
        }
    }
}
