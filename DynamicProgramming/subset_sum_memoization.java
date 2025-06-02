package DynamicProgramming;

import java.util.*;

public class subset_sum_memoization{
    static int[][] dp;
    static int[] arr;

    public static boolean subset_sum(int i, int k) {
        if (k == 0) return true;
        if (i == 0) return arr[0] == k;
        if (dp[i][k] != -1) return dp[i][k] == 1;

        boolean not_pick = subset_sum(i - 1, k);
        boolean pick = false;
        if (arr[i] <= k) pick = subset_sum(i - 1, k - arr[i]);

        dp[i][k] = (pick || not_pick) ? 1 : 0;
        return dp[i][k] == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();

        dp = new int[n][k + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        System.out.println(subset_sum(n - 1, k));
    }
}

