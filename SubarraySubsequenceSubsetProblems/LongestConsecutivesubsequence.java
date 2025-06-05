package SubarraySubsequenceSubsetProblems;
import java.util.*;
public class LongestConsecutivesubsequence {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int max_len = 0;

        for(int i=0; i<n; i++) {
            int x = arr[i];
            int count = 1;
            for(int j=0; j<n; j++) {
                if(i != j && arr[j] == x + 1) {
                    x++;
                    count++;
                    j = -1; // start again from beginning
                }
            }
            if(count > max_len)
                max_len = count;
        }

        System.out.println(max_len);
    }
}

/* 
2nd approach sorting
------------------------------
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int max_len = 1;
        int curr_len = 1;

        for(int i=1; i<n; i++) {
            if(arr[i] == arr[i-1]) continue;
            else if(arr[i] == arr[i-1] + 1) curr_len++;
            else curr_len = 1;

            if(curr_len > max_len)
                max_len = curr_len;
        }

        System.out.println(max_len);
    }
}

3rd approach
----------------------
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++) set.add(arr[i]);

        int max_len = 0;

        for(int x : set) {
            if(!set.contains(x - 1)) {
                int curr = x;
                int count = 1;
                while(set.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                if(count > max_len)
                    max_len = count;
            }
        }

        System.out.println(max_len);
    }
}

 */