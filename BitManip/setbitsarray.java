package BitManip;

import java.util.Scanner;

public class setbitsarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count_bits = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int count = 0;
            int num = i;
            while (num > 0) {
                if (num % 2 == 1) count++;
                num = num / 2;
            }
            count_bits[i] = count;
        }

        for (int i = 0; i <= n; i++) {
            System.out.println("Number: " + i + ", Set Bits: " + count_bits[i]);
        }
    }
}

// Time Complexity: O(n × log n) space O(n)

/* 
 
 */