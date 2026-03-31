import java.util.Arrays;
import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        Arrays.sort(arr);
        
        int i = 0, j = n - 1;
        while (i < j) {
            int currentSum = arr[i] + arr[j];
            if (currentSum == target) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                i++;
                j--;
            } else if (currentSum < target) {
                i++;
            } else {
                j--;
            }
        }
    }
}

// O(nlogn) for sorting
//2 pointer: O(n/2)
// in general O(nlogn)
//space complexity: O(1)

//using hashmap
//time complexity: O(1)
//space complexity: O(n) as extra space is utilized.

//sample input:
//5
//1 2 3 4 5
//6
//sample output:
//(1, 5)
//(2, 4)

//using hashmap code:
/*
import java.util.*; 
public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
                map.put(complement, map.get(complement) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
    }
}
*/