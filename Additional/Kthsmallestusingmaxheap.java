import java.util.*;

public class Kthsmallestusingmaxheap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        int k = sc.nextInt();

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        //PQ by default uses min heap to convert to max heap reverseorder is used
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++) {
                heap.offer(mat[i][j]);
                if(heap.size() > k)
                    heap.poll();
            }

        System.out.println(heap.peek());
    }
}
