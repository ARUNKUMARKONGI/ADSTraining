package DynamicProgramming;
import java.util.*;

public interface unboundedknapsackforwaddirectionSpaceOPtimized{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] wt = new int[n];
        int[] val = new int[n];
        for(int i = 0; i < n; i++) wt[i] = sc.nextInt();
        for(int i = 0; i < n; i++) val[i] = sc.nextInt();

        int[] dp = new int[w + 1];
        for(int i = 0; i < n; i++) {
            for(int j = wt[i]; j <= w; j++) {
                dp[j] = Math.max(dp[j], val[i] + dp[j - wt[i]]);
            }
        }
        System.out.println(dp[w]);
    }
}

