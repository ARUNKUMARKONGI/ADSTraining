package BinarySearchBasedProblems;
import java.util.*;
public class firstoccurrenceoptimized {
 
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();

        int result = findFirstOccurrence(arr, x);
        System.out.println(result);
    }

   

    public static int findFirstOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int result = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == x)
             {
                result = mid;
                if(mid==0)  //reqd if array is 2 or 1 and first mid itself is zero. 
                return 0;
                
                if(arr[mid-1]!=x)
                return mid;
                
                else
                high = mid - 1;            // Update result and keep searching on the low side

            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

}
