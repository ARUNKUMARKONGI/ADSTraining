package Recursion;

import java.util.*;

public class CountPartitionsStringPartitioning {
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
        dp[0] = 1;

        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                String sub = s.substring(j, i);
                if (dict.contains(sub)) {
                    dp[i] += dp[j];
                }
            }
        }

        System.out.println(dp[len]);
    }
}
