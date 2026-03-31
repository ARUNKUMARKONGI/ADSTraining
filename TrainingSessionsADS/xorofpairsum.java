package BitManip;
import java.util.*;
public class xorofpairsum 
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                ans ^= (arr[i] + arr[j]);
        System.out.println(ans);
    }
}


/* suppose array size is 2 and elements are 1 and 2
| i | j | arr[i] | arr[j] | arr[i] + arr[j] |
| - | - | ------- | ------- | ----------------- |
| 0 | 0 | 1       | 1       | 2                 |
| 0 | 1 | 1       | 2       | 3                 |
| 1 | 0 | 2       | 1       | 3                 |
| 1 | 1 | 2       | 2       | 4                 |
 
ans = 0 ^ 2 ^ 3 ^ 3 ^ 4
    = ((2 ^ 3) ^ 3) ^ 4
    = (1 ^ 3) ^ 4
    = 2 ^ 4
    = 6
    
    
optimized approach
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; i++) 
        ans ^= arr[i];
        System.out.println(ans * 2);
    }
}
arr = [5, 1, 2]
ans = 0 ^ 5 = 5  
ans = 5 ^ 1 = 4  
ans = 4 ^ 2 = 6  

result =  6*2 = 12

Approach	Time Complexity	Space Complexity	Description
Naive (Brute)	O(n²)	O(1)	XOR all pairs
Optimized	O(n)	O(1)	XOR all elements × 2*/