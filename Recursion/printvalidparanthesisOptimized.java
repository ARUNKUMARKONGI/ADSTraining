package Recursion;
import java.util.*;


public class printvalidparanthesisOptimized {
    static void generate(int n, int open, int close, String s) {
        if (s.length() == n) {
            System.out.println(s);
            return;
        }
        if (open < n / 2)
            generate(n, open + 1, close, s + "(");
        if (close < open)
            generate(n, open, close + 1, s + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n must be even
        if (n % 2 != 0) {
            System.out.println("Enter even number only");
            return;
        }
        generate(n, 0, 0, "");
    }
}
