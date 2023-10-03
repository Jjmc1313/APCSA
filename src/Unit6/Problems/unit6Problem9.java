package Unit6.Problems;
import java.util.Arrays;

public class unit6Problem9 {
    public static void main(String[] args) {
        char[] charArr = {'g', 'p', 'q', 'c', 'i'};
        int[] intArr = {10, 20, 15, 22, 35};
        double[] doubleArr = {10.2, 15.1, 2.2, 3.5};

        Arrays.sort(charArr);
        Arrays.sort(intArr);
        Arrays.sort(doubleArr);

        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(doubleArr));

        char charKey = 'g';
        int intKey = 22;
        double doubleKey = 1.5;

        System.out.println(charKey + " found at index =" + Arrays.binarySearch(charArr,charKey));
        System.out.println(intKey + " found at index =" + Arrays.binarySearch(intArr,intKey));
        System.out.println(doubleKey + " found at index = " + Arrays.binarySearch(doubleArr, doubleKey));
    }
}
