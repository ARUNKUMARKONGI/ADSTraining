package BinarySearchBasedProblems;
import java.util.*;
public class AggressiveCowsBinarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // number of stalls
        int k = sc.nextInt(); // number of cows
        int[] stalls = new int[n];
        
        for (int i = 0; i < n; i++) {
            stalls[i] = sc.nextInt();
        }
        
        Arrays.sort(stalls);
        
        int low = 1;
        int high = stalls[n - 1] - stalls[0];
        int ans = 0;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (is_possible(stalls, n, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        System.out.println(ans);
    }

    public static boolean is_possible(int[] stalls, int n, int cows, int dist) {
        int count = 1;
        int last_pos = stalls[0];
        
        for (int i = 1; i < n; i++) {
            if (stalls[i] - last_pos >= dist) {
                count++;
                last_pos = stalls[i];
            }
        }
        
        return count >= cows;
    }
}

