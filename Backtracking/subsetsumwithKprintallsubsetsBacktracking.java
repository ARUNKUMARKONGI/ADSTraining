package Backtracking;
import java.util.*;

public class subsetsumwithKprintallsubsetsBacktracking {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<Integer> subset = new ArrayList<>();
        int k = 3;
        generateSubsets(nums, 0,k, subset);
    }

    static void generateSubsets(int[] nums, int index,int k, List<Integer> subset) {
        if(k == 0) {
            System.out.println(subset);
            return;
        }
        if (index == nums.length) {
            return;
        }
    
        subset.add(nums[index]);
        generateSubsets(nums, index + 1,k-nums[index], subset);
        subset.remove(subset.size() - 1);
        generateSubsets(nums, index + 1,k, subset);
    }
}