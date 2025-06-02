import java.util.*;

public class RodCuttingRecursion {
    public static int cut_rod(int[] price, int n) {
        if (n == 0)
            return 0;
        int max_val = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
            max_val = Math.max(max_val, price[i] + cut_rod(price, n - i - 1));
        return max_val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++)
            price[i] = sc.nextInt();
        int result = cut_rod(price, n);
        System.out.println(result);
    }
}
