package Backtracking;

import java.util.*;

public class balanced_parentheses_backtracking {
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
        int n = sc.nextInt();

        if (n % 2 != 0) {
            System.out.println("Invalid. n must be even.");
            return;
        }

        generate(n, 0, 0, "");
    }
}

