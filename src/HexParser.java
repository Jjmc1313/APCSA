import java.util.Random;
import java.util.Scanner;

public class HexParser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("UUID: "); String name = scan.nextLine();

        int[] numbers = new int[7];

        for (int i = 0; i < 7; i++){
            int rand = random(4096, 65535);
            numbers[i] = rand;
            System.out.println(rand);
        }

        for (int i = 0; i < 7; i++) {
            System.out.print(Integer.toHexString(numbers[i]) + ":");
        }
        System.out.print("0000");


    }
    private static int random(int lowerBound, int upperBound) {
        Random rnd = new Random();
        int randV = rnd.nextInt(upperBound - lowerBound + 1) + lowerBound;
        return randV;
    }
}
