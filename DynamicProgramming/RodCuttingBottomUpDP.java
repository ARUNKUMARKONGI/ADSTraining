package DynamicProgramming;
import java.util.*;
public class RodCuttingBottomUpDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++)
            price[i] = sc.nextInt();
        
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int max_val = Integer.MIN_VALUE;
            for (int j = 1; j <= i; j++) {
                max_val = Math.max(max_val, price[j - 1] + dp[i - j]);
            }
            dp[i] = max_val;
        }
        System.out.println(dp[n]);
    }
}
