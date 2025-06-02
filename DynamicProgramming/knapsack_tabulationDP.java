package DynamicProgramming;
import java.util.*;

public class knapsack_tabulationDP{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();     // number of items
        int W = sc.nextInt();     // max capacity

        int[] profit = new int[n];
        int[] weight = new int[n];
        
        for(int i = 0; i < n; i++) profit[i] = sc.nextInt();
        for(int i = 0; i < n; i++) weight[i] = sc.nextInt();

        int[][] dp = new int[n + 1][W + 1];

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= W; j++) {
                if(weight[i - 1] <= j) {
                    int include = profit[i - 1] + dp[i - 1][j - weight[i - 1]];
                    int exclude = dp[i - 1][j];
                    dp[i][j] = Math.max(include, exclude);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println(dp[n][W]);
    }
}

/* int i = n;
        int j = W;

        System.out.println("Items selected (0-based index):");
        while(i > 0 && j > 0) {
            if(dp[i][j] != dp[i - 1][j]) {
                System.out.println("Item " + (i - 1) + " (profit = " + profit[i - 1] + ", weight = " + weight[i - 1] + ")");
                j = j - weight[i - 1];
            }
            i--;
        } */
