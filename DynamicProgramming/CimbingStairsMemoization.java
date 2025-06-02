import java.util.*;
public class CimbingStairsMemoization 
{
    static int[] memo;
    static int count_ways(int n) {
        if (n == 0 || n == 1)
            return 1;
        if (memo[n] != -1)
            return memo[n];
        memo[n] = count_ways(n - 1) + count_ways(n - 2);
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        System.out.println(count_ways(n));
    }
}

