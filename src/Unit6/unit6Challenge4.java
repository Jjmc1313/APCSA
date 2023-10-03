package Unit6;

import java.util.Random;
import java.util.Arrays;

public class unit6Challenge4 {
    public static void main(String[] args) {
        int cardCount = 0;

        int[] spades = new int[13];
        int[] hearts = new int[13];
        int[] diamonds = new int[13];
        int[] clubs = new int[13];
        for (int i = 0; i < 13; i++) {
            spades[i] = i + 1;
        }
        for (int i = 0; i < 13; i++) {
            hearts[i] = i + 1;
        }
        for (int i = 0; i < 13; i++) {
            diamonds[i] = i + 1;
        }
        for (int i = 0; i < 13; i++) {
            clubs[i] = i + 1;
        }
        /*System.out.println("Full Deck:");
        System.out.println("Spades: " + Arrays.toString(spades));
        System.out.println("Hearts: " + Arrays.toString(hearts));
        System.out.println("Diamonds: " + Arrays.toString(diamonds));
        System.out.println("Clubs: " + Arrays.toString(clubs));*/
        shuffleArray(spades);
        shuffleArray(hearts);
        shuffleArray(diamonds);
        shuffleArray(clubs);
        /*System.out.println("Shuffled Deck:");
        System.out.println("Spades: " + Arrays.toString(spades));
        System.out.println("Hearts: " + Arrays.toString(hearts));
        System.out.println("Diamonds: " + Arrays.toString(diamonds));
        System.out.println("Clubs: " + Arrays.toString(clubs));*/

        int score = 0;
        int eScore = 0;
        for (int i = 0; i < 26; i++) {
            System.out.print("You draw: ");
            int type = random(0, 3);
            int card = random(0, 12);
            if (type == 0) {
                System.out.println("Spades " + spades[card]);
            } else if (type == 1) {
                System.out.println("Hearts " + hearts[card]);
            } else if (type == 2) {
                System.out.println("Diamonds " + diamonds[card]);
            } else if (type == 3) {
                System.out.println("Clubs " + clubs[card]);
            }

            System.out.print("Opponent draws: ");
            int eType = random(0, 3);
            int eCard = random(0, 12);
            if (eType == 0) {
                System.out.println("Spades " + spades[card]);
            } else if (eType == 1) {
                System.out.println("Hearts " + hearts[card]);
            } else if (eType == 2) {
                System.out.println("Diamonds " + diamonds[card]);
            } else if (eType == 3) {
                System.out.println("Clubs " + clubs[card]);
            }

            if (type > eType) {
                System.out.println("Win! ");
                score++;
            } else {
                System.out.println("Lose! ");
                eScore++;
            }
            System.out.println();
        }
        System.out.println("FINAL SCORE: " + "\nYou: " + score + "\nOpponent: " + eScore);
    }
    private static void shuffleArray(int[] array) //Fisher-Yates shuffle array function
    {
        int index;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            if (index != i)
            {
                array[index] ^= array[i];
                array[i] ^= array[index];
                array[index] ^= array[i];
            }
        }
    }
    private static int random(int lowerBound, int upperBound) {
        Random rnd = new Random();
        int randV = rnd.nextInt(upperBound - lowerBound + 1) + lowerBound;
        return randV;
    }
}
