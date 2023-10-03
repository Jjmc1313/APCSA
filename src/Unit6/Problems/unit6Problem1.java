package Unit6.Problems;

public class unit6Problem1 {
    public static void main(String[] args) {
        int[] primeNums = {2, 3, 5, 7, 11, 13, 17, 19};
        System.out.println("Array length: " + primeNums.length);
        System.out.println("The first few prime numbers are:");
        for (int scan = 0; scan < primeNums.length; scan++) {
            System.out.println(primeNums[scan] + " ");
        }
        System.out.println();
    }
}
