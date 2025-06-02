import java.util.*;
public class MinFibanacciTermsforSumK {
    static List<Integer> fib = new ArrayList<>();

    public static int solve(int k) {
        if (k == 0) return 0;

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < fib.size(); i++) {
            if (fib.get(i) <= k) {
                int res = solve(k - fib.get(i));
                if (res != Integer.MAX_VALUE)
                    min = Math.min(min, 1 + res);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        fib.add(1);
        fib.add(2);
        while (fib.get(fib.size() - 1) <= k) {
            int sz = fib.size();
            int nxt = fib.get(sz - 1) + fib.get(sz - 2);
            fib.add(nxt);
        }

        System.out.println(solve(k));
    }
}

