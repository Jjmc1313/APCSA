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
        int[] redVals = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};

        boolean escape = false;
        while (!escape) {
            int roulette = random(-1, 36); //-1 = 00
            System.out.println("[DEBUG] Roulette: " + roulette);
            boolean isRed = false;
            boolean zero = false;
            if (roulette > 0) {
                for (int i = 0; i < 18; i++){
                    if (roulette == redVals[i]) {
                        isRed = true;
                    }
                }
            } else {
                zero = true;
            }
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
                    userMoney+=bet;
                    System.out.print("[DEBUG] Win | UserMoney: $" + userMoney);
                } else {
                    userMoney-=bet;
                    System.out.print("[DEBUG] Lose | UserMoney: $" + userMoney);
                }
            } else if (betting.equalsIgnoreCase("color")) {
                System.out.println("What color are you betting on?");
                color = scan.nextLine();

                if (color.equalsIgnoreCase("red")) {
                    if (isRed) {
                        userMoney+=bet;
                        System.out.println("[DEBUG] Win | UserMoney: $" + userMoney);
                    } else {
                        userMoney-=bet;
                        System.out.println("[DEBUG] Lose | UserMoney: $" + userMoney);
                    }
                } else if (color.equalsIgnoreCase("black")) {
                    if (isRed) {
                        userMoney-=bet;
                        System.out.println("[DEBUG] Lose | UserMoney: $" + userMoney);
                    } else {
                        userMoney+=bet;
                        System.out.println("[DEBUG] Win | UserMoney: $" + userMoney);
                    }
                } if (zero) {
                    System.out.println("[DEBUG] Received Zero | UserMoney: $" + userMoney);
                }
            } else if (betting.equalsIgnoreCase("count")) {
                System.out.println("Betting high or low?");
                val = scan.nextLine();
                if (val.equalsIgnoreCase("low")) {
                    if (roulette >= 1 && roulette <= 18) {
                        userMoney+=bet;
                        System.out.println("[DEBUG] Win | UserMoney: $" + userMoney);
                    } else {
                        userMoney-=bet;
                        System.out.println("[DEBUG] Lose | UserMoney: $" + userMoney);
                    }
                } else if (val.equalsIgnoreCase("high")) {
                    if (roulette >= 19 && roulette <= 36) {
                        userMoney+=bet;
                        System.out.println("[DEBUG] Win | UserMoney: $" + userMoney);
                    } else {
                        userMoney-=bet;
                        System.out.println("[DEBUG] Lose | UserMoney: $" + userMoney);
                    }
                }
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