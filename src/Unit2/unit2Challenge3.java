package Unit2;
import java.util.Scanner;

public class unit2Challenge3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input three strings:");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();
        String fullConcat = str1.concat(str2).concat(str3);
        System.out.println(fullConcat);

        System.out.println("Length of String 1: " + str1.length());
        System.out.println("Length of String 2: " + str2.length());
        System.out.println("Length of String 3: " + str3.length());
        System.out.println("\nAverage of Str1: " + getAverageCharLength(str1));
        System.out.println("Average of Str2: " + getAverageCharLength(str2));
        System.out.println("Average of Str3: " + getAverageCharLength(str3));

        System.out.println("\n" + fullConcat.toLowerCase());
        System.out.println(fullConcat.toUpperCase());

        System.out.println("\nStr1 - Str2: " + str1.compareTo(str2));
        System.out.println("Str1 - Str3: " + str1.compareTo(str3));
        System.out.println("Str2 - Str3: " + str2.compareTo(str3));
    }

    public static double getAverageCharLength(String str) {
        String words[] = str.split(" ");
        int numWords = words.length;
        int totalCharacters = 0;
        for(int i = 0; i < numWords; i++)
            totalCharacters = totalCharacters + words[i].length();

        return totalCharacters/numWords;
    }
}
