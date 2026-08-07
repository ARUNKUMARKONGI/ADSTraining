package Backtracking;

import java.util.*;

public class printsubsetslexigocraphically {
    public static void main(String[] args) {
        int[] nums = {1,2, 3};
        List<Integer> subset = new ArrayList<>();
        System.out.println(subset);
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

/* void solve(int arr[], int start, List<Integer> list)
{
		 System.out.println(list);
		 for(int i=start;i<arr.length;i++)
		{
		 list.add(arr[i]);
		 solve(arr,i+1,list);
		 list.remove(list.size()-1);
      }
} */
