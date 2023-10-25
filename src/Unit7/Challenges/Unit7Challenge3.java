import java.util.*;
import java.io.File;
import java.util.Scanner;

public class Unit7Challenge3 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> allWords = new ArrayList<String>();
        Scanner input = new Scanner(new File("words.txt"));

        while (input.hasNext()) {
            String word = input.next();
            allWords.add(word);
        }
        System.out.println(allWords);

        for (String s : allWords) {
            if (s.charAt(0) == 't') {
                System.out.print(s + " ");
            }
        }
        System.out.println();
        for (String s : allWords) {
            if (s.charAt(0) == 's') {
                System.out.print(s + " ");
            }
        }

    }
}
