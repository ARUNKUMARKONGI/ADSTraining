package SIProblems;
import java.util.Scanner;
public class equal0sand1ssubarray 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            int zeros = 0, ones = 0;
            for(int j=i;j<n;j++){
                if(arr[j]==0) zeros++;
                else ones++;
                if(zeros==ones) count++;
            }
        }
        System.out.println(count);
    }
}


/* import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        for(int i=0;i<n;i++)
            if(a[i]==0) a[i]=-1;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0, count=0;

        for(int i=0;i<n;i++){
            sum += a[i];
            if(map.containsKey(sum))
                count += map.get(sum);
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        System.out.println(count);
    }
}

 */
//why map.put(0,1) because if sum=0 at any point then it means from starting 
//to that point we have equal 0s and 1s so we can count that as a valid subarray
//if arr[]={0,1,0,1} at i=1 sum=0 so from 0 to 1 we have equal 0s and 1s

// if map alreaddy contains key with current sum then gets vaalue and add to count
//map.put(sum,map.getOrDefault(sum,0)+1) if sum is not present in map then put it with value 1
//if sum is already present in map then increase its value by 1