package Graphs;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSTraversal{
    static int[][] G;       // Adjacency matrix
    static boolean[] visited; // Visited vertices
    static int n;          // Number of vertices

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        
        G = new int[n + 1][n + 1]; // Adjusting to 1-based index
        visited = new boolean[n + 1];


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                G[i][j] = scanner.nextInt();
            }
        }


        int s = scanner.nextInt();
        BFS(s); 

        scanner.close();
    }

    static void BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true; // Mark the starting vertex as visited
        queue.add(start); // Enqueue the starting vertex

        while (!queue.isEmpty()) {
            int current = queue.poll(); // Dequeue a vertex
            System.out.print(current + " "); // Print the current vertex

            // Traverse all adjacent vertices
            for (int j = 1; j <= n; j++) {
                if (!visited[j] && G[current][j] == 1) {
                    visited[j] = true; // Mark as visited
                    queue.add(j); // Enqueue the vertex
                }
            }
        }
    }
}
