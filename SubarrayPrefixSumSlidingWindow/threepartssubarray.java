import java.util.*;

public class threepartsequal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int total = 0;
        for (int x : a) total += x;
        if (total % 3 != 0) {
            System.out.println(false);
            return;
        }
        int part = total / 3;
        int count = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum == part) {
                count++;
                sum = 0;
            }
        }
        System.out.println(count >= 3);
    }
}


/* Input
10
3 3 6 5 -2 2 5 1 -9 4

Output
true

Explanation

(3 + 3) = (6) = (5 - 2 + 2 + 5 + 1 - 9 + 4) = 6. */