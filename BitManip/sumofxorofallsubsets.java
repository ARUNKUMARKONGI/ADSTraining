import java.util.*;

public class sumofxorofallsubsets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int or=0;
        for(int i=0;i<n;i++){
            or=or|arr[i];
        }
        int result=or*(1<<(n-1));
        System.out.println(result);
    }
}

/* import java.util.*;

public class Main {
    static int solve(int arr[], int index, int curr){
        if(index==arr.length) return curr;
        int include=solve(arr,index+1,curr^arr[index]);
        int exclude=solve(arr,index+1,curr);
        return include+exclude;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(solve(arr,0,0));
    }
} */