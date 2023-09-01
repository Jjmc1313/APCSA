package Unit4;

import java.util.Scanner;
import java.util.Random;

public class unit4Challenge5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int rand = random(1, 3); // 1ROCK 2PAPER 3SCISSORS
            System.out.println(rand);
            System.out.println("Rock, Paper, or Scissors? (Escape)");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("escape")) {
                break;
            } else if (input.equalsIgnoreCase("rock") && (rand == 1)) {
                System.out.println("Tie");
            } else if (input.equalsIgnoreCase("rock") && (rand == 2)) {
                System.out.println("Lose");
            } else if (input.equalsIgnoreCase("rock") && (rand == 3)) {
                System.out.println("Win");
            } else if (input.equalsIgnoreCase("paper") && (rand == 1)) {
                System.out.println("Win");
            } else if (input.equalsIgnoreCase("paper") && (rand == 2)) {
                System.out.println("Tie");
            } else if (input.equalsIgnoreCase("paper") && (rand == 3)) {
                System.out.println("Lose");
            } else if (input.equalsIgnoreCase("scissors") && (rand == 1)) {
                System.out.println("Lose");
            } else if (input.equalsIgnoreCase("scissors") && (rand == 2)) {
                System.out.println("Win");
            } else if (input.equalsIgnoreCase("scissors") && (rand == 3)) {
                System.out.println("Tie");
            }
        }
    }

    private static int random(int lowerBound, int upperBound) {
        Random rnd = new Random();
        int randV = rnd.nextInt(upperBound - lowerBound + 1) + lowerBound;
        return randV;
    }
}
