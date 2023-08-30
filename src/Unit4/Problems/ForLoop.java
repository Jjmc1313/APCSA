public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.print("How many lines ");
            System.out.println("are printed?");
        }

        int total = 25;
        for (int number = 1; number <= (total/2); number++) {
            total = total - number;
            System.out.println(total + " " + number);
        }
        System.out.println("T-minus");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + ",");
        }
        System.out.println("Blastoff!");
    }
}
