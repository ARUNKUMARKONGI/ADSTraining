/* Subset with Sum K
Problem: Is there any subset (of size ≥ 1) whose sum equals K?
Not limited to just pairs.
Example: From array [1, 2, 3, 4] and k = 6, subset [2, 4] or [1, 2, 3] are valid. 
The empty subset (no elements selected) has a sum of 0.

By definition of the Subset Sum problem, the empty subset is considered a valid subset when checking for sum = 0.

So, the algorithm should return YES even if the input array is empty or none of the numbers directly add up to 0.


*/
package Recursion;

import java.util.*;

public class subsetsumwithKNaive 
{
    public static boolean subset_sum(int[] arr, int n, int k) {
        if (k == 0) return true;
        if (n == 0) return arr[0] == k;
        boolean not_pick = subset_sum(arr, n - 1, k);
        boolean pick = false;
        if (arr[n] <= k) pick = subset_sum(arr, n - 1, k - arr[n]);
        return pick || not_pick;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(subset_sum(arr, n - 1, k));
    }
}

//for count just return pick+not_pick