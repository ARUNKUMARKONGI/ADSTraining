package Backtracking;

import java.util.*;

public class printsubsetslexigocraphically {
    public static void main(String[] args) {
        int[] nums = {1,2, 3};
        List<Integer> subset = new ArrayList<>();
        generateSubsets(nums, 0, subset);
    }

    static void generateSubsets(int[] nums, int index, List<Integer> subset) {
        if (index == nums.length) {
            return;
        }
        
        // Option 1: Include nums[index]
        subset.add(nums[index]);
        System.out.println(subset);
        generateSubsets(nums, index + 1, subset);

        // Backtrack: Remove last added element
        subset.remove(subset.size() - 1);

        // Option 2: explore further options
        generateSubsets(nums, index + 1, subset);
    }
}

