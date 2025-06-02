package DynamicProgramming;
import java.util.*;
public class MinFibanacciTermsequaltoK{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        List<Integer> fib = new ArrayList<>();
        fib.add(1);
        fib.add(2);
        int a = 1, b = 2;

        while (a + b <= k) {
            int c = a + b;
            fib.add(c);
            a = b;
            b = c;
        }

        int[] dp = new int[k + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= k; i++) {
            for (int f : fib) {
                if (f <= i && dp[i - f] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - f]);
                }
            }
        }

        System.out.println(dp[k]);
    }
}

