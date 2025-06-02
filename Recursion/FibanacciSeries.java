package Recursion;
import java.util.*;
public class FibanacciSeries {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int a = 0, b = 1;
        System.out.print(a + " " + b);  // print first two Fibonacci numbers
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            System.out.print(" " + sum);  // print next Fibonacci number
            a = b;
            b = sum;
        }
        System.out.println();
        System.out.println("nth Fibonacci number: " + b);
        System.out.println();
    }
}

