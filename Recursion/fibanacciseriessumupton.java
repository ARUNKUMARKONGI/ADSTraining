package Recursion;

import java.util.*;

public class fibanacciseriessumupton {
    static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++)
            sum += fib(i);
        System.out.println(sum);
    }
}
//or n = 5:
// Fibonacci: 0 1 1 2 3 5
// Sum = 0 + 1 + 1 + 2 + 3 + 5 = 12