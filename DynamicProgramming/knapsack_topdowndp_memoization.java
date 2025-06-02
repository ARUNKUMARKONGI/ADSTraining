package DynamicProgramming;

import java.util.*;

public class knapsack_topdowndp_memoization {
    public static int knapsack(int n, int W, int[] wt, int[] val, int[][] dp) {
        if(n == 0 || W == 0)
            return 0;

        if(dp[n][W] != -1)
            return dp[n][W];

        if(wt[n - 1] > W)
            dp[n][W] = knapsack(n - 1, W, wt, val, dp);
        else {
            int include = val[n - 1] + knapsack(n - 1, W - wt[n - 1], wt, val, dp);
            int exclude = knapsack(n - 1, W, wt, val, dp);
            dp[n][W] = Math.max(include, exclude);
        }

        return dp[n][W];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] wt = new int[n];
        int[] val = new int[n];

        for(int i = 0; i < n; i++) wt[i] = sc.nextInt();
        for(int i = 0; i < n; i++) val[i] = sc.nextInt();
        int W = sc.nextInt();

        int[][] dp = new int[n + 1][W + 1];
        for(int i = 0; i <= n; i++)
            Arrays.fill(dp[i], -1);

        int result = knapsack(n-1, W, wt, val, dp);
        System.out.println("Maximum profit: " + result);
    }
}

