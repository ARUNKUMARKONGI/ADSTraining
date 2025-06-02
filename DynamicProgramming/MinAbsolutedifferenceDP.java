package DynamicProgramming;
import java.util.*;
public class MinAbsolutedifferenceDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int total = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        int target = total / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for(int i = 0; i < n; i++) {
            for(int j = target; j >= arr[i]; j--) {
                dp[j] = dp[j] || dp[j - arr[i]];
            }
        }

        int s1 = 0;
        for(int j = target; j >= 0; j--) {
            if(dp[j]) {
                s1 = j;
                break;
            }
        }

        int diff = total - 2 * s1;
        System.out.println(diff);
    }
}

