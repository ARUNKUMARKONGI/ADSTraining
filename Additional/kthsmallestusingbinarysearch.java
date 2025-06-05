import java.util.*;

public class Kthsmallestusingbinarysearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        int k = sc.nextInt();

        int low = mat[0][0];
        int high = mat[n-1][n-1];

        while(low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            int row = n - 1, col = 0;
            while(row >= 0 && col < n) {
                if(mat[row][col] <= mid) {
                    count += row + 1;
                    col++;
                } else {
                    row--;
                }
            }
            if(count < k)
                low = mid + 1;
            else
                high = mid;
        }

        System.out.println(low);
    }
}
