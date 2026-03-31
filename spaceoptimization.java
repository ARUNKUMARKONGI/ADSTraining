import java.util.*;
class spaceoptimization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int slow = arr[0];
        int fast = arr[0];
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow!=fast);
        slow = arr[0];
        while(slow!=fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        System.out.println(slow);
    }
}
/* basic approach
 for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            freq[arr[i]]++;
            if(freq[arr[i]]>1){
                System.out.println(arr[i]);
                return;
            }
    }
     for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    return;
                }
            }        
    */

            /* 
            
            n = 5
arr = [1, 3, 4, 2, 2]
slow = arr[0] = 1
fast = arr[0] = 1
Iteration 1
slow = arr[1] = 3
fast = arr[arr[1]] = arr[3] = 2
Iteration 2
slow = arr[3] = 2
fast = arr[arr[2]] = arr[4] = 2

Now:

slow = 2
fast = 2

→ They meet → cycle detected

Step 2: Find Start of Cycle (Duplicate)

Reset:
slow = arr[0] = 1
fast = 2
Iteration 1
slow = arr[1] = 3
fast = arr[2] = 4
Iteration 2
slow = arr[3] = 2
fast = arr[4] = 2


slow = fast = 2
Final Answer
Duplicate = 2 

Time: O(n)
Space: O(1)

*/