package Unit3;

public class unit3Challenge6 {
    public static void main(String[] args) {
        int dieOne = random(1,6);
        System.out.println("Die 1: " + dieOne);
        int dieTwo = random(1,6);
        System.out.println("Die 2: " + dieTwo + "\n");

        if (dieOne % 2 == 0) {
            System.out.println("Die 1 is even");
        } else {
            System.out.println("Die 1 is odd");
        }

        if (dieTwo % 2 == 0) {
            System.out.println("Die 2 is even\n");
        }  else {
            System.out.println("Die 2 is odd\n");
        }

        if (dieOne > dieTwo) {
            System.out.println("Die 1 is greater than Die 2");
        }  else if (dieOne < dieTwo) {
            System.out.println("Die 2 is greater than Die 1");
        } else {
            System.out.println("Both Dies are equal");
        }

        System.out.println("Total: \n" + (dieOne + dieTwo));

        if (dieOne + dieTwo > 7) {
            System.out.println("Total is greater than 7");
        } else if (dieOne + dieTwo < 7) {
            System.out.println("Total is less than 7");
        } else {
            System.out.println("Total is equal to 7");
        }
    }

    public static int random(int lowerBound, int upperBound) {
        java.util.Random rnd = new java.util.Random();
        return (rnd.nextInt(upperBound - lowerBound + 1) + lowerBound);
    }
}
