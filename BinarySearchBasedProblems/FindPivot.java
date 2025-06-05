package BinarySearchBasedProblems;

/* 
Pivot element is the only element in input array which is smaller than it's previous element.
A pivot element divides a sorted rotated array into two monotonically increasing array.
Find such pivot element using recursive binary search.

input=7
4 5 6 7 1 2 3
output=Pivot element is: 1
*/
import java.util.Scanner;

public class FindPivot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        // Input the elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int pivot = findPivot(arr, 0, n - 1);
        System.out.println("Pivot element is: " + pivot);
        
        scanner.close();
    }

    public static int findPivot(int[] arr, int low, int high) {
        if (low>high) {
            return arr[0]; // Array not rotated, return first element
        }

        if (high == low) {
            return arr[low]; // Only one element left
        }

        int mid = (low + high) / 2;

        // Check if mid+1 is the pivot
        if (mid < high && arr[mid] > arr[mid + 1]) {
            return arr[mid + 1];
        }

        // Check if mid is the pivot
        if (mid > low && arr[mid] < arr[mid - 1]) {
            return arr[mid];
        }

        // Adjust low and high pointers
        if (arr[low] < arr[mid]) {
            return findPivot(arr, mid + 1, high); // Search in the right half
        } else {
            return findPivot(arr, low, mid - 1); // Search in the left half
        }
    }
}
