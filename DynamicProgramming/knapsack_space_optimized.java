package DynamicProgramming;

import java.util.*;

public class knapsack_space_optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();     // number of items
        int W = sc.nextInt();     // capacity

        int[] profit = new int[n];
        int[] weight = new int[n];

        for(int i = 0; i < n; i++) profit[i] = sc.nextInt();
        for(int i = 0; i < n; i++) weight[i] = sc.nextInt();

        int[] dp = new int[W + 1];

        for(int i = 0; i < n; i++) {
            for(int j = W; j >= weight[i]; j--) {
                dp[j] = Math.max(dp[j], profit[i] + dp[j - weight[i]]);
            }
        }

        System.out.println(dp[W]);
    }
}
