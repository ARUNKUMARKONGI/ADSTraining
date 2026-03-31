import java.util.*;

public class printsubarrays {
    static void print_subarray(int arr[], int start, int end){
        if(end==arr.length) return;
        if(start>end){
            print_subarray(arr,0,end+1);
        }else{
            for(int i=start;i<=end;i++) 
                System.out.print(arr[i]+" ");
            System.out.println();
            print_subarray(arr,start+1,end);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        print_subarray(arr,0,0);
    }
}
