package Backtracking;
import java.util.*;

public class NqueensPrinttheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');
        solve(board, 0, n);
    }

    public static boolean is_safe(char[][] board, int row, int col, int n) {
        for(int i = 0; i < row; i++) //to check horizontal
            if(board[i][col] == 'Q')
                return false;

        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) //to check left diagonal
            if(board[i][j] == 'Q')
                return false;

        for(int i = row-1, j = col+1; i >= 0 && j < n; i--, j++) //to check right diagonal
            if(board[i][j] == 'Q')
                return false;

        return true;
    }

    public static void solve(char[][] board, int row, int n) {
        if(row == n) {
            for(char[] r : board)
                System.out.println(String.valueOf(r));
            System.out.println();
            return;
        }
        //boolean res = false;
        for(int col = 0; col < n; col++) {
            if(is_safe(board, row, col, n)) {
                board[row][col] = 'Q';
                res = solve(board, row + 1, n);
                board[row][col] = '.';
            }
        }
        //return res;
    }
}  