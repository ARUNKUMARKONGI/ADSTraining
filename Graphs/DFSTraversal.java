/*input=5
0 1 1 1 0     
1 0 0 0 1                           
1 0 0 0 1
1 0 0 0 1
0 1 1 1 0
1
output=
1 2 5 3 4
*/

package Graphs;
import java.util.Scanner;

public class DFSTraversal{
    static int[][] G;       
    static boolean[] visited; 
    static int n;       

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        n = scanner.nextInt();
        
        G = new int[n + 1][n + 1]; // Adjust to 1-based index
        visited = new boolean[n + 1];

       
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                G[i][j] = scanner.nextInt();
            }
        }

    
        int s = scanner.nextInt();
        DFS(s); 

        scanner.close();
    }

    static void DFS(int i) {
        System.out.print(i + " "); 
        visited[i] = true; 

    
        for (int j = 1; j <= n; j++) {
            if (visited[j]==false && G[i][j] == 1) {
                DFS(j); 
            }
        }
    }
}
