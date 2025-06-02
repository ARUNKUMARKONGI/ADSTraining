package Recursion;
import java.util.*;
public class subsetsumwithKspaceoptimizedfinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();

        boolean[] dp = new boolean[k+1];
        dp[0] = true;

        if (arr[0] <= k) dp[arr[0]] = true;

        for (int i=1; i<n; i++) {
            for (int sum=k; sum>=arr[i]; sum--) {
                if (dp[sum - arr[i]]) {
                    dp[sum] = true;
                }
            }
        }

        System.out.println(dp[k]);
    }
}

