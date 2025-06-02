package Recursion;
import java.util.*;

public class subsetsumwithKMinSubset {
    static int[][] dp;
    static int inf = (int)1e9;

    public static int subset_sum(int[] a, int i, int k) {
        if (k == 0) return 0;
        if (i < 0) return inf;
        if (dp[i][k] != -1) return dp[i][k];

        int not_pick = subset_sum(a, i - 1, k);
        int pick = inf;
        if (a[i] <= k)
            pick = 1 + subset_sum(a, i - 1, k - a[i]);

        return dp[i][k] = Math.min(pick, not_pick);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int k = sc.nextInt();

        dp = new int[n][k + 1];
        for (int i = 0; i < n; i++)
            Arrays.fill(dp[i], -1);

        int ans = subset_sum(a, n - 1, k);
        System.out.println(ans >= inf ? -1 : ans);
    }
}


/* recurive approach
 * import java.util.*;

public class min_subset_sum_recursive_no_dp {
    static int inf = (int)1e9;

    public static int subset_sum(int[] a, int i, int k) {
        if (k == 0) return 0;
        if (i <= 0) return inf;

        int not_pick = subset_sum(a, i - 1, k);
        int pick = inf;
        if (a[i] <= k)
            pick = 1 + subset_sum(a, i - 1, k - a[i]);

        return Math.min(pick, not_pick);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int k = sc.nextInt();

        int ans = subset_sum(a, n - 1, k);
        System.out.println(ans >= inf ? -1 : ans);
    }
}

 */