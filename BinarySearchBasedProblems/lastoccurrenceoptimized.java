package BinarySearchBasedProblems;
import java.util.Arrays;
import java.util.*;
public class lastoccurrenceoptimized {
 
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();

        int result = findlastOccurrence(arr, x);
        System.out.println(result);
    }

   

    public static int findlastOccurrence(int[] arr, int x) {
         int n=arr.length;
        int low = 0, high = arr.length - 1;
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == x)
             {
                if(mid==n-1 || arr[mid+1]!=x)
                return mid;
                else
                low = mid + 1;            // Update result and keep searching on the right side

            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

}
