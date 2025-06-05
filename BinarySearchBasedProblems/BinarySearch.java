/* Use binary search when input is sorted, when input is unsorted but either increasing
or decreasing or monotonic, when the output is ordered. */


package BinarySearchBasedProblems;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: sorted array
        System.out.print("Enter number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter " + n + " sorted integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
    
        System.out.print("Enter the element to search for: ");
        int key = scanner.nextInt();
        
    
        int result = binarySearch(array, key);
        
    
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
        
        scanner.close();
    }

    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (array[mid] == key) {
                return mid;
            }
            
            if (array[mid] < key) {
                low = mid + 1;
            }
    
            else {
                high = mid - 1;
            }
        }
        
          return -1;
    }
}








/* When we use (left + right) / 2 directly,
 it could potentially lead to integer overflow if left and right are both large values.
 example:
low = 1,500,000,000
high = 1,600,000,000

mid = (left + right) / 2
sum=1,500,000,000+1,600,000,000=3,100,000,000
Overflow Problem:
 In Java, the maximum value that an int can hold is 2,147,483,647. 
Since 3,100,000,000 exceeds this limit, an integer overflow occurs. 

mid = left + (right - left) / 2
right - left=1,600,000,000−1,500,000,000=100,000,000
(right - left)/2=50,000,000
mid=1,500,000,000+50,000,000=1,550,000,000 this is within integer range
Step-by-step: */