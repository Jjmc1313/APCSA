package Unit4;

import java.util.Random;
import java.util.Scanner;

public class unit4Challenge8 {
    public static void main(String[] args) {
        Scanner betManager = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        float userMoney = 100F;
        boolean validBet = false;
        int bet = 0;
        String betting;
        int number;
        String color;
        String val;

        boolean escape = false;

        while (!escape) {
            int roulette = random(-1, 5); //-1 = 00
            System.out.println("[DEBUG] Roulette: " + roulette);

            while (!validBet) {
                System.out.println("What is your bet?");
                bet = betManager.nextInt();
                if (bet > userMoney) {
                    validBet = false;
                    System.out.println("You don't have that much money!");
                } else {
                    validBet = true;
                }
            }

            System.out.println("What are you betting against?");
            betting = scan.nextLine();
            if (betting.equalsIgnoreCase("number")) {
                System.out.println("What number do you want to bet on?");
                number = scan.nextInt();
                if (number == roulette) {
                    userMoney+=(35F/bet);
                    System.out.print("[DEBUG] Win | UserMoney: $" + userMoney);
                } else {
                    userMoney-=bet;
                    System.out.print("[DEBUG] Lose | UserMoney: $" + userMoney);
                }

            } else if (betting.equalsIgnoreCase("color")) {
                System.out.println("What color are you betting on?");
                color = scan.nextLine();
                if (color.equalsIgnoreCase("red")) {
                    if (roulette == 1 || roulette == 3 || roulette == 5) { // FIND ANOTHER WAY OF DOING THIS

                    }
                }

            } else if (betting.equalsIgnoreCase("count")) {
                System.out.println("Betting high or low?");
                val = scan.nextLine();

            } else if (betting.equalsIgnoreCase("quit")) {
                escape = true;
            }
            validBet = false;
        }
    }

    private static int random(int lowerBound, int upperBound) {
        Random rnd = new Random();
        int randV = rnd.nextInt(upperBound - lowerBound + 1) + lowerBound;
        return randV;
    }
}