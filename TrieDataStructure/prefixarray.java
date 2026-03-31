import java.util.*;

public class prefixarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        int[] px = new int[n];
        px[0] = arr[0];

        for(int i=1;i<n;i++) px[i] = px[i-1] ^ arr[i];

        int q = sc.nextInt();

        while(q-- > 0){
            int l = sc.nextInt();
            int r = sc.nextInt();

            if(l==0) System.out.println(px[r]);
            else System.out.println(px[r] ^ px[l-1]);
        }
    }
}