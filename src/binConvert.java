import java.util.Objects;
import java.util.Scanner;

public class binConvert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input:");
        String input = scan.nextLine();
        System.out.println("Spaces (Y/N):");
        String space = scan.nextLine();
        boolean spaces;
        spaces = Objects.equals(space, "Y");
        System.out.println(stringToBin(input, spaces));
    }

    private static String stringToBin (String input, boolean spaces) {
        String[] binary;
        binary = new String[input.length()];
        StringBuilder concatBinary = new StringBuilder();

        if (spaces) {
            for (int i = 0; i < input.length(); i++) {
                binary[i] = Integer.toBinaryString(input.charAt(i));
                concatBinary.append(binary[i]).append(" ");}
        } else {
            for (int i = 0; i < input.length(); i++) {
                binary[i] = Integer.toBinaryString(input.charAt(i));
                concatBinary.append(binary[i]);}
        } return (concatBinary.toString());
    }
}
