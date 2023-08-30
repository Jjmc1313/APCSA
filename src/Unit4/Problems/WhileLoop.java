import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What the limit on the counter?");
        int LIMIT = scan.nextInt();
        int count = 1;
        while (count <= LIMIT) {
            System.out.println(count);
            count += 1;
        }
        System.out.println("Done");
    }
}
