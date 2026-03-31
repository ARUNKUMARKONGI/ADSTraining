package SubarraySubsequenceSubsetProblems;
import java.util.*;
public class sumofsubarraysoptimal {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        long total = 0;
        for(int i = 0; i < n; i++) {
            total += (long)a[i] * (i + 1) * (n - i);
        }
        System.out.println(total);
    }
}

