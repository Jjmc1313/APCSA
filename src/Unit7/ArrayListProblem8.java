import java.util.*;
import java.io.File;
import java.util.Scanner;

public class ArrayListProblem8 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> allWords = new ArrayList<String>();
        Scanner input = new Scanner(new File("word.txt"));

        while (input.hasNext()) {
            String word = input.next();
            allWords.add(word);
        }
        System.out.println(allWords);
        for (int i = 0; i < allWords.size(); i++) {
            String word = allWords.get(i);
            if (word.endsWith("s")) {
                allWords.remove(i);
                i--;
            }
        }
        System.out.println(allWords);
    }
}
