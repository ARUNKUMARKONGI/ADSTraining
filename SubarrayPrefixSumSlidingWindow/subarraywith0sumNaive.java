package SubarraySubsequenceSubsetProblems;
import java.util.*;
public class subarraywith0sumNaive{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        boolean found = false;
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                sum += a[j];
                if(sum == 0) {
                    found = true;
                    break;
                }
            }
            if(found)
                break;
        }
        System.out.println(found);
    }
}

