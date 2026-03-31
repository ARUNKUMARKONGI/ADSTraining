package SubarrayPrefixSumSlidingWindow;
import java.util.Scanner;
public class windowmaximumnaive {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        long ans=0;
        for(int i=0;i<=n-k;i++){
            int mx=a[i];
            for(int j=i;j<i+k;j++){
                if(a[j]>mx){
                    mx=a[j];
                }
            }
            ans+=mx;
        }

        System.out.println(ans);
    }
}
/* Naive Approach: O(n*k) */

/* 7 3
2 1 5 3 8 6 4
output:
Windows:
● Window 1 → indices [0,1,2] → [2,1,5] → max = 5
● Window 2 → indices [1,2,3] → [1,5,3] → max = 5
● Window 3 → indices [2,3,4] → [5,3,8] → max = 8
● Window 4 → indices [3,4,5] → [3,8,6] → max = 8
● Window 5 → indices [4,5,6] → [8,6,4] → max = 8

Sum = 5 + 5 + 8 + 8 + 8 = 34 */