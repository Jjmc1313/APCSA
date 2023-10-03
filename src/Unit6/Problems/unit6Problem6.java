package Unit6.Problems;

import java.util.Arrays;

public class unit6Problem6 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{1,2,3,4,5};
        int[] arr3 = new int[]{1,2,4,3,7};

        System.out.println("is arr1 equals to arr2: " + Arrays.equals(arr1, arr2));
        System.out.println("is arr2 equals to arr3: " + Arrays.equals(arr2, arr3));

        int ar[] = {2,2,1,8,3,2,2,4,2};
        Arrays.fill(ar, 10);
        System.out.println("Array completely filled" + " with 10\n" + Arrays.toString(ar));
    }
}
