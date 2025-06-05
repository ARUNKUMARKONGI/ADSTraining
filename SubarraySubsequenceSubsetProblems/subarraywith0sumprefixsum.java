package SubarraySubsequenceSubsetProblems;
import java.util.*;
public class subarraywith0sumprefixsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        HashSet<Integer> seen = new HashSet<>();
        int prefix = 0;
        boolean found = false;

        for(int i = 0; i < n; i++) {
            prefix += a[i];
            if(prefix == 0 || seen.contains(prefix)) {
                found = true;
                break;
            }
            seen.add(prefix);
        }
        System.out.println(found);
    }
}
