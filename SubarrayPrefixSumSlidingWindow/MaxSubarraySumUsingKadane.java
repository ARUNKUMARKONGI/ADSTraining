package SIProblems;
import java.util.*;
public class MaxSubarraySumUsingKadane {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int res = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            res = Math.max(res, maxEnding);
        }
        
        System.out.println(res);
    }
}

/* 
Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
Output: 11
Explanation: The subarray {7, -1, 2, 3} has the largest sum 11. */
/* 
Naive approach
------------------
int res = arr[0];
  
for (int i = 0; i < arr.length; i++) {
    int currSum = 0;
    // Inner loop for ending point of subarray
    for (int j = i; j < arr.length; j++) {
        currSum = currSum + arr[j];
      
        // Update res if currSum is greater than res
        res = Math.max(res, currSum);
    }
}
return res; */