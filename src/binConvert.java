import java.util.Scanner;

public class binConvert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input:");
        String input = scan.nextLine();
        System.out.println("Spaces (Y/N):");
        String space = scan.nextLine();
        boolean spaces;
        if (space != "Y") { spaces = false;} else {spaces = true;}
        System.out.println(stringToBin(input, spaces));
    }

    private static String stringToBin (String input, boolean spaces) {
        String[] binary;
        binary = new String[input.length()];
        String concatBinary = "";

        if (spaces) {
            for (int i = 0; i < input.length(); i++) {
                binary[i] = Integer.toBinaryString(input.charAt(i));
                concatBinary += binary[i] + " ";}
        } else {
            for (int i = 0; i < input.length(); i++) {
                binary[i] = Integer.toBinaryString(input.charAt(i));
                concatBinary += binary[i];}
        } return (concatBinary);
    }
}
