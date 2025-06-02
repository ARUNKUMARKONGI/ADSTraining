package DynamicProgramming;
import java.util.Scanner;

public class subsetsumwithKTabulation {
    public static boolean subset_sum(int[] arr, int k) {
        int n = arr.length;
        boolean[][] dp = new boolean[n][k + 1];

        for (int i = 0; i < n; i++) dp[i][0] = true;
  // for all other sums, dp[0][sum] remains false by default (boolean array)
        if (arr[0] <= k) dp[0][arr[0]] = true;

        for (int i = 1; i < n; i++) {
            for (int sum = 1; sum <= k; sum++) {
                boolean not_pick = dp[i - 1][sum];
                boolean pick = false;
                if (arr[i] <= sum) {
                    pick = dp[i - 1][sum - arr[i]];
                }
                dp[i][sum] = pick || not_pick;
            }
        }

        return dp[n - 1][k];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(subset_sum(arr, k));
    }
}
