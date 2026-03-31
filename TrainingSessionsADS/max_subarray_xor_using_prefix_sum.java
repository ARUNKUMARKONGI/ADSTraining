import java.util.*;

public class max_subarray_xor_using_prefix_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] prefix = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] ^ arr[i];
        }

        int max = prefix[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, prefix[i]);  // XOR from 0 to i
            for (int j = 0; j < i; j++) {
                max = Math.max(max, prefix[i] ^ prefix[j]);
            }
        }

        System.out.println(max);
    }
}
