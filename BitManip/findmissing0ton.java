package BitManip;

import java.util.*;

public class findmissing0ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(i);
                break;
            }
        }
    }
}
/*  import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int sum = n * (n + 1) / 2;
        int actual_sum = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            actual_sum += nums[i];
        }
        System.out.println(sum - actual_sum);
    }
}


using XOR 
-----------------
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int xor = 0;
        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            xor ^= nums[i];
        }
        System.out.println(xor);
    }
}
*/