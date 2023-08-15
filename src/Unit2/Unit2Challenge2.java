package Unit2;
import java.util.Scanner;

public class Unit2Challenge2 {
    public static void main(String[] args) {
        while(true) {
            Scanner scan = new Scanner(System.in);
            final String ALPHA = "abcdefghijklmnopqrstuvwxyz";

            System.out.println("Input a character: ");
            String inputChar = scan.nextLine();
            String lower = inputChar.toLowerCase();
            System.out.println(inputChar + " is found at index " + (ALPHA.indexOf(lower) + 1));
        }
    }
}
