package Backtracking;
import java.util.ArrayList;
import java.util.List;

public class subsetsumwithKprintallsubsetsBacktracking {

    static boolean flag = false;
    static void printSubsetSum(int i, int n, int[] set, int targetSum, List<Integer> subset) {
        if (targetSum == 0) {
            flag = true;
            System.out.print("[ ");
            for (int x : subset) System.out.print(x + " ");
            System.out.print("]\n");
            return;
        }
        if (i == n || targetSum < 0) return;

        // Not pick current element
        printSubsetSum(i + 1, n, set, targetSum, subset);

        // Pick current element if <= targetSum
        if (set[i] <= targetSum) {
            subset.add(set[i]);
            printSubsetSum(i + 1, n, set, targetSum - set[i], subset);
            subset.remove(subset.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] set1 = {1, 2, 1};
        int sum1 = 3;
        List<Integer> subset1 = new ArrayList<>();
        System.out.println("Output 1:");
        printSubsetSum(0, set1.length, set1, sum1, subset1);
        System.out.println();
        flag = false;

        int[] set2 = {3, 34, 4, 12, 5, 2};
        int sum2 = 30;
        List<Integer> subset2 = new ArrayList<>();
        System.out.println("Output 2:");
        printSubsetSum(0, set2.length, set2, sum2, subset2);
        if (!flag) System.out.println("There is no such subset");
    }
}
