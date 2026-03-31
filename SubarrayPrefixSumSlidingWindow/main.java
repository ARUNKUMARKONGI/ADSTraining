package SubarrayPrefixSumSlidingWindow;

import java.util.*;
class maxelementinwindowofsizeksubarray  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        Deque<Integer> dq=new ArrayDeque<Integer>();
        long ans=0;

        for(int i=0;i<n;i++){
            while(dq.size()>0 && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(dq.size()>0 && a[dq.peekLast()]<=a[i]){
                dq.pollLast();
            }
            dq.addLast(i);
            if(i>=k-1){
                ans+=a[dq.peekFirst()];
            }
        }
        System.out.println(ans);
    }
}
/* time complexity: O(n) */