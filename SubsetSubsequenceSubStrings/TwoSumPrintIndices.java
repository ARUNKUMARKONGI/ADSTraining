package CollectionsBasicsIntro.hmapproblems;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSumPrintIndices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + " " + i);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("No two numbers found with sum " + target);
    }
}

/* 

input=7
sum=7
array: 1 2 3 4 5 6 7

Third Iteration (i = 2, arr[i] = 3)
complement = 7 - 3 = 4
The complement 4 is not in the map.
Add 3 to the map with its index: map = {1: 0, 2: 1, 3: 2}.
Fourth Iteration (i = 3, arr[i] = 4):

complement = 7 - 4 = 3
The complement 3 exists in the map (we added it in the third iteration with index 2).
We found a valid pair: arr[3] = 4 and arr[2] = 3.
Print the indices: "Indices: 2 3" */