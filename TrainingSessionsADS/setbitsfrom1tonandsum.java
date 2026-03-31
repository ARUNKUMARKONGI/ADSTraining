package BitManip;

import java.util.Scanner;

public class setbitsfrom1tonandsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        for (int i = 0; (1 << i) <= n; i++) {
            int cycle_len = 1 << (i + 1);
            int complete_cycles = n / cycle_len;
            total += complete_cycles * (cycle_len / 2);
            int rem = n % cycle_len;
            if (rem >= (1 << i)) {
                total += rem - (1 << i) + 1;
            }
        }
        System.out.println(total);
    }
}
