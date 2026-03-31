/* Prefix Sum Approach */

package SubarrayPrefixSumSlidingWindow;
import java.util.Scanner;
public class sumofsubarraysfromitojinclusive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] pref=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                pref[i]=a[i];
            } else {
                pref[i]=pref[i-1]+a[i];
            }
        }
        int q=sc.nextInt();
        while(q-- >0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int s=0;
            if(l==0){
                s=pref[r];
            } else {
                s=pref[r]-pref[l-1];
            }
            System.out.println(s);
        }
    }
}
/* 
input:
5
2 4 1 3 7
3
0 2
1 4
3 3
output:
7
15
3
Explaination:
Prefix build (loop i = 0 to n-1):

i=0 → pref[0] = 2
i=1 → pref[1] = 6 (2+4)
i=2 → pref[2] = 7 (2+4+1)
i=3 → pref[3] = 10 (2+4+1+3)
i=4 → pref[4] = 17 (2+4+1+3+7)

Queries:

● 0→2
l=0 → s=pref[2]=7

● 1→4
l>0 → s=pref[4]−pref[0] = 17−2=15

● 3→3
l>0 → s=pref[3]−pref[2] = 10−7=3


The formula works because:

• pref[j] includes everything from 1 to j
• pref[i−1] includes everything from 1 to i−1
• subtracting removes the unwanted prefix part
• leaving only i to j
 */