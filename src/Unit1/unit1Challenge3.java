package Unit1;
import java.util.Scanner;

public class unit1Challenge3 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many items?");
        int items = scan.nextInt();

        final double TAX = 0.0825;
        double subTotal = 0;
        double salesTax = 0;
        for (int i = 0; i < items; i++) {
            double input = scan.nextDouble();
            subTotal+=input;
        }

        System.out.println("Subtotal: " + subTotal);
        salesTax = Math.floor(subTotal) * TAX;
        System.out.println("Sales Tax: " + salesTax);
        System.out.println("Total: " + (salesTax + subTotal));
    }
}