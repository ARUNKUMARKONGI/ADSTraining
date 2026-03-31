import java.util.*;
public class subarrayswithequal0s1s {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = s.nextInt();

        for(int i=0; i<n; i++){
            if(arr[i] == 0) arr[i] = -1;  // Convert 0 to -1
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // prefix sum 0 occurs once
        int sum = 0;
        int count = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(map.containsKey(sum)){
                count += map.get(sum);  // all previous occurrences of this sum form valid subarrays
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }

        System.out.println(count);
    }
}
//sample test case
// Input: [0, 1, 0, 1, 0]
// Output: 6
/* Explanation:
 * The subarrays with equal number of 0s and 1s are:
 * [0, 1], [1, 0], [0, 1], [0, 1, 0, 1], [1, 0, 1], [0, 1, 0]
 * Total count = 6
 */
/* Explanation of the approach:
1. Convert all 0s in the array to -1s. This way, a subarray with equal number of 0s and 1s will have a sum of 0.
2. Use a HashMap to store the frequency of prefix sums encountered while iterating through the array.
3. Initialize the map with (0, 1) to account for the prefix sum of 0 occurring once.
4. For each element in the array, update the prefix sum.    
5. If the prefix sum has been seen before, it means there are subarrays ending at the current index which have a sum of 0. Add the frequency of this prefix sum to the count.
6. Update the frequency of the current prefix sum in the map.
7. Finally, print the count of such subarrays.
8. The time complexity of this approach is O(n) and the space complexity is O(n) due to the HashMap.
*/