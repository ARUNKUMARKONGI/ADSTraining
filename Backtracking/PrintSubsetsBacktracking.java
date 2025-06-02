package Backtracking;

import java.util.*;

public class PrintSubsetsBacktracking {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<Integer> subset = new ArrayList<>();
        generateSubsets(nums, 0, subset);
    }

    static void generateSubsets(int[] nums, int index, List<Integer> subset) {
        if (index == nums.length) {
            System.out.println(subset);
            return;
        }

        // Option 1: Include nums[index]
        subset.add(nums[index]);
        generateSubsets(nums, index + 1, subset);

        // Backtrack: Remove last added element
        subset.remove(subset.size() - 1);

        // Option 2: explore further options
        generateSubsets(nums, index + 1, subset);
    }
}
/* | Call Stack Level | index | subset (current) | Action                                   | Next calls                                              |
| ---------------- | ----- | ---------------- | ---------------------------------------- | ------------------------------------------------------- |
| 0                | 0     | \[]              | Include `nums[0] = 1`                    | Call `generateSubsets(nums,1,[1])`                      |
| 1                | 1     | \[1]             | Include `nums[1] = 2`                    | Call `generateSubsets(nums,2,[1,2])`                    |
| 2                | 2     | \[1,2]           | Include `nums[2] = 3`                    | Call `generateSubsets(nums,3,[1,2,3])`                  |
| 3                | 3     | \[1,2,3]         | index == nums.length → print `[1, 2, 3]` | Return                                                  |
| 2 (backtrack)    | 2     | \[1,2,3]         | Remove last: 3 → subset = \[1,2]         | Exclude `nums[2]`, call `generateSubsets(nums,3,[1,2])` |
| 3                | 3     | \[1,2]           | index == nums.length → print `[1, 2]`    | Return                                                  |
| 1 (backtrack)    | 1     | \[1,2]           | Remove last: 2 → subset = \[1]           | Exclude `nums[1]`, call `generateSubsets(nums,2,[1])`   |
| 2                | 2     | \[1]             | Include `nums[2] = 3`                    | Call `generateSubsets(nums,3,[1,3])`                    |
| 3                | 3     | \[1,3]           | index == nums.length → print `[1, 3]`    | Return                                                  |
| 2 (backtrack)    | 2     | \[1,3]           | Remove last: 3 → subset = \[1]           | Exclude `nums[2]`, call `generateSubsets(nums,3,[1])`   |
| 3                | 3     | \[1]             | index == nums.length → print `[1]`       | Return                                                  |
| 0 (backtrack)    | 0     | \[1]             | Remove last: 1 → subset = \[]            | Exclude `nums[0]`, call `generateSubsets(nums,1,[])`    |
| 1                | 1     | \[]              | Include `nums[1] = 2`                    | Call `generateSubsets(nums,2,[2])`                      |
| 2                | 2     | \[2]             | Include `nums[2] = 3`                    | Call `generateSubsets(nums,3,[2,3])`                    |
| 3                | 3     | \[2,3]           | index == nums.length → print `[2, 3]`    | Return                                                  |
| 2 (backtrack)    | 2     | \[2,3]           | Remove last: 3 → subset = \[2]           | Exclude `nums[2]`, call `generateSubsets(nums,3,[2])`   |
| 3                | 3     | \[2]             | index == nums.length → print `[2]`       | Return                                                  |
| 1 (backtrack)    | 1     | \[2]             | Remove last: 2 → subset = \[]            | Exclude `nums[1]`, call `generateSubsets(nums,2,[])`    |
| 2                | 2     | \[]              | Include `nums[2] = 3`                    | Call `generateSubsets(nums,3,[3])`                      |
| 3                | 3     | \[3]             | index == nums.length → print `[3]`       | Return                                                  |
| 2 (backtrack)    | 2     | \[3]             | Remove last: 3 → subset = \[]            | Exclude `nums[2]`, call `generateSubsets(nums,3,[])`    |
| 3                | 3     | \[]              | index == nums.length → print `[]`        | Return                                                  |
 */