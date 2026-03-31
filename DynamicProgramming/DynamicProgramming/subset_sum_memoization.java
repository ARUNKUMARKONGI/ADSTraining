package DynamicProgramming;

import java.util.*;

public class subset_sum_memoization{
    static boolean[][] dp;
    static int[] arr;

    public static boolean subset_sum(int i, int k) {
        if (k == 0) return true;
        if (i == -1) return false;
        
        if (dp[i][k]==true) 
        {
        return dp[i][k];
        }

        return dp[i][k]=subset_sum(i-1,k-arr[i])||subset_sum(i-1, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();

        dp = new boolean[n][k + 1];
        //for (int[] row : dp) Arrays.fill(row, -1);

        System.out.println(subset_sum(n - 1, k));
    }
}

