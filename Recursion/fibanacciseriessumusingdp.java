package Recursion;
import java.util.*;
public class fibanacciseriessumusingdp {
    
    static int fib(int n,int[]dp) {
        if (n <=1)
            return n;

        if(dp[n]!=-1)
        {
        return dp[n];
        }
        return dp[n]=fib(n - 1,dp) + fib(n - 2,dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        int [] dp=new int[n+3];
        Arrays.fill(dp,-1);
        System.out.println(fib(n+2,dp)-1);
    }
}


// For n = 5:
// Fibonacci: 0 1 1 2 3 5
// Sum = 0 + 1 + 1 + 2 + 3 + 5 = 12
// F(7) = 13 → 13 - 1 = 12

// 7th fibanacci number is 13