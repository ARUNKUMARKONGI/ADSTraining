package Recursion;
import java.util.*;
public class knapsackusingRecursion {
    public static int knapsack(int n, int W, int[] wt, int[] val) {
        if(n == 0 || W == 0)
            return 0;
        if(wt[n - 1] > W)
            return knapsack(n - 1, W, wt, val);
        else {
            int include = val[n - 1] + knapsack(n - 1, W - wt[n - 1], wt, val);
            int exclude = knapsack(n - 1, W, wt, val);
            return Math.max(include, exclude);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] wt = new int[n];
        int[] val = new int[n];

        for(int i = 0; i < n; i++) wt[i] = sc.nextInt();
        for(int i = 0; i < n; i++) val[i] = sc.nextInt();
        int W = sc.nextInt();

        int result = knapsack(n, W, wt, val);
        System.out.println("Maximum profit: " + result);
    }
}
