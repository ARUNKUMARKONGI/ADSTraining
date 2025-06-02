package GreedyProgramming;
import java.util.*;
public class MinFibTermsSumtoK {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(1);
        fib.add(2);
        int a = 1, b = 2;

        while (b <= k) {
            int c = a + b;
            if (c > k) break;
            fib.add(c);
            a = b;
            b = c;
        }

        int count = 0;
        int index = fib.size() - 1;

        while (k > 0) {
            while (index >= 0 && fib.get(index) > k) {
                index--;
            }
            k -= fib.get(index);
            count++;
        }

        System.out.println(count);
    }
}

