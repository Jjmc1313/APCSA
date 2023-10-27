import java.util.*;

public class Unit7Challenge4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> scores = new ArrayList<Integer>();

        boolean quit = false;
        while (!quit) {
            System.out.print("Input a name: ");
            String name = scan.nextLine();
            if (name.equalsIgnoreCase("quit")) {
                quit = true;
            } else {
                names.add(name);
                System.out.print("Input Score: ");
                int score = scan1.nextInt();
                scores.add(score);
            }
        }

        System.out.println();
        int i = 0;
        for (String s : names) {
            System.out.print(s + " " + scores.get(i) + "\n");
            i++;
        }

        int total = 0;
        for (int in : scores) {
            total += in;
        }
        System.out.println("Average: " + (double)total/(scores.size()-1) + "\n");

        Collections.sort(scores);
        System.out.println("Highest: " + scores.get(scores.size()-1));
        System.out.println("Lowest: " + scores.get(0) + "\n");

        int[] occ = new int[100];
        for (int a : scores) {
            occ[a]+=1;
        }
        int o = 0;
        for (int a : occ) {
            if (a != 0) {
                System.out.println(o + " " + a);
            }
            o++;
        }
    }
}
