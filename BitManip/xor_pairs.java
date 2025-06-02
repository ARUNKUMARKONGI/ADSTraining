import java.util.Scanner;

public class xor_pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] nums1 = new int[n];
        int[] nums2 = new int[m];

        for (int i = 0; i < n; i++) nums1[i] = sc.nextInt();
        for (int j = 0; j < m; j++) nums2[j] = sc.nextInt();

        int xor_nums1 = 0;
        for (int i = 0; i < n; i++) xor_nums1 ^= nums1[i];

        int xor_nums2 = 0;
        for (int j = 0; j < m; j++) xor_nums2 ^= nums2[j];

        int result = 0;
        if (m % 2 == 1) result ^= xor_nums1;
        if (n % 2 == 1) result ^= xor_nums2;

        System.out.println(result);
    }
}

/* import java.util.Scanner;

public class xor_pairs_naive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] nums1 = new int[n];
        int[] nums2 = new int[m];

        for (int i = 0; i < n; i++) nums1[i] = sc.nextInt();
        for (int j = 0; j < m; j++) nums2[j] = sc.nextInt();

        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result ^= (nums1[i] ^ nums2[j]);
            }
        }

        System.out.println(result);
    }
} */
