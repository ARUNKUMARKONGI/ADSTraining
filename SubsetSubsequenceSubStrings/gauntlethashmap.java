/* You have a collection of N gauntlets, each with a specific color represented by A[i]. 
Your goal is to maximize the number of pairs by repeatedly pairing up gauntlets of the same color.
Determine the maximum number of pairs that can be formed.
Constraints:
----------

1 ≤ N ≤ 10^2
1 ≤ A[i] ≤ 10^3


Input:
6
4 1 7 4 1 4
Output:
2

*/
package SIProblems;
import java.util.*;
public class gauntlethashmap {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        
        Map<Integer, Integer> colorCount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            colorCount.put(A[i], colorCount.getOrDefault(A[i], 0) + 1);
        }
        
        int pairs = 0;
        for (int count : colorCount.values()) {
            pairs += count / 2;
        }
        
        System.out.println(pairs);
    }
}

/* 

Calculate Pairs for Each Color:

For color 4: We have 3 gauntlets, so the number of pairs is 3 / 2 = 1. There is 1 leftover gauntlet of color 4 that doesn’t form a pair.
For color 1: We have 2 gauntlets, so the number of pairs is 2 / 2 = 1. There are no leftover gauntlets of color 1.
For color 7: We have 1 gauntlet, so the number of pairs is 1 / 2 = 0. This gauntlet cannot form any pairs.
Sum of Pairs:

Total pairs = 1 (from color 4) + 1 (from color 1) + 0 (from color 7) = 2. */