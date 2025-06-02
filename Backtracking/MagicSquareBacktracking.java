package Backtracking;
import java.util.*;
public class MagicSquareBacktracking {
    static int min_cost = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] input = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                input[i][j] = sc.nextInt();

        int[] arr = new int[9];
        boolean[] visited = new boolean[10];

        permutations(arr, visited, 0, input);
        System.out.println(min_cost);
    }

    static void permutations(int[] arr, boolean[] visited, int idx, int[][] input) {
        if (idx == 9) {
            int[][] mat = new int[3][3];
            for (int i = 0; i < 9; i++) {
                mat[i / 3][i % 3] = arr[i];
            }
            if (isMagicSquare(mat, 3)) {
                int cost = compute_cost(mat, input);
                if (cost < min_cost)
                    min_cost = cost;
            }
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[idx] = i;
                permutations(arr, visited, idx + 1, input);
                visited[i] = false;
            }
        }
    }

    static boolean isMagicSquare(int[][] mat, int n) {
        int sumd1 = 0, sumd2 = 0;
        for (int i = 0; i < n; i++) {
            sumd1 += mat[i][i];
            sumd2 += mat[i][n - 1 - i];
        }
        if (sumd1 != sumd2)
            return false;

        for (int i = 0; i < n; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += mat[i][j];
                colSum += mat[j][i];
            }
            if (rowSum != colSum || colSum != sumd1)
                return false;
        }
        return true;
    }

    static int compute_cost(int[][] mat, int[][] input) {
        int cost = 0;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                cost += Math.abs(mat[i][j] - input[i][j]);
        return cost;
    }
}
