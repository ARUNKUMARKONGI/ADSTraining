package Graphs;

/*input=
1 0 0 0
1 1 0 1
1 0 1 1
0 0 1 1

Output=
1 0 0 0 
1 1 1 1 
1 0 1 1 
1 0 1 1 

*/

import java.util.Scanner;

public class TransitiveClosure {
    static final int V = 4; 

    public static void main(String[] args) {
        int[][] graph = new int[V + 1][V + 1]; // Using 1-based index
        Scanner scanner = new Scanner(System.in);

    
        for (int i = 1; i <= V; i++) {
            for (int j = 1; j <= V; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        transitiveClosure(graph);
 
        for (int i = 1; i <= V; i++) {
            for (int j = 1; j <= V; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    static void transitiveClosure(int[][] graph) {
        
        for (int k = 1; k <= V; k++) {
            for (int i = 1; i <= V; i++) {
                for (int j = 1; j <= V; j++) {
                    graph[i][j] = graph[i][j] | (graph[i][k] & graph[k][j]);
                }
            }
        }
    }
}

// graph[1][4] = graph[1][4] | (graph[1][2] & graph[2][4])
// graph[1][4] = 0 | (1 & 1) => graph[1][4] = 1