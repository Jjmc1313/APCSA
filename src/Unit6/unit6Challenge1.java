package Unit6;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class unit6Challenge1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("How many integers: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(10);
        }

        System.out.println("For: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nFor Each: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nLength of Arr: " + arr.length);
        int total = 0;
        for (int i : arr) {
            total += i;
        }

        System.out.println("Total: " + total);
        System.out.println("Average: " + ((float)total)/n);
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("Max Value: " + max);
        System.out.println("Min Value: " + min);
        Arrays.sort(arr);

        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}