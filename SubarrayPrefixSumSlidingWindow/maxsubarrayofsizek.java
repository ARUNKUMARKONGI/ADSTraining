package SubarrayPrefixSumSlidingWindow;

import java.util.*;
class maxsubarrayofsizek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            int sum = 0;
            for(int j=i;j<i+k;j++){
                sum+=arr[j];
            }
            if(sum>max) max=sum;
        }
        System.out.println(max);
    }
}

/*
best approach: sliding window
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int max = sum;
        for(int i=k;i<n;i++){
            sum = sum + arr[i] - arr[i-k];
            if(sum>max) max=sum;
        }
        System.out.println(max);
    }
} */