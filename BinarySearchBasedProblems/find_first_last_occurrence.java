package BinarySearchBasedProblems;
import java.util.*;

public class find_first_last_occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) nums[i] = sc.nextInt();
        int target = sc.nextInt();

        int first = find_first(nums, target);
        int last = find_last(nums, target);

        System.out.println("[" + first + "," + last + "]");
    }

    static int find_first(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if(nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    static int find_last(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if(nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
