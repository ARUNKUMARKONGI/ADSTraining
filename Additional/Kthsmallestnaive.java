import java.util.*;

public class Kthsmallestnaive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n * n];
        int idx = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[idx++] = mat[i][j];

        Arrays.sort(arr);
        System.out.println(arr[k - 1]);
    }
}
