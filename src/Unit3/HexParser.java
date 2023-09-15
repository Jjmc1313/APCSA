package Unit3;

import java.util.Random;
import java.util.Scanner;

public class HexParser {
    public static void main(String[] args) {
        ipv6();
    }

    private static int random(int lowerBound, int upperBound) {
        Random rnd = new Random();
        int randV = rnd.nextInt(upperBound - lowerBound + 1) + lowerBound;
        return randV;
    }

    private static String ipv6() {
        final String ANSI_RED_BACKGROUND = "\u001B[41m";

        Scanner scan = new Scanner(System.in);

        System.out.print("UUID: ");
        String name = scan.nextLine();
        System.out.println();

        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(random(350, 750)); //Random "load" time
                System.out.print("Searching");
                if (i == 0) {
                    System.out.println(".");
                } else if (i == 1) {
                    System.out.println("..");
                } else {
                    System.out.println("...\n");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.print(name + "'s IPv6 is: ");

        int zeroes = random(1,4); // Determines how many zero groups

        int[] numbers = new int[(8 - zeroes)];

        for (int i = 0; i < (8 - zeroes); i++){
            int rand = random(4096, 65535); // Generates a random hex number between 0x1000 & 0xFFFF
            numbers[i] = rand;
        }
        for (int i = 0; i < (8 - zeroes); i++) {
            System.out.print(ANSI_RED_BACKGROUND);
            System.out.print((Integer.toHexString(numbers[i])).toUpperCase() + ":"); // Converts above rand -> raw toHexString
        }
        for (int i = 0; i < zeroes; i++) {
            if (i == zeroes - 1) {
                System.out.print("0000"); // Appended always to end of string
            } else {
                System.out.print("0000:"); // Appends ':' if not end of string
            }
        }
        return "";
    }
}