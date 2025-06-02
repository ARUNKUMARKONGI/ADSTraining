import java.util.*;

public class xorsumofpairsand{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();

        int xor_sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                xor_sum ^= (arr1[i] & arr2[j]);
            }
        }

        System.out.println(xor_sum);
    }
}

/* import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();

        int xor1 = 0;
        for (int i = 0; i < n; i++) xor1 ^= arr1[i];
        int xor2 = 0;
        for (int i = 0; i < m; i++) xor2 ^= arr2[i];

        System.out.println(xor1 & xor2);
    }
}
 */