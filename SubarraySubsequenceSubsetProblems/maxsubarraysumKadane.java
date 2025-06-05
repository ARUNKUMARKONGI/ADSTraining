package SubarraySubsequenceSubsetProblems;
import java.util.*;
public class maxsubarraysumKadane{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int res = arr[0];
        int temp = arr[0];

        for(int i = 1; i < n; i++) {
            temp = Math.max(arr[i], temp + arr[i]);
            res = Math.max(res, temp);
        }

        System.out.println(res);
    }
}

