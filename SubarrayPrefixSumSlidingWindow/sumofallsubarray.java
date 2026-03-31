package Arrays1D2DProblems;
import java.util.*;
public class sumofallsubarray {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            long contribution = (long) arr[i] * (i + 1) * (n - i);
            totalSum += contribution;
        }
        
        System.out.println(totalSum);
        sc.close();
    }
}

// arr[i]×(number of starting subarrays)×(number of ending subarrays)
