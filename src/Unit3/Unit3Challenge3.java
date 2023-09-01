package Unit3;
import java.util.Scanner;

public class Unit3Challenge3 {
    public static void main(String[] args) {
        while(true) {
            Scanner scan = new Scanner(System.in);
            final String ALPHA = "abcdefghijklmnopqrstuvwxyz";

            System.out.println("Input a character: ");
            String inputChar = scan.nextLine();
            String lower = inputChar.toLowerCase();
            System.out.println(inputChar + " is found at index " + (ALPHA.indexOf(lower) + 1));

            if (inputChar.equals("a") || inputChar.equals("e") || inputChar.equals("i") || inputChar.equals("o") || inputChar.equals("u")) {
                System.out.println("Your character is a vowel.");
            } else if (inputChar.equals("y")) {
                System.out.println(("Your character is a consonant and a vowel under certain circumstances."));
            } else {
                System.out.println("Your character is a consonant.");
            }
        }
    }
}
