package Unit3;

import java.util.Random;

public class unit3Challenge2 {
    public static void main(String[] args) {
        Random r = new Random();
        int result = r.nextInt(101-1) + 1;
        System.out.println(result);
        if (result > 50) {
            System.out.println("Heads!");
        } else {
            System.out.println("Tails!");
        }
    }
}
