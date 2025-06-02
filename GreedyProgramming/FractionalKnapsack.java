package GreedyProgramming;

import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] val = new double[n];
        double[] wt = new double[n];

        for (int i = 0; i < n; i++) {
            val[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextDouble();
        }

        double capacity = sc.nextDouble();

        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            items[i] = new Item(val[i], wt[i]);
        }

        Arrays.sort(items, new Comparator<Item>() {
            public int compare(Item a, Item b) {
                double r1 = a.value / a.weight;
                double r2 = b.value / b.weight;
                if (r1 < r2) return 1;
                else if (r1 > r2) return -1;
                else return 0;
            }
        });

        double result = 0.0;

        for (int i = 0; i < n; i++) {
            if (capacity >= items[i].weight) {
                capacity -= items[i].weight;
                result += items[i].value;
            } else {
                result += items[i].value * (capacity / items[i].weight);
                break;
            }
        }

        System.out.printf("%.6f\n", result);
    }
}

class Item {
    double value;
    double weight;

    Item(double value, double weight) {
        this.value = value;
        this.weight = weight;
    }
}
