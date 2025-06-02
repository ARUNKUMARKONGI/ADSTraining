package BitManip;

import java.util.*;

public class setbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int num = sc.nextInt();
            int k = sc.nextInt();
            int kbin =1;
            for(int i =1; i< k; i++) {
                kbin *=2;
            }
            if((num & kbin) !=0)
            System.out.println("Yes");
            else System.out.println("No");
        }
    }
}

/* 
O(k) and O(1): It builds a bitmask kbin by multiplying by 2 in a loop until kbin = 2^(k-1).
It’s slower than direct 1 << (k-1) because it uses a loop.
But still faster and cleaner than naive bit extraction by % and /.
 */

//better approach
/* import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            n = n >> (k -1);
            if((n &1) ==1) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
 */

//  best approach (bit masking)
/* import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if((n & (1 << (k -1))) !=0)
             System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
     This is the cleanest and fastest approach using bit masking. 
     It directly checks the bit without shifting or loops.
Time complexity: O(1)
Space complexity: O(1)
 */
