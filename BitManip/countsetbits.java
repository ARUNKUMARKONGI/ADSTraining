package BitManip;
import java.util.*;
public class countsetbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            int count =0;
            while(n >0) {
                if(n%2 ==1) count++;
                n = n /2;
            }
            System.out.println(count);
        }
    }
}
// Time complexity: O(log n)
// Space complexity: O(1)

//better approach
/* while(t-- >0) {
    int n = sc.nextInt();
    int count =0;
    while(n >0) {
        if((n&1)==1)
         count++;
        n = n >>1;
    }
    System.out.println(count); */

//optimized
/* import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            int n = sc.nextInt();
            int count =0;
            while(n > 0) {
                n = n & (n -1);
                count++;
            }
            System.out.println(count);
        }
    } */
    // Time complexity: O(k), k = number of set bits
    // Space complexity: O(1)