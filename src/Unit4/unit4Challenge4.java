package Unit4;

import java.util.Random;
import java.util.Scanner;

public class unit4Challenge4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rand = random(1, 100);
        System.out.println(rand);

        int guess = -1;

        while (guess < rand) {
            System.out.println("Make a guess: ");
            guess = scan.nextInt();

            if (guess ==  rand) {
                System.out.println("You guessed it!");
            } else if (guess > rand) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");

            }
        }
    }
    private static int random(int lowerBound, int upperBound) {
        Random rnd = new Random();
        int randV = rnd.nextInt(upperBound - lowerBound + 1) + lowerBound;
        return randV;
    }
}
