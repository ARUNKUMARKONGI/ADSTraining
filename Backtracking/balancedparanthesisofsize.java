import java.util.*;

public class balancedparanthesisofsize {
    static void solve(int n, int open, int close, String s, List<String> res) {
        if (s.length() == 2 * n) {
            res.add(s);
            return;
        }

        if (open < n) {
            solve(n, open + 1, close, s + "(", res);
        }

        if (close < open) {
            solve(n, open, close + 1, s + ")", res);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> res = new ArrayList<>();
        solve(n, 0, 0, "", res);

        System.out.println(res);
    }
}

/* 1 pair → 2 characters
n pairs → n × 2 characters = 2 * n
 */