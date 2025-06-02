package Backtracking;
import java.util.*;
public class magicsquarenaive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        boolean[] seen = new boolean[n * n + 1];

        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] < 1 || mat[i][j] > n * n || seen[mat[i][j]]) {
                    System.out.println("Not a Magic Matrix");
                    return;
                }
                seen[mat[i][j]] = true;
            }

        if (isMagicSquare(mat, n))
            System.out.println("Magic matrix");
        else
            System.out.println("Not a Magic Matrix");
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
}

