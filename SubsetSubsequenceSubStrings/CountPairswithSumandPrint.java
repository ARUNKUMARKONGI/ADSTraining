package CollectionsBasicsIntro.hmapproblems;
import java.util.HashMap;
import java.util.Scanner;

public class CountPairswithSumandPrint {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        int cnt = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (freq.containsKey(target - arr[i])) {
                int pairCount = freq.get(target - arr[i]);
                for (int j = 0; j < pairCount; j++) {
                    System.out.println((target - arr[i]) + " " + arr[i]);
                }
                cnt += pairCount;
            }
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        
        System.out.println("Total pairs: " + cnt);
    }
}

