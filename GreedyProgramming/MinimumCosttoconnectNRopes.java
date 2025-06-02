package GreedyProgramming;
import java.util.*;
public class MinimumCosttoconnectNRopes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        int total_cost = 0;

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int cost = first + second;
            total_cost += cost;
            pq.add(cost);
        }

        System.out.println(total_cost);
    }
}

