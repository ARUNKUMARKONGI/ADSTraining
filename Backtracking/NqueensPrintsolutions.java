package Backtracking;
import java.util.*;

public class NqueensPrintsolutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');
        List<Integer> positions = new ArrayList<>();
        solve(board, 0, n, positions);
    }

    public static boolean is_safe(char[][] board, int row, int col, int n) {
        for(int i = 0; i < row; i++)
            if(board[i][col] == 'Q')
                return false;
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--)
            if(board[i][j] == 'Q')
                return false;
        for(int i = row-1, j = col+1; i >= 0 && j < n; i--, j++)
            if(board[i][j] == 'Q')
                return false;
        return true;
    }

    public static void solve(char[][] board, int row, int n, List<Integer> positions) {
        if(row == n) {
            System.out.println(positions);
            return;
        }
        
        for(int col = 0; col < n; col++) {
            if(is_safe(board, row, col, n)) {
                board[row][col] = 'Q';
                positions.add(col + 1);
                solve(board, row + 1, n, positions);
                board[row][col] = '.';
                positions.remove(positions.size() - 1);
            }
        }
        
    }
}
