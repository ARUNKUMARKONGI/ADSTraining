import java.util.*;

public class maxxorsubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int max = 0;
        for(int i=0; i<n; i++) {
            int xor = 0;
            for(int j=i; j<n; j++) {
                xor = xor ^ arr[j];
                if(xor > max)
                    max = xor;
            }
        }
        System.out.println(max);
    }
}
