package SubsetSubsequenceSubStrings;

import java.util.HashMap;
import java.util.Scanner;

public class longestconsecutivesubsequencewithorder {
    public static void main(String[] args) {
        //solve using hashmap
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        int max_len = 0;

        for(int i = 0; i < n; i++) {
            int curr = arr[i];

            if(map.containsKey(curr - 1)) {
                map.put(curr, map.get(curr - 1) + 1);
            } else {
                map.put(curr, 1);
            }

            max_len = Math.max(max_len, map.get(curr));
        }

        System.out.println(max_len);
    }

    }

    /* 
    Input:7
    1 2 5 3 4 6 7
    Output:
    3
    explaination why output is 3?
    longest consecutive subsequence with order is 1,2,3,4,5,6,7 
    but we have to maintain the order insertion of the elements in the array
     so we can only take 1,2,3 or 2,3,4 or or 5,6,7 
     so the longest consecutive subsequence with order is 3.
     */
