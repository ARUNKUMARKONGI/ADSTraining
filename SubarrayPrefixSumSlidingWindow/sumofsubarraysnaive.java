package SubarraySubsequenceSubsetProblems;
import java.util.*;
public class sumofsubarraysnaive {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int total = 0;
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                sum += a[j];
                total += sum;
            }
        }
        System.out.println(total);
    }
}
