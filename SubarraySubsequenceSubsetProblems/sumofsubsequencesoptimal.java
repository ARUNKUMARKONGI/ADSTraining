package SubarraySubsequenceSubsetProblems;
import java.util.*;
public class sumofsubsequencesoptimal {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        long total = (long)sum * (1L << (n - 1));
        //long res = (long) Math.pow(2, n - 1);
        //print (sum * res)
        System.out.println(total);
    }
}
