package DynamicProgramming;
import java.util.*;

public class StringPartitioningMinPartitionsDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        HashSet<String> dict = new HashSet<>();
        for (int i = 0; i < n; i++) {
            dict.add(sc.next());
        }

        int len = s.length();
        int[] dp = new int[len + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                String sub = s.substring(j, i);
                if (dp[j] != Integer.MAX_VALUE && dict.contains(sub)) {
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }

        if (dp[len] == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(dp[len]);
        }
    }
}
