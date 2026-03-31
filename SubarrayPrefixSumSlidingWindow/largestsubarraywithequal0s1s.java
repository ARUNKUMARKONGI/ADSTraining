package SubarraySubsequenceSubsetProblems;
import java.util.Scanner;
public class largestsubarraywithequal0s1s {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int maxlen=0;
        for(int i=0;i<n;i++){
            int zero=0, one=0;
            for(int j=i;j<n;j++){
                if(a[j]==0) zero++;
                else one++;
                if(zero==one && (j-i+1)>maxlen)
                    maxlen=j-i+1;
            }
        }
        System.out.println(maxlen);
    }
}

/* prefix sum with hashmap
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        for(int i=0;i<n;i++)
            if(a[i]==0) a[i]=-1;

        Map<Integer,Integer> map = new HashMap<>();
        int sum=0, maxlen=0;
        for(int i=0;i<n;i++){
            sum += a[i];
            if(sum==0) maxlen=i+1;
            if(map.containsKey(sum))
                maxlen = Math.max(maxlen, i - map.get(sum));
            else
                map.put(sum, i);
        }
        System.out.println(maxlen);
    }
}

 */