

import java.util.*;

public class MinAbsolutedifferenceRecursion {
    static int min_diff = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int total = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        find_diff(arr, n, 0, total);
        System.out.println(min_diff);
    }

    static void find_diff(int[] arr, int i, int sum1, int total) {
        if(i == 0) {
            // Updated condition using 2*sum1 - total
            min_diff = Math.min(min_diff, Math.abs(2 * sum1 - total));
            return;
        }

        find_diff(arr, i - 1, sum1 + arr[i - 1], total);
        find_diff(arr, i - 1, sum1, total);
    }
}
