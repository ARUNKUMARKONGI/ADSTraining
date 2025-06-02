package Backtracking;
import java.util.*;

public class printsubsetslexigocraphically{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        generate(0, arr, temp, ans);
        
        for(List<Integer> subset : ans) {
            System.out.print("[");
            for(int i=0;i<subset.size();i++) {
                System.out.print(subset.get(i));
                if(i != subset.size() - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }

    public static void generate(int idx, int[] arr, List<Integer> temp, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(temp));
        for(int i=idx;i<arr.length;i++) {
            temp.add(arr[i]);
            generate(i+1, arr, temp, ans);
            temp.remove(temp.size()-1);
        }
    }
}

