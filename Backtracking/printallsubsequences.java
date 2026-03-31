import java.util.*;

public class printallsubsequences {
    static void dfs(int idx, int n, int arr[], List<Integer> temp){
        if(idx==n){
            if(!temp.isEmpty()) System.out.println(temp);
            return;
        }
        dfs(idx+1, n, arr, temp);     
        temp.add(arr[idx]);           
        dfs(idx+1, n, arr, temp);     
        temp.remove(temp.size()-1);   
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        dfs(0, n, arr, new ArrayList<>());
    }
}
