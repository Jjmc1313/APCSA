import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Initial Investment (In US$):");
        double initialInv = scan.nextDouble();
        System.out.println("\nInterest Rate (Decimal):");
        double interestRate = scan.nextDouble();
        System.out.println("\nCompounded Annually:");
        int compoundsPYear = scan.nextInt();
        System.out.println("\nYears:");
        int years = scan.nextInt();

        double value = (initialInv * Math.pow((1 + (interestRate/compoundsPYear)), (compoundsPYear * years)));
        System.out.println("Total $: " + (round(value, 2)));
        System.out.println("New $: " + (round(value - initialInv, 2)));
    }

    private static double round (double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
}