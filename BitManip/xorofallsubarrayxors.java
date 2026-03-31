import java.util.*;

public class xorofallsubarrayxors{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int result=0;
        for(int i=0;i<n;i++){
            int count=(i+1)*(n-i);
            if(count%2==1){
                result ^= arr[i];
            }
        }
        System.out.println(result);
    }
}

/* import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int result=0;
        for(int i=0;i<n;i++){
            int xor=0;
            for(int j=i;j<n;j++){
                xor ^= arr[j];
                result ^= xor;
            }
        }
        System.out.println(result);
    }
} */