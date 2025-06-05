package SubarraySubsequenceSubsetProblems;

import java.util.*;

public class longestconsecutive1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String binary = Integer.toBinaryString(num);

        int maxlength = 0;
        int a = 0;

        for(int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1') {
                a++;
                if(a > maxlength)
                    maxlength = a;
            } else {
                a = 0;
            }
        }

        System.out.println(maxlength);
    }
}
// Time: O(log n) → since binary representation has up to log₂(n) bits

//Space: O(log n) → for binary string

/* optimized code
 * import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;

        while(x != 0) {
            x = (x & (x << 1));
            count++;
        }

        System.out.println(count);
    }
}
time O(k) where number of 1s space O(1)
 */