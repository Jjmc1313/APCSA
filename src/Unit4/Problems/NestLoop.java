public class NestLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < i; j++) {
                System.out.println(i + " " + j);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < i; j++) {
                System.out.println(i + " " + j);
            }
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < i; j++) {
                System.out.println(i + " " + j);
                System.out.println("******");
            }
        }

        int T = 0;
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 2*i; j += 2) {
                T += j * i;
                System.out.println("T = " + T);
            }
        }

        final int MAX_ROWS = 10;
        for (int row = 1; row <= MAX_ROWS; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
