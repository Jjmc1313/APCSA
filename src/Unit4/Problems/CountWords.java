package Unit4.Problems;

import java.util.Scanner;
import java.util.StringTokenizer;
public class CountWords {
    public static void main(String[] args) {
        int wordCount = 0, characterCount = 0;
        String line, word, done;
        StringTokenizer tokenizer;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter text (type DONE to quit):");
        done = scan.nextLine();
        System.out.println(done);
        line = done.toUpperCase();
        while (!line.equals("DONE")) {
            tokenizer = new StringTokenizer(line);
            while (tokenizer.hasMoreTokens()) {
                word = tokenizer.nextToken();
                wordCount++;
                characterCount += word.length();
            }
            line = scan.nextLine();
            line = line.toUpperCase();
        }
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + characterCount);
    }
}
